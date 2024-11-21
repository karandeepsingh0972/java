package com.journaldev.socket;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Server address (localhost for local
        int port = 12345; // Port number to connect to

        try (Socket socket = new Socket(serverAddress, port);
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server.");

            String userInput;
            // Read from the console and send to server
            while ((userInput = consoleInput.readLine()) != null) {
                writer.println(userInput);
                // Read and print server's response
                String response = reader.readLine();
                System.out.println("Server response: " + response);

                if (userInput.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if the user types "exit"
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
