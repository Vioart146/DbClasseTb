/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framework;

import Bdd.Connexion;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.lang.model.element.Modifier;

/**
 *
 * @author Vioart Vidoc
 */
public class GenerateClass {
    public static void generateClass(Connection co,String tableName,String setScanner) throws Exception{
        Fonction_Sup fs = new Fonction_Sup();
        if(co == null){
        co = new Connexion().getConnection();
        }       
        try{
        DatabaseMetaData metaData = co.getMetaData();
            // Récupérer les noms de tables
            ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});


            // Récupérer les noms et types de colonnes pour la table
            ResultSet columns = metaData.getColumns(null, null, tableName, "%");

            // Créer un objet TypeSpec.Builder pour la classe
            TypeSpec.Builder classBuilder = TypeSpec.classBuilder(Fonction_Sup.tableNameToClassName(tableName))
                   .addModifiers(Modifier.PUBLIC);

            // Générer les champs, les getters et setters
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                String columnType = Fonction_Sup.sqlTypeToJavaType(columns.getString("TYPE_NAME"));

                // Ajouter le champ à la classe
                classBuilder.addField(FieldSpec.builder(ClassName.get("java.lang", columnType), columnName)
                        .addModifiers(Modifier.PRIVATE)
                        .build());
                // Générer la méthode getter
                classBuilder.addMethod(MethodSpec.methodBuilder("get" + Fonction_Sup.capitalize(columnName))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(ClassName.get("java.lang", columnType))
                        .addStatement("return $N", columnName)
                        .build());

                // Générer la méthode setter
                classBuilder.addMethod(MethodSpec.methodBuilder("set" + Fonction_Sup.capitalize(columnName))
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(ClassName.get("java.lang", columnType), columnName)
                        .addStatement("this.$N = $N", columnName, columnName)
                        .build());
            }
            

            // Générer le constructeur avec tous les champs en tant que paramètres
            MethodSpec.Builder constructorBuilder = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC);
            columns.beforeFirst(); // Retourner à la première ligne pour le traitement du constructeur
            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                String columnType = Fonction_Sup.sqlTypeToJavaType(columns.getString("TYPE_NAME"));

                constructorBuilder.addParameter(ClassName.get("java.lang", columnType), columnName);
                constructorBuilder.addStatement("this.$N = $N", columnName, columnName);
            }
            classBuilder.addMethod(constructorBuilder.build());
            // Créer le fichier source Java
            JavaFile javaFile = JavaFile.builder("com.classe."+setScanner, classBuilder.build())
                    .build();

            // Écrire le fichier source Java
            javaFile.writeTo(new File("src/"));

            columns.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

}
