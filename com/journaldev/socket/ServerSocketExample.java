
package com.journaldev.socket;

import java.io.*;
import java.net.*;

public class ServerSocketExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            // Create a ServerSocket to listen on port 12345
            serverSocket = new ServerSocket(12345);
            System.out.println("Server is waiting for client request...");

            // Accept client connections in a loop
            while (true) {
                // Accept a client connection
                clientSocket = serverSocket.accept();
                System.out.println("Client connected!");

                // Create input and output streams for communication
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new PrintWriter(clientSocket.getOutputStream(), true);

                String clientMessage;

                // Process messages from the client
                while ((clientMessage = in.readLine()) != null) {
                    System.out.println("Message Received: " + clientMessage);
                    if (clientMessage.equalsIgnoreCase("exit")) {
                        out.println("Server: Goodbye!");
                        break; // Exit the loop if the client sends "exit"
                    }
                    out.println("Server received: " + clientMessage);

                    System.out.println("Waiting for the client request...");
                }

                System.out.println("Client disconnected.");

                // Close resources for this client connection
                try {
                    if (in != null)
                        in.close();
                    if (out != null)
                        out.close();
                    if (clientSocket != null)
                        clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the ServerSocket
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}