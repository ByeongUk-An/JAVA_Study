package Chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// 콘솔에서 한글을 인풋 받은 값을 input.txt 에 저장 후, Characterset : Default
// input.txt 파일에서 값을 읽어서 콘솔에 출력.

//완료시간 : 

public class EX06_ConsoleInputOutPutObject {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		System.out.println("한글을 입력하세요. >>>");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);
		
		int data;
		
		File outFile = new File("Chap19/EX06/input.txt");
		
		OutputStream os1 = new FileOutputStream(outFile);
		
		os1.write(byteArray1);
		
		FileInputStream fis = new FileInputStream(outFile);
		
		int bufSize = fis.available();
		byte[] buf = new byte[bufSize];
		String str2 = new String(byteArray1,Charset.defaultCharset());
		while((data= fis.read())!= '\n') {
			System.out.print((char)data);
		}
		
		
		
		
		
		
		
		os1.flush();
		os1.close();
		fis.close();
		
		
	}

}
