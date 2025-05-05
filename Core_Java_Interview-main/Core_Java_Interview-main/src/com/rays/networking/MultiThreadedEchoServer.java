package com.rays.networking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedEchoServer extends Thread {
	public Socket client = null;

    public MultiThreadedEchoServer(Socket clientSocket) {
        this.client = clientSocket;
    }

    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            

            String inputLine= in.readLine();
            while (inputLine!= null) {
                System.out.println("Server received: " + inputLine);
                out.println(inputLine + " .. " + inputLine);

                if ("Bye.".equalsIgnoreCase(inputLine)) {
                    break;
                }
                
                inputLine= in.readLine();
            }

            out.close();
            in.close();
            client.close();
        } catch (Exception e) {
            System.err.println("IOException in client communication: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        boolean isRunning = true;

        try {  
            serverSocket = new ServerSocket(5643);
            System.out.println("Echo Server Started on port 5643");

            while (isRunning) {
            	System.out.println("accept client....!!");
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());

                MultiThreadedEchoServer echoServer = new MultiThreadedEchoServer(clientSocket);
                echoServer.start();
                System.out.println("accepted First Cliet....!!");
            }

        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.err.println("Could not close server socket: " + e.getMessage());
                }
            }
        }

        System.out.println("Echo Server Stopped");
    }
}
