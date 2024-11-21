
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiProcessExample {

    public static void main(String[] args) {
        String command = "ping -c 4 google.com";
        runProcess(command);
    }

    private static void runProcess(String command) {
        ProcessBuilder processBuilder = new ProcessBuilder("sh", "-c", command);
        try {
            java.lang.Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
