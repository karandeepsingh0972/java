import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Udpclient {
    private static final int PORT = 8000;
    private static final int BUFFER_SIZE = 1024;

    private DatagramSocket socket;
    private InetAddress serverAddress;

    public Udpclient(String serverHost) throws Exception {
        socket = new DatagramSocket();
        serverAddress = InetAddress.getByName(serverHost);
    }

    public void start() throws Exception {
        System.out.println("Client started. Type messages to send to the server...");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), serverAddress, PORT);
            socket.send(packet);

            // Receive broadcasted messages from the server
            packet = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
            socket.receive(packet);
            String receivedMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message from server: " + receivedMessage);
        }
    }

    public static void main(String[] args) throws Exception {
        Udpclient client = new Udpclient("localhost");
        client.start();
    }
}