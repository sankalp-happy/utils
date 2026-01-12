class MyThread implements Runnable {
    private String threadName;

    public MyThread(String name) {
        threadName = name;
    }

    public void run() {
        try {
            System.out.println(threadName + " is running.");
            Thread.sleep(500);
            System.out.println(threadName + " has finished execution.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();
    }
}