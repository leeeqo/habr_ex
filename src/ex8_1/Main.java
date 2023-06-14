package ex8_1;

public class Main {
    public static void main(String[] args) {
        Console console = new Console("Nikolai");
        TypeName typeAlex = new TypeName("Alexander", console);
        TypeName typeAngel = new TypeName("Nikolai", console);
        Thread thread1 = new Thread(typeAlex);
        Thread thread2 = new Thread(typeAngel);

        thread1.start();
        thread2.start();
    }
}
