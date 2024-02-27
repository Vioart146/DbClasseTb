/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import Bdd.Connexion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import static framework.GenerateClass.generateClass;
import static framework.GenerateClassCsharp.generateClassCsharp;
import java.util.Scanner;

/**
 *
 * @author etech
 */
public class Framework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
///ato tonga de mijery ny emplacement an le projet
        String userDirectory = System.getProperty("user.dir");
//        System.out.println("Emplacement du projet : " + userDirectory);
//-----------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Le nom du package Java : ");
        String setScanner = scanner.nextLine();

        System.out.print("Le nom du package C# : ");
        String setCScanner = scanner.nextLine();
        
        Connection co = null;
        co = new Connexion().getConnection();
        DatabaseMetaData metaData = co.getMetaData();
            // Récupérer les noms de tables
            ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                generateClass(co,tableName,setScanner);
                generateClassCsharp(co,tableName,setCScanner,userDirectory);
            }
            scanner.close();
            tables.close();
            co.close();
    }
    
    
    
    
}
