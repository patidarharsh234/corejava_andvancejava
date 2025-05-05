package i_o_stream_6A_;

import java.io.File;
import java.util.Date;



public class Read_file_atributes_6I {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Om prakash Patidar\\Desktop\\rays\\harsh2.txt");
		if (f.exists()) {
			System.out.println("name"+ f.getName());
			System.out.println("Absolute path:" +f.getAbsolutePath());
			System.out.println("is wiritable:" +f.canWrite());
			System.out.println("is readable:" +f.canRead());
			System.out.println("is file:" +f.isFile());
			System.out.println("is directory :" +f.isDirectory());//folder ko directory bolenge jiske andr file ka collection hota he
			System.out.println("last modified at" +new Date(f.lastModified()));
			System.out.println("Size"+f.length()+"bytes long.");
			
		}
	}

}
