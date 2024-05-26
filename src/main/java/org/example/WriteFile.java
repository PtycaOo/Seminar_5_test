package org.example;

import java.io.*;

public class WriteFile {
    public WriteFile(byte[]arr, String file) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))){
            for (Byte b: arr){
                dataOutputStream.writeByte(b);
            }
        }
    }
}
