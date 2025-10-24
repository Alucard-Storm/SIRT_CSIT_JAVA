// Write a program to demonstrate multithreading

public class exp8 {
    public static void main(String[] args) {

        // Creating a thread by extending Thread class
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}

// Custom thread class extending Thread
class MyThread extends Thread {
    private String threadName;

    // Constructor for initializing thread name
    public MyThread(String name) {
        this.threadName = name;
    }

    // Overriding the run() method
    public void run() {
        // Thread has started execution
        System.out.println(threadName + " is running.");

        // Simulating some work
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": " + i);
        }

        // Thread has finished execution
        System.out.println(threadName + " has finished execution.");
    }
}