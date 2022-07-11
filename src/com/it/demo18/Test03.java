package com.it.demo18;

import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        File file = new File("1990.jpg");
        File outFile = new File("F:\\testtemp01\\001.jpg");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(outFile);

            int l = 8 * 1024;
            byte[] bytes = new byte[l];
            int read = 0;
            while ((read = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
