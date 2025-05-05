package com.rays.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
        	
            System.out.println(e.nextElement());
        }
    }
}
