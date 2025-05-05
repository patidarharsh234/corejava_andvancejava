package com.rays.networking;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("127.0.0.1",5643);  //Loopback address and port number pass kiya.
		
		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));//client.getInputStream() when client is closed that mens readLine() terminated.
		
		System.out.println("Client Started");

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		String line = stdIn.readLine();

		while (line != null) {
			
			out.println(line);
			
		//	System.out.println("Echo:" + in.readLine());//server se read

			if ("Bye".equals(line)) {
				break;
			}
			System.out.println("stop for line..");
			line = stdIn.readLine();
			System.out.println("line is send..");
		}
		out.close();
		in.close();
		stdIn.close();
		client.close();

	}
}
