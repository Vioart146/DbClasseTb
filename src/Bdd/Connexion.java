package Bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {
    PreparedStatement s;
    Scanner scanner;

    public Connection getConnection() throws Exception {
        this.scanner = new Scanner(System.in);
        System.out.print("Le nom de votre base de donnee : ");
        String setScanner = this.scanner.nextLine();

        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+setScanner,"postgres","");

        this.scanner.close();
        return con;
    }
}
