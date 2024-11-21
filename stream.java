import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class stream {
    public static void main(String args[]) {

        // byte[] array = new byte[100];
        // byte[] array1 = { 1, 2, 3, 4 };
        int array2 = 5;
        String array3 = "This is programiz";
        // try {
        // InputStream input = new FileInputStream("input.txt");

        // System.out.println("Available bytes in the file: " + input.available());

        // // Read byte from the input stream
        // input.read(array);
        // System.out.println("Data read from the file: ");

        // // Convert byte array into string
        // String data = new String(array);
        // System.out.println(data);

        // // Close the input stream
        // input.close();
        // } catch (Exception e) {
        // e.getStackTrace();
        // }
        // bytearrayinputstream
        // try {
        // ByteArrayInputStream input = new ByteArrayInputStream(array1);

        // System.out.print("The bytes read from the input stream: ");

        // for (int i = 0; i < array.length; i++) {

        // // Reads the bytes
        // int data = input.read();
        // System.out.print(data + ", ");
        // }
        // input.close();
        // }

        // catch (Exception e) {
        // e.getStackTrace();
        // }
        // objectoutputstream
        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writing to the file using ObjectOutputStream
            output.writeInt(array2);
            output.writeObject(array3);

            FileInputStream fileStream = new FileInputStream("file.txt");
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            // Using the readInt() method
            System.out.println(" " + "Integer data:" + objStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
