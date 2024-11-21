import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool with 3 threads

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is executing the task.");
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 5; i++) {
            executor.submit(task); // Submit tasks to the thread pool
        }

    }
}
