package com.freeit.lesson18;

import java.io.*;

public class FinallyExample {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        File file = new File("test.txt");

        Thread thread = new Thread(() -> {
            try (FileOutputStream fos = new FileOutputStream(file);
                 FileInputStream fis = new FileInputStream(file)) {
                for (int i = 0; i < 100; i++) {
                    fos.write(i + 65);
                    System.out.println("i = " + i);
                    Thread.sleep(500);
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException();
            }
        });

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();


//        File f = new File("test.txt");
//        OutputStream fos = new FileOutputStream(f);
//
//        Thread t = new Thread(() -> {
//            try {
//                for (int i = 0; i < 100; i++) {
//                    fos.write(i + 52);
//                    System.out.println("i: " + i);
//                    Thread.sleep(500);
//                }
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        t.start();
//        Thread.sleep(1000);
//        t.interrupt();
    }
}
