package com.rays.networking;
import java.io.*;
import java.net.*;

public class HelloTCPClient {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 1235);

        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
        DataOutputStream out = new DataOutputStream(client.getOutputStream());

        out.writeBytes("Hello Server");

        String greeting = in.readLine();
        System.out.println("Received from server: " + greeting);

        client.close();
        System.out.println("Client closed.");
    }
}
