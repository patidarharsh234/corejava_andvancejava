package com.rays.thread;

public class A_TestPrintValue {
	public static void main(String[] args) {
	A_StorageClass_MonitorObject s=new A_StorageClass_MonitorObject();	
	
	A_CounterThread c=new A_CounterThread(s);
	A_PrinterThread p=new A_PrinterThread(s);
	
	
	c.start();
	p.start();
	
	
	
	}
}
