package goit.Task1;

import java.util.stream.IntStream;

public class MyThread2 extends Thread {
    @Override
    public void run() {
            IntStream.rangeClosed(1, 20).filter(s -> s % 5 == 0).forEach(s -> {
                try {
                    Thread.sleep(5000);
                    System.out.format("Прошло %d секунд.\n", s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }


