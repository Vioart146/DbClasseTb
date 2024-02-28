package Bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Connexion {
    PreparedStatement s;
    Scanner scanner;

    public Connection getConnection() throws Exception {
        this.scanner = new Scanner(System.in);
        System.out.print("Le nom de votre base de donnee : ");
        String setScanner = this.scanner.nextLine();

        Class.forName("org.postgresql.Driver");

        this.scanner.close();
        return con;
    }
}
