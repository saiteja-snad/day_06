package Filehandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    private int id;

    Task(int id) {
        this.id = id;
    }

    public void run() {

        System.out.println(
            "Executing Task " + id +
            " by " + Thread.currentThread().getName()
        );
    }
}

public class Threadpool {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        for(int i = 1; i <= 5; i++) {
            executor.execute(new Task(i));
        }

        executor.shutdown();
    }
}