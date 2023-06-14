package ex8_2;

public class Consumer implements Runnable,Cloneable {
    private Buffer buffer;
    Consumer(Buffer buffer) { this.buffer = buffer; }

    @Override
    public Consumer clone() { //throws CloneNotSupportedException{
        // If we don't want user to deal with CloneNotSuppertedException
        try {
            return (Consumer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(); //e.printStackTrace();
        }

        //Or we can just throw it further
        //return (Consumer) super.clone();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                buffer.get();
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
