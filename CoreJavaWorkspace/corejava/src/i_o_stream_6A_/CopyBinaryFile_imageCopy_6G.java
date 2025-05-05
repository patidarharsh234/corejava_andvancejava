package i_o_stream_6A_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyBinaryFile_imageCopy_6G {
	public static void main(String[] args) throws IOException {
		String source="C:\\Users\\Om prakash Patidar\\Desktop\\papaji folder\\img.jpeg";
		String traget="C:\\Users\\Om prakash Patidar\\Desktop\\rays\\img.jpg";
		
		FileInputStream inputStream=new FileInputStream(source);
		FileOutputStream outputStream=new FileOutputStream(traget);
		
		int ch=inputStream.read();
		while (ch!=-1) {
			outputStream.write(ch);
			ch=inputStream.read();
			
		}
		inputStream.close();
		outputStream.close();
	}

}
