import java.util.concurrent.TimeUnit;

// Define the Calculator interface
interface Calculator {
    String getDescription();

    double calculate(int i);
}

// Implement the Calculator interface
class CalculatorSyncMethod implements Calculator {
    private String description = "Using synchronized method";

    public String getDescription() {
        return description;
    }

    // Synchronized method to ensure thread safety
    public synchronized double calculate(int i) {
        try {
            TimeUnit.MILLISECONDS.sleep(i); // Simulate time-consuming calculation
            return Math.sqrt(2.0 * i); // Calculate and return the square root
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Calculator was interrupted");
        }
        return 0.0;
    }
}

public class Synchronization {
    public static void main(String[] args) {
        CalculatorSyncMethod calculator = new CalculatorSyncMethod();

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                double result = calculator.calculate(i);
                System.out.println(Thread.currentThread().getName() + " calculated: " + result);
            }
        };

        // Create and start threads
        new Thread(task).start();
        new Thread(task).start();
    }
}
