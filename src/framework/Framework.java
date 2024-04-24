/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framework;

import bdd.Connexion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 *
 * @author Vioart Vidoc
 */

public class Framework {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("L'emplacement du projet : ");
        String projectDirectory = scanner.nextLine();

        System.out.print("Le nom de la base de données : ");
        String databaseName = scanner.nextLine();

        // Chemin an le modèle de projet _ source
        String currentDirectory = System.getProperty("user.dir");
        String templatePath = currentDirectory + "/template/csmvc";
//        String sourcePath = "chemin/vers/le/modèle/csmvc";
        // Path an le directory hametrahana an le projet
        String destinationPath = projectDirectory;

        Connection co = new Connexion().getConnection(databaseName);
        DatabaseMetaData metaData = co.getMetaData();
        ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});

        try {
            ProjectTemplateCopier.copyProjectTemplate(templatePath, destinationPath);
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                generateProjectComponents(co, tableName, projectDirectory);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
        tables.close();
        co.close();
    }

    private static void generateProjectComponents(Connection co, String tableName, String projectDirectory) throws Exception {
        GenerateModelCsharp.generateClassCsharp(co, tableName, projectDirectory);
        GenerateControllerCsharp.generateControllerCsharp(tableName, projectDirectory);
        GenerateViewCsharp.generateViewCsharp(co, projectDirectory);
    }
}
