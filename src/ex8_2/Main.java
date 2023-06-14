package ex8_2;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
        Producer prod = new Producer(buffer);
        Consumer cons = new Consumer(buffer);

        Thread threadProd = new Thread(prod);
        Thread threadCons = new Thread(cons);

        threadProd.start();
        threadCons.start();
    }
}
