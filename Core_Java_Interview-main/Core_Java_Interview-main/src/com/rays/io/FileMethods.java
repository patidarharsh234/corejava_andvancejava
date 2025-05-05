package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileMethods {
	public static void main(String[] args) {
		File directory = new File("C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles");
		String[] list = directory.list();
		for (String string : list) {
			System.out.println(string);
		}

		File file = new File(
				"C:\\Users\\Om prakash Patidar\\Desktop\\Core_Java_Interview-main\\IOFiles\\MeargeFiles\\Mearge_File_OneTwo.txt");

		System.out.println(".....Check File exist..");
		if(file.exists()) {
			
			System.out.println("File name="+file.getName());
		}
		System.out.println(".....Path of File ..");
		System.out.println("path :"+file.getAbsolutePath());
		
		System.out.println(".....Check Access permistion ..");
		System.out.println("can Write :"+file.canWrite());
		System.out.println("can Read:"+file.canRead());
		
		System.out.println(".....Check if it is file or directory ..");
		System.out.println("Is  file :"+file.isFile());
		System.out.println("Is directory :"+directory.isDirectory());
		
		System.out.println("Last Modified date of File/Directory");
		Date date=new Date(file.lastModified());
		System.out.println("Last Modified File :"+date);
		Date date1=new Date(directory.lastModified());
		System.out.println("Last Modified directory :"+date1);
		
		
		System.out.println("Length of file");
		long length=file.length();
		long len=directory.length();
		
		System.out.println("Length of File :"+length);
		System.out.println("Length of directory :"+len);
		
		
		System.out.println("________________Create Subdirectory________________");
		File subDire=new File(directory,"subDirectory");
		subDire.mkdir();
		System.out.println("subDirectory Folder created in  your mean directory");
		
		System.out.println("________________Reaname or delete a file or directory________________");
		
		//create File object
		System.out.println("create new file in your directory....");
		File reanDele=new File("craeteFile.txt");
		System.out.println("Rename File : 'changCreateFileName.txt'");
		reanDele.renameTo(new File("changCreateFileName.txt"));
		
//		System.out.println("delete file:" +reanDele.delete());
//		System.out.println("file delete if is exesit :");
//		reanDele.deleteOnExit();
		
	}

}
