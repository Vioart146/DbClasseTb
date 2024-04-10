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
/**
 *
 * @author Vioart Vidoc
 */
public class GenerateControllerCsharp {
    public static void generateControllerCsharp(String tableName, String projectDirectory) throws IOException {
        // Extraire le nom du projet
        String projectName = Paths.get(projectDirectory).getFileName().toString();
        StringBuilder classContent = new StringBuilder();
        classContent.append("using System;\n");
        classContent.append("using System.Collections.Generic;\n");
        classContent.append("using System.Linq;\n");
        classContent.append("using System.Threading.Tasks;\n");
        classContent.append("using Microsoft.AspNetCore.Mvc;\n");
        classContent.append("using ").append(projectName).append(".Models;\n\n");
        classContent.append("namespace ").append(projectName).append(".Controllers\n");
        classContent.append("{\n");
        classContent.append("    public class ").append(Fonction_Sup.tableNameToClassName(tableName)).append("Controller : Controller\n");
        classContent.append("    {\n");
        classContent.append("        // GET: ").append(Fonction_Sup.tableNameToClassName(tableName)).append("\n");
        classContent.append("        public IActionResult Index()\n");
        classContent.append("        {\n");
        classContent.append("            return View();\n");
        classContent.append("        }\n");
        classContent.append("    }\n");
        classContent.append("}\n");

        String controllerDirectory = projectDirectory + "/Controllers";
        File controllerDir = new File(controllerDirectory);
        if (!controllerDir.exists()) {
            controllerDir.mkdirs();
        }

        String controllerFilePath = controllerDirectory + "/" + Fonction_Sup.tableNameToClassName(tableName) + "Controller.cs";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(controllerFilePath))) {
            writer.write(classContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
