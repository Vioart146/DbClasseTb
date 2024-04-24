package framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenerateViewCsharp {
    public static void generateViewCsharp(Connection co, String projectDirectory) throws IOException, SQLException {
        StringBuilder viewContent = new StringBuilder();
        viewContent.append("@{\n");
        viewContent.append("    ViewData[\"Title\"] = \"Database Structure\";\n");
        viewContent.append("}\n");
        viewContent.append("<h1>Database Structure</h1>\n");
        viewContent.append("<p>List des tables et des colonnes</p>\n");
        viewContent.append("<table class=\"table\">\n");
        viewContent.append("    <thead>\n");
        viewContent.append("        <tr>\n");
        viewContent.append("            <th>Table Name</th>\n");
        viewContent.append("            <th>Column Names</th>\n");
        viewContent.append("        </tr>\n");
        viewContent.append("    </thead>\n");
        viewContent.append("    <tbody>\n");

        DatabaseMetaData metaData = co.getMetaData();
        ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});
        while (tables.next()) {
            String tableName = tables.getString("TABLE_NAME");
            ResultSet columns = metaData.getColumns(null, null, tableName, "%");
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                String columnType = columns.getString("TYPE_NAME");
                viewContent.append("        <tr>\n");
                viewContent.append("            <td>").append(tableName).append("</td>\n");
                viewContent.append("            <td>").append(columnName).append("</td>\n");
                viewContent.append("            <td>").append(columnType).append("</td>\n");
                viewContent.append("        </tr>\n");
            }
            columns.close();
        }

        tables.close();

        viewContent.append("    </tbody>\n");
        viewContent.append("</table>\n");

        String viewDirectory = projectDirectory + "/Views/Home"; // Assurez-vous que le répertoire existe
        File viewDir = new File(viewDirectory);
        if (!viewDir.exists()) {
            viewDir.mkdirs();
        }

        String viewFilePath = viewDirectory + "/index.cshtml";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(viewFilePath))) {
            writer.write(viewContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
