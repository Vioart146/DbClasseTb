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

public class GenerateConfigurationFile {

    public static void generateAppSettingsJson(String projectDirectory) throws IOException {
        String content = "{\n" +
                " \"Logging\": {\n" +
                "    \"LogLevel\": {\n" +
                "      \"Default\": \"Information\",\n" +
                "      \"Microsoft\": \"Warning\",\n" +
                "      \"Microsoft.Hosting.Lifetime\": \"Information\"\n" +
                "    }\n" +
                " },\n" +
                " \"AllowedHosts\": \"*\"\n" +
                "}";
        writeFile(projectDirectory + "/appsettings.json", content);
    }

    public static void generateAppSettingsDevelopmentJson(String projectDirectory) throws IOException {
        String content = "{\n" +
                " \"Logging\": {\n" +
                "    \"LogLevel\": {\n" +
                "      \"Default\": \"Debug\",\n" +
                "      \"System\": \"Information\",\n" +
                "      \"Microsoft\": \"Information\"\n" +
                "    }\n" +
                " }\n" +
                "}";
        writeFile(projectDirectory + "/appsettings.Development.json", content);
    }

    public static void generateCsprojFile(String projectName, String projectDirectory) throws IOException {
        String content = "<Project Sdk=\"Microsoft.NET.Sdk.Web\">\n" +
                " <PropertyGroup>\n" +
                "    <TargetFramework>net5.0</TargetFramework>\n" +
                " </PropertyGroup>\n" +
                " <ItemGroup>\n" +
                "    <PackageReference Include=\"Microsoft.AspNetCore.App\" />\n" +
                " </ItemGroup>\n" +
                "</Project>";
        writeFile(projectDirectory + "/" + projectName + ".csproj", content);
    }

    public static void generateSolutionFile(String projectName, String projectDirectory) throws IOException {
        String content = "Microsoft Visual Studio Solution File, Format Version 12.00\n" +
                "# Visual Studio 15\n" +
                "VisualStudioVersion = 15.0.26124.0\n" +
                "MinimumVisualStudioVersion = 10.0.40219.1\n" +
                "Project(\"{FAE04EC0-301F-11D3-BF4B-00C04F79EFBC}\") = \"" + projectName + "\", \"" + projectName + ".csproj\", \"{E24C65DC-7377-472B-9ABA-BC803B73C61A}\"\n" +
                "EndProject\n" +
                "Global\n" +
                "GlobalSection(SolutionConfigurationPlatforms) = preSolution\n" +
                "    Debug|Any CPU = Debug|Any CPU\n" +
                "    Release|Any CPU = Release|Any CPU\n" +
                "EndGlobalSection\n" +
                "GlobalSection(ProjectConfigurationPlatforms) = postSolution\n" +
                "    {E24C65DC-7377-472B-9ABA-BC803B73C61A}.Debug|Any CPU.ActiveCfg = Debug|Any CPU\n" +
                "    {E24C65DC-7377-472B-9ABA-BC803B73C61A}.Debug|Any CPU.Build.0 = Debug|Any CPU\n" +
                "    {E24C65DC-7377-472B-9ABA-BC803B73C61A}.Release|Any CPU.ActiveCfg = Release|Any CPU\n" +
                "    {E24C65DC-7377-472B-9ABA-BC803B73C61A}.Release|Any CPU.Build.0 = Release|Any CPU\n" +
                "EndGlobalSection\n" +
                "GlobalSection(SolutionProperties) = preSolution\n" +
                "    HideSolutionNode = FALSE\n" +
                "EndGlobalSection\n" +
                "EndGlobal\n";
        writeFile(projectDirectory + "/" + projectName + ".sln", content);
    }

    public static void generateProgramCs(String projectName, String projectDirectory) throws IOException {
        String content = "using System;\n" +
                "using Microsoft.AspNetCore.Hosting;\n" +
                "using Microsoft.Extensions.Hosting;\n" +
                "\n" +
                "namespace " + projectName + "\n" +
                "{\n" +
                "    public class Program\n" +
                "    {\n" +
                "        public static void Main(string[] args)\n" +
                "        {\n" +
                "            CreateHostBuilder(args).Build().Run();\n" +
                "        }\n" +
                "\n" +
                "        public static IHostBuilder CreateHostBuilder(string[] args) =>\n" +
                "            Host.CreateDefaultBuilder(args)\n" +
                "                .ConfigureWebHostDefaults(webBuilder =>\n" +
                "                {\n" +
                "                    webBuilder.UseStartup<Startup>();\n" +
                "                });\n" +
                "    }\n" +
                "}";
        writeFile(projectDirectory + "/Program.cs", content);
    }

    private static void writeFile(String filePath, String content) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content);
        }
    }
}
