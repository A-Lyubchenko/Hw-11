package goit.Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 15; i++) {
            int finalI = i;
            Thread threadA = new Thread(() -> number(finalI));
            threadA.start();
            threadA.join();
            Thread threadB = new Thread(() -> fizzbuzz(finalI));
            threadB.start();
            threadB.join();
            Thread threadC = new Thread(() -> fizz(finalI));
            threadC.start();
            threadC.join();
            Thread threadD = new Thread(() -> buzz(finalI));
            threadD.start();
            threadD.join();


        }
    }

    public static void number(int i) {
        if (i % 5 != 0 && i % 3 != 0)
            System.out.print(i + ", ");
    }

    public static void fizzbuzz(int i) {
        if (i % 5 == 0 && i % 3 == 0)
            System.out.print("fizzbuzz");
    }


    public static void buzz(int i) {
        if (i % 5 == 0 && i % 3 != 0)
            System.out.print("buzz, ");
    }


    public static void fizz(int i) {
        if (i % 3 == 0 && i % 5 != 0)
            System.out.print("fizz, ");
    }
}
