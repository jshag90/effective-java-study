package com.ji.effective.java.chapter1.item07.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
        int numberOfCpu = Runtime.getRuntime().availableProcessors();
        System.out.println(numberOfCpu);
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfCpu);
        for(int i = 0; i<100; i++){
            executorService.submit(new Task());
        }

        System.out.println(Thread.currentThread()+ "hello");
        executorService.shutdown();

    }

    static class Task implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread()+"world");
            }catch(Exception exception){
                exception.printStackTrace();
            }
        }
    }

}
