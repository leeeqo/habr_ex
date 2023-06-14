package ex8_2;

public class Producer implements Runnable {
    private Buffer buffer;
    Producer(Buffer buffer) { this.buffer = buffer; }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                buffer.put();
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
