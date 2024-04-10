/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vioart Vidoc
 */
public class GenerateModelCsharp {
    public static void generateClassCsharp(Connection co, String tableName, String projectDirectory) throws Exception {
        // Extraire le nom du projet
        String projectName = Paths.get(projectDirectory).getFileName().toString();

        DatabaseMetaData metaData = co.getMetaData();
        ResultSet columns = metaData.getColumns(null, null, tableName, "%");

        StringBuilder classContent = new StringBuilder();
        classContent.append("using System;\n\n");
        classContent.append("namespace ").append(projectName).append(".Models\n");
        classContent.append("{\n");
        classContent.append("    public class ").append(Fonction_Sup.tableNameToClassName(tableName)).append("\n");
        classContent.append("    {\n");

        while (columns.next()) {
            String columnName = columns.getString("COLUMN_NAME");
            String columnType = Fonction_Sup.sqlTypeToCSharpType(columns.getString("TYPE_NAME"));
            classContent.append("        public ").append(columnType).append(" ").append(Fonction_Sup.capitalize(columnName)).append(" { get; set; }\n");
        }

        classContent.append("    }\n");
        classContent.append("}\n");

        String modelDirectory = projectDirectory + "/Models";
        File modelDir = new File(modelDirectory);
        if (!modelDir.exists()) {
            modelDir.mkdirs();
        }

        String modelFilePath = modelDirectory + "/" + Fonction_Sup.tableNameToClassName(tableName) + ".cs";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(modelFilePath))) {
            writer.write(classContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        columns.close();
    }

}
