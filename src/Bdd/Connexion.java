/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Vioart Vidoc
 */
public class Connexion {
    public Connection getConnection(String databaseName) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/" + databaseName;
        String user = "postgres"; // Remplacez par votre nom d'utilisateur si nécessaire
        String password = "postgres"; // Remplacez par votre mot de passe si nécessaire

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver not found", e);
        }
    }
}
