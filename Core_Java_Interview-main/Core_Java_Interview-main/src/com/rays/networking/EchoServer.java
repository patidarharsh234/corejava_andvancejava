package com.rays.networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket sSocket = new ServerSocket(5643);

		//esme multilple client add to ho re but client accept ak hi bar kr ra dusra client to direct connect ho ra server milne pr.. esi liye output first vale client se hi leta he.
		//client jese hi close hoga ye exception de kr server bhi close ho ra .
		//multiple thread ki help se server banayenge ...client ke close hone pr bhi server chl raha he..
		System.out.println("Server Started");

		Socket cSocket = null;

		boolean flag = true;

		while (flag) {
			
			System.out.println("accept client");
			cSocket = sSocket.accept();//yha waps aayega loop chlega vaps chlega clinte close pr to exception dega kyu ki server close krdiya hamne or use socket accept kara yenge to Exception(socket is closed) and close .
			
			talk(cSocket); //yha se return aayenga  client closde hone pr then next line pr jayega..//or es method me ak client ko close krne ke bad hi return while loop pe aara.

			sSocket.close();//ye close kr diya server ko ...

			System.out.println("Server closed");
		}
	}

	private static void talk(Socket cSocket) throws IOException {
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
		
	
		String line = in.readLine();//read me se jo bhi line do ge to dne ke bad null nhli hoti usi me rehti he new lien doge to vo overleap ho jayegi.

		
		while (line != null) {
			System.out.println("Server Received:" + line);
			out.println("server send" + "..." + line);

			
			if (line.equals("Bye")) {
				break;
			}
			System.out.println("read first");
			 line= in.readLine();//client conenction clos hone pe string me value at its re jayegi to loop ifinite tk chlega....yhi pr hold kr ke rakta he jb contion open rehta he tab.
			System.out.println("read secound");
		}
		out.close();
		in.close();
		cSocket.close();
	}

}
