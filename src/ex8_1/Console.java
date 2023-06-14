package ex8_1;

public class Console {
    private String last;
    Console(String last) {
        this.last = last;
    }

    public synchronized void printName(String name) throws InterruptedException{
        if (name.equals(last)) {
            wait();
        }

        Thread.sleep(1000);

        System.out.println(name);
        last = name;
        notify();
    }
}
