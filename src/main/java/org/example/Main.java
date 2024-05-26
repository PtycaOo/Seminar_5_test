package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "test.txt";
        byte[] arr = {1,2,0,1,2,2,3,0,3};
        new WriteFile(arr,path);
        BackupFunction.createBackup();
    }
}