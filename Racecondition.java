import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Racecondition {
    public static final String FILE_PATH = "Simple.txt";

    public static void main(String[] args) {
        Runnable readtask = () -> {
            try {
                Thread.sleep(100);
                readFile();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("System is Intrupped..");
            }
        };
        Thread thread = new Thread(readtask);
        Thread thread2 = new Thread(readtask);

        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Both are finished reading");
    }

    private static synchronized void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + "read:" + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
