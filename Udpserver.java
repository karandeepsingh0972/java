import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class Udpserver {
    private static final int PORT = 8000;
    private static final int BUFFER_SIZE = 1024;

    private DatagramSocket socket;
    private List<InetAddress> clients;

    public Udpserver() throws Exception {
        socket = new DatagramSocket(PORT);
        clients = new ArrayList<>();
    }

    public void start() throws Exception {
        System.out.println("Server started. Listening for incoming messages...");

        while (true) {
            DatagramPacket packet = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message from " + packet.getAddress() + ": " + message);

            // Add client to the list if it's not already there
            if (!clients.contains(packet.getAddress())) {
                clients.add(packet.getAddress());
            }

            // Broadcast the message to all connected clients
            broadcastMessage(message, packet.getAddress());
        }
    }

    private void broadcastMessage(String message, InetAddress senderAddress) throws Exception {
        for (InetAddress clientAddress : clients) {
            if (!clientAddress.equals(senderAddress)) {
                DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), clientAddress, PORT);
                socket.send(packet);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Udpserver server = new Udpserver();
        server.start();
    }
}