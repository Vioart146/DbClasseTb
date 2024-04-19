/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Vioart Vidoc
 */
public class GenerateViewCsharp {
    public static void generateViewCsharp(String tableName, String projectDirectory) throws IOException {
        StringBuilder viewContent = new StringBuilder();
        viewContent.append("@{\n");
        viewContent.append("    ViewData[\"Title\"] = \"Home page\";\n");
        viewContent.append("}\n");
        viewContent.append("<h1>Database Structure</h1>\n");
        viewContent.append("<p>List of tables and their columns</p>\n");
        viewContent.append("<table class=\"table\">\n");
        viewContent.append("    <thead>\n");
        viewContent.append("        <tr>\n");
        viewContent.append("            <th>Table Name</th>\n");
        viewContent.append("            <th>Column Names</th>\n");
        viewContent.append("        </tr>\n");
        viewContent.append("    </thead>\n");
        viewContent.append("    <tbody>\n");
        // Ici, vous devrez ajouter dynamiquement les lignes pour chaque table et ses colonnes.
        // Cela nécessite de connaître la structure de la base de données à l'avance ou de générer
        // le contenu de la vue en fonction des données réelles de la base de données.
        viewContent.append("    </tbody>\n");
        viewContent.append("</table>\n");

        String viewDirectory = projectDirectory + "/Views/Home"; // Assurez-vous que le répertoire existe
        File viewDir = new File(viewDirectory);
        if (!viewDir.exists()) {
            viewDir.mkdirs();
        }

        String viewFilePath = viewDirectory + "/Index.cshtml";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(viewFilePath))) {
            writer.write(viewContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
