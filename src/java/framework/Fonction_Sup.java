/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framework;

/**
 *
 * @author Vioart Vidoc
 */
public class Fonction_Sup {

    public Fonction_Sup() {
    }

    // Mamadika nom an le table -> nom an le class (ex: "ma_table" -> "MaTable")
    static String tableNameToClassName(String tableName) {
        String[] parts = tableName.split("_");
        StringBuilder className = new StringBuilder();
        for (String part : parts) {
            className.append(capitalize(part));
        }
        return className.toString();
    }

    // Convertir un type SQL en un type Java simple (pour cet exemple, la conversion est simplifiée)
    static String sqlTypeToJavaType(String sqlType) {
        switch (sqlType.toLowerCase()) {
            case "serial":
                return "Integer";
            case "int":
                return "Integer";
            case "varchar":
                return "String";
            case "double precision":
                return "double";
            case "float":
                return "float";
            default:
                return "Object";
        }
    }
    
    static String sqlTypeToCSharpType(String sqlType) {
        switch (sqlType.toLowerCase()) {
            case "serial":
                return "int";
            case "int":
                return "int";
            case "varchar":
                return "string";
            // Add other conversions as needed
            default:
                return "object";
        }
    }

    // Atao majuscule ny première lettre @ chaîne
    static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
