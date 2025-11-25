package workshop2;

interface Runnable {
    void run();
}

class Car3 implements Runnable {
    public void run() {
        System.out.println("Car is running.");
    }

    public static void main(String[] args) {
        Car3 c = new Car3();
        c.run();
    }
}
