/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framework;

import Bdd.Connexion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vioart Vidoc
 */
public class GenerateModelCsharp {
    public static void generateClassCsharp(Connection co, String tableName, String setCScanner,String userDirectory) throws Exception{
        Fonction_Sup fs = new Fonction_Sup();
        if(co == null){
        co = new Connexion().getConnection();
        } 
        try {
            DatabaseMetaData metaData = co.getMetaData();

            ResultSet columns = metaData.getColumns(null, null, tableName, "%");

            // Obtenir le chemin du répertoire du projet
            String projectDirectory = System.getProperty("user.dir");
            String relativePath = "src.com.cs.models";

            // Convertir le chemin relatif en nom de package
            String packageName = relativePath.replace(File.separator, ".");

            // Ajout du package et des importations
//            String packageName = "com.example"; // Exemple de nom de package
            StringBuilder classContent = new StringBuilder();
            classContent.append("using System;\n");
            classContent.append("namespace ").append(packageName).append(" {\n");

            classContent.append("public class ").append(Fonction_Sup.tableNameToClassName(tableName)).append(" {\n");
            classContent.append(" {\n");
                    // Fields
        while (columns.next()) {
            String columnName = columns.getString("COLUMN_NAME");
            String columnType = Fonction_Sup.sqlTypeToCSharpType(columns.getString("TYPE_NAME"));

            classContent.append("    private ").append(columnType).append(" ").append(columnName).append(";\n");
        }
        // Constructor
        classContent.append("\n    public ").append(Fonction_Sup.tableNameToClassName(tableName)).append("(");
        columns.beforeFirst(); // Reset the cursor
        boolean isFirst = true;
        while (columns.next()) {
            String columnName = columns.getString("COLUMN_NAME");
            String columnType = Fonction_Sup.sqlTypeToCSharpType(columns.getString("TYPE_NAME"));

            if (!isFirst) {
                classContent.append(", ");
            }
            classContent.append(columnType).append(" ").append(columnName);
            isFirst = false;
        }
        classContent.append(") {\n");

        columns.beforeFirst(); // Reset the cursor again
        while (columns.next()) {
            String columnName = columns.getString("COLUMN_NAME");
            classContent.append("        this.").append(columnName).append(" = ").append(columnName).append(";\n");
        }
        classContent.append("    }\n");

        columns.beforeFirst(); // Reset the cursor
        while (columns.next()) {
            String columnName = columns.getString("COLUMN_NAME");
            String columnType = Fonction_Sup.sqlTypeToCSharpType(columns.getString("TYPE_NAME"));

            classContent.append("    public ").append(columnType).append(" ").append(Fonction_Sup.capitalize(columnName)).append(" {\n");
            classContent.append("        get { return ").append(columnName).append("; }\n");
            classContent.append("        set { ").append(columnName).append(" = value; }\n");
            classContent.append("    }\n");
        }

        classContent.append("}\n");

        classContent.append("    }\n");
            classContent.append("}");

                    // Créez un objet File avec le chemin spécifié
        String userDirectorys = userDirectory.replace("/", "\\");
        String csdirectory = userDirectorys+"\\src\\com\\cs\\model";

        String directory = csdirectory+"\\"+setCScanner;

        File csrepertoire = new File(csdirectory);
        File repertoire = new File(directory);

        if (!csrepertoire.exists()) {
            // Créez le répertoire
            csrepertoire.mkdirs();
        } if (!repertoire.exists()) {
            // Créez le répertoire
            repertoire.mkdirs();
        }
            // Write the C# class content to a file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(directory+"\\"+Fonction_Sup.tableNameToClassName(tableName) + ".cs"))) {
                writer.write(classContent.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

            columns.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
