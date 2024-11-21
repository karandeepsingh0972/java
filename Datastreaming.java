import java.io.*;
import java.util.Arrays;

public class Datastreaming {
    public static void main(String[] args) {
        // Choose whether to read from array or file
        boolean readFromArray = true; // Set to true to read from array, false to read from file

        long startTime = System.currentTimeMillis();

        if (readFromArray) {
            // Process data from array
            int[] dataArray = { 1, 2, 3, 4, 5 }; // Example data array
            processArrayData(dataArray);
        } else {
            // Process data from file
            File file = new File("data.txt"); // Example file path
            processFileData(file);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Processing time: " + totalTime + " milliseconds");
    }

    // Method to process data from an array
    private static void processArrayData(int[] dataArray) {
        System.out.println("Processing data from array: " + Arrays.toString(dataArray));
        // Perform your processing logic here
        // Example: Sum all elements in the array
        int sum = 0;
        for (int num : dataArray) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }

    // Method to process data from a file
    private static void processFileData(File file) {
        System.out.println("Processing data from file: " + file.getName());
        try (FileInputStream fis = new FileInputStream("data.text");
                BufferedInputStream bis = new BufferedInputStream(fis)) {

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] fileBytes = baos.toByteArray();

            // Perform your processing logic here
            // Example: Count number of bytes read
            int byteCount = fileBytes.length;
            System.out.println("Number of bytes read from file: " + byteCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
