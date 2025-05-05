package com.rays.networking;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

    public static void main(String[] args) throws Exception {
        // Using a simpler URL that doesn't require special headers or authentication
    	
    	
//    	Protocol: https
//    	Host Name: erp.sunilos.com
//    	Port Number: -1
//    	File Name: /NCSA/
    	
    	
        URL u = new URL("https://erp.sunilos.com/NCSA/#/Test");

        System.out.println("Protocol: " + u.getProtocol());
        System.out.println("Host Name: " + u.getHost());
        System.out.println("Port Number: " + u.getPort());
        System.out.println("File Name: " + u.getFile());

        // Open a stream to read from the URL
        InputStream iStr = u.openStream();

        // Use a Scanner to read the content line by line
        Scanner in = new Scanner(iStr);

        while (in.hasNext()) {
            String html = in.nextLine();
            System.out.println(html);
        }

        // Close the Scanner
        in.close();
    }
}
