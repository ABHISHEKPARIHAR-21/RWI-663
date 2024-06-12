package RWI;
class loop1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("loop1");
        }
    }
}

// Implementing Runnable for loop2
class loop2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("loop2");
        }
    }
}

public class TreadEX {
    public static void main(String[] args) {
        // Creating instances of loop1 and loop2
        loop1 l1 = new loop1();
        loop2 l2 = new loop2();
        
        // Creating threads with the runnable instances
        Thread t1 = new Thread(l1);
        Thread t2 = new Thread(l2);
        
        // Starting the threads
        t1.start();
        t2.start();
    }
}