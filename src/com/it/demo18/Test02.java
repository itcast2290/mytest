package com.it.demo18;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        try {
            InputStream resourceAsStream = Test02.class.getClassLoader().getResourceAsStream("text01.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream, "utf-8");
            FileOutputStream fileOutputStream = new FileOutputStream("F:\\testtemp01\\test02.txt", true);
            FileWriter fileWriter = new FileWriter("F:\\testtemp01\\test02.txt", true);

            int read = 0;
            //while ((read = resourceAsStream.read()) != -1) {
            //    System.out.println(read);
            //}
            int rrrr = 0;
            char[] c = new char[8];
            // while ((rrrr = inputStreamReader.read()) != -1) {
            //    System.out.println(rrrr);
            //}
             while ((rrrr = inputStreamReader.read(c)) != -1) {
                 System.out.println(new String(c, 0, rrrr));
                 fileWriter.write(c, 0 ,rrrr);
             }
            fileOutputStream.close();
            inputStreamReader.close();
            resourceAsStream.close();
            fileWriter.close();

          //  FileOutputStream fileOutputStream = new FileOutputStream("./01.text");
          //  byte[] bytes = new byte[]{1,23,4,5,6};
          //  fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
