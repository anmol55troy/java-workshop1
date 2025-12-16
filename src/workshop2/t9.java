package workshop2;

interface Runnable {
    void run();
}

public class t9 implements Runnable {   // <-- changed class name
    public void run() {
        System.out.println("Car is running.");
    }

    public static void main(String[] args) {
        t9 c = new t9();
        c.run();
    }
}
