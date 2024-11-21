import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParallelFileReader {

    // Define a custom thread class to read a file
    static class FileReadThread extends Thread {
        private String filePath;

        public FileReadThread(String filePath) {
            this.filePath = filePath;
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(Thread.currentThread().getName() + ": " + line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file " + filePath + ": " + e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + " finished readingfile: " + filePath);
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide paths to two files as arguments.");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        // Create and start threads for reading the files
        FileReadThread thread1 = new FileReadThread("file3.txt");
        FileReadThread thread2 = new FileReadThread("file4.txt");

        // Start threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Both file reading threads have completed.");
    }
}