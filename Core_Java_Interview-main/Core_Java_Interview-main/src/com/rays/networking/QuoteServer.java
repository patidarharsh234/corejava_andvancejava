package com.rays.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class QuoteServer {
	public static void main(String[] args) throws IOException {
		String[] data = { "Bura Mat Dekho", "Bura Mat Kaho", "Bura Mat Suno" };
		DatagramSocket socket = new DatagramSocket(5432);
		byte[] buf = new byte[256];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		boolean flag = true;
		while (flag) { //server chlta rhe es liye
			socket.receive(packet);
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			int index = (int) (Math.random() * 2);
			byte[] send = data[index].getBytes();

			DatagramPacket quotePkt = new DatagramPacket(send, send.length, address, port);
			socket.send(quotePkt);
		}
		socket.close();

	}

}
