package com.it.demo10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test10 {
    public static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {


    }

    private void threadTest01() {

        Future<String> dddd = executorService.submit(() -> {
            System.out.println("dddd");
            return "sss";
        });

        try {
            String s = dddd.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void threadTest02() {
        Future<?> submit = executorService.submit(() -> {

        });

        Future<?> submit1 = executorService.submit(() -> {

        });


    }



}
