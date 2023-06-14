package ex6_1;

public class Main {
    public static void main(String[] args) {
        //Convertor convert = new KelvinConvertor();
        //System.out.println(convert.convertTo(-273.5));

        TestThread tst = new TestThread("Pavel");
        Thread thread1 = new Thread(tst);
        System.out.println("Before thread.run");
        thread1.start();
        System.out.println("After thread1.run");

        TestThread tst2 = new TestThread("Angelina");
        Thread thread2 = new Thread(tst2);
        System.out.println("Before thread2.run");
        thread2.start();

        try {
            thread2.join();
        }
        catch (InterruptedException esc) {
            System.out.println("Caught!");
        }
        System.out.println("After thread2.run");

        char lala = '\u0000';
        System.out.println(lala);

    }
}
