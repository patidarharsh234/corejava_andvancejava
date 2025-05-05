package com.rays.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(4445);

		System.out.println("Server is up and waiting for a client...");

		byte[] bt = new byte[256];

		DatagramPacket packet = new DatagramPacket(bt, bt.length);

		socket.receive(packet);

		String received = new String(packet.getData(), 0, packet.getLength());
		
		System.out.println("Received from client: " + received);

		String response = "Hello from UDP Server!";
		
		bt = response.getBytes();

		packet = new DatagramPacket(bt, bt.length, packet.getAddress(), packet.getPort());
		
		socket.send(packet);

		socket.close();
		
		System.out.println("Server closed.");
	}
}