package ex8_2;

public class Buffer {
    private final int MaxVolume;
    private int currVolume = 0;
    Buffer(int MaxValue) { this.MaxVolume = MaxValue; }

    public synchronized void put() throws InterruptedException{
        if (currVolume > MaxVolume - 1) {
            wait();
        }

        Thread.sleep(1000);
        currVolume++;
        System.out.println("PUT! CurrVolume now is " + currVolume);
        notify();
    }

    public synchronized void get() throws InterruptedException{
        if (currVolume < 1) {
            wait();
        }

        Thread.sleep(1000);
        currVolume--;
        System.out.println("GET! CurrVolume now is " + currVolume);
        notify();
    }
}
