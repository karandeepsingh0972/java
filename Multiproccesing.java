import java.io.IOException;

public class Multiproccesing {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Create the process
            ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", ".", "Worker", String.valueOf(i));
            try {
                // Start the process
                Process process = processBuilder.start();

                // Wait for the process to finish
                int exitCode = process.waitFor();
                System.out.println("Process finished with exit code: " + exitCode);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
