class MyThread extends Thread {
    public MyThread(String threadName) {
        super(threadName);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread is running: Step " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " Thread was interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " Thread has finished execution.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Child");
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread is running: Step " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " Thread was interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " Thread has finished execution.");
    }
}