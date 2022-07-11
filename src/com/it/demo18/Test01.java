package com.it.demo18;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        File file1 = new File("F:\\testtemp01");
        String s = "F:\\testtemp01\\200.jpg";
        try {
            File file = new File(file1, "199.jpg");
            fileOutputStream = new FileOutputStream(file);
            fileInputStream = new FileInputStream("1990.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bytes = new byte[1024];
            int read = 0;
            while ((read = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, read);

            }
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }
        System.out.println(System.currentTimeMillis() - start);


    }
}
