package org.example;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupFunction {
    public static void createBackup() throws IOException {
        if (!Files.exists(Path.of("./backup"))) {
            Files.createDirectories(Path.of("./backup"));
        }
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."))) {
            for (Path file : dir) {
                if (Files.isDirectory(file)) continue;
                Files.copy(file, Path.of("./backup" + file), StandardCopyOption.REPLACE_EXISTING);
            }
        }

    }
}
