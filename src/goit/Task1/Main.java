package goit.Task1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // первый вариант
        new MyThread().start();
        new MyThread2().start();
        new MyThread3().start();


// второй вариант
        Thread thread = new Thread(() -> {
            IntStream.rangeClosed(1, 20).forEach(s -> {
                try {
                    System.out.format("Прошла %d секунда.\n", s);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });
        thread.start();

        Thread thread1 = new Thread(() -> {
            IntStream.rangeClosed(1, 20).filter(s -> s % 5 == 0).forEach(s -> {
                try {
                    Thread.sleep(5000);
                    System.out.format("Прошло %d секунд.\n", s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        });
        thread1.start();
    }
}


// третий вариант

class MyThread3 extends Thread {

    @Override
    public void run() {
        IntStream.rangeClosed(1, 20).forEach(s -> {
            try {
                System.out.format("Прошла %d секунда.\n", s);
                Thread.sleep(1000);
                if (s % 5 == 0) {
                    System.out.format("Прошло %d секунд.\n", s);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

    }
}


