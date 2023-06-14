package ex8_1;

public class TypeName implements Runnable {
    private String name;
    private Console console;
    TypeName(String name, Console console) {
        this.name = name;
        this.console = console;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                console.printName(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        /*TypeName(String name, Object console) {
            this.name = name;
            this.console = console;
        }

        @Override
        public void run() {
            Thread curr = Thread.currentThread();

            while (!curr.isInterrupted()) {
                synchronized (console) {
                    if (isLast) {
                        try {
                            console.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            System.out.println("Caught exc for " + name);
                        }
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name);
                    isLast = true;
                    console.notify();
                }
            }
        }*/
}
