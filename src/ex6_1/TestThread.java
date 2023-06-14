package ex6_1;

public class TestThread implements Runnable {
    String name = "test";
    TestThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("I'm " + this.name);
    }
}