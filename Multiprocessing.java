import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Task class that extends Runnable
class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + " started");
        try {
            // Simulate some work
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task " + name + " finished");
    }
}

// Process class that extends Thread
class Process extends Thread {
    private String name;

    public Process(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Process " + name + " started");
        try {
            // Simulate some work
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Process " + name + " finished");
    }
}

public class Multiprocessing {
    public static void main(String[] args) {
        // Create an executor service with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the executor
        executor.submit(new Task("Task-1"));
        executor.submit(new Task("Task-2"));
        executor.submit(new Task("Task-3"));

        // Create and start processes
        Process process1 = new Process("Process-1");
        Process process2 = new Process("Process-2");
        process1.start();
        process2.start();

        // Shut down the executor
        executor.shutdown();
    }
}