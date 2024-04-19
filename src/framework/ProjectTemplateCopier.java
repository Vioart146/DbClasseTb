/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package framework;

import java.io.IOException;
import java.nio.file.*;
/**
 *
 * @author Vioart Vidoc
 */
public class ProjectTemplateCopier {
    /**
     * Maka an le model
     *
     * @param sourcePath      le chemin makany am le modele an le projet
     * @param destinationPath destination
     * @throws IOException
    */
    public static void copyProjectTemplate(String sourcePath, String destinationPath) throws IOException {
        Path sourceDir = Paths.get(sourcePath);
        Path destinationDir = Paths.get(destinationPath);

        // if misy le répertoire de destination, else create
        if (!Files.exists(destinationDir)) {
            Files.createDirectories(destinationDir);
        }

        // Copie an le modele de projet
        Files.walk(sourceDir)
                .forEach(source -> copy(source, destinationDir.resolve(sourceDir.relativize(source))));
    }

    /**
     * Rehefa mi- copier fichier na repetoire
     *
     * @param source chemin source du fichier ou du répertoire.
     * @param dest   chemin de destination.
     */
    private static void copy(Path source, Path dest) {
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
