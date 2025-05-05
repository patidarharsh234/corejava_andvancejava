package com.rays.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

		// Yeh ek question string banata hai jisme "java" store hota hai.
		String question = "java";

		// eh URL ke saath connection banata hai.
		URLConnection conn = url.openConnection();

		// Yeh connection ko output mode mein set karta hai, taaki hum URL ko data bhej
		// saken.
		conn.setDoOutput(true);

		// Yeh OutputStreamWriter ko initialize karta hai, jisse hum request mein data
		// likh sakein.
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

		// Write question parameter Yeh URL ko "q=java" parameter bhejta hai, jo ek
		// query parameter hota hai.
		out.write("q=" + question);//multiple lines add karana ho to......URL pr kya  kre?

		// Close output stream
		out.close();

		// Connect to the Server
		conn.connect();

		InputStream iStr = conn.getInputStream();
  
		Scanner in = new Scanner(iStr);

		System.out.print("URL contents ***");

		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}

		in.close();

	}

}
