package goit.Task1;

import java.util.stream.IntStream;

public class MyThread extends Thread {

    @Override
    public void run() {
            IntStream.rangeClosed(1, 20).forEach(s -> {
                try {
                    System.out.format("Прошла %d секунда.\n", s);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });

        }
    }



