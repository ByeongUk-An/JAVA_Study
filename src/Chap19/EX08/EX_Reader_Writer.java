package Chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

/*
 	Application Default : MS949
 	
 	1.콘솔에서 한글을 읽어서
 	C:\Temp\a\aaa.txt (MS949)
 	C:\Temp\b\bbb.txt (UTF-8)
 	파일에 쓰세요.
 	
 	-a , b 폴더는   Appcliation에서 생성 하세요.
 	
 	2. 두 파일에서 읽은 내용을 콘솔에 깨짐 없이 출력 하세요.
 */

public class EX_Reader_Writer {

	public static void main(String[] args) {
		// MS949 버전 
		String path = "C:\\Temp\\a";
		File Folder = new File(path);
		
		if(!Folder.exists()) {
			try {
				Folder.mkdir();
				System.out.println("폴더가 생성되었습니다.");
			}catch(Exception e) {
				System.out.println(e);
			}
		}else {
			System.out.println("폴더가 이미 생성되어 있습니다.");
		}
		
		File pw1 = new File("C:\\Temp\\a\\pw1.txt");
		
		try(Writer writer = new FileWriter(pw1);) {
			writer.write("안녕하세요\n".toCharArray());					
			writer.write("Hello \n");								
			writer.write('A');											
			writer.write('\r');										
			writer.write('\n');											
			writer.write("반값습니다", 2, 3);
			writer.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try(Reader reader = new FileReader(pw1);) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("==============================");
		
		//UTF-8
		String path1 = "C:\\Temp\\b";
		File Folder1 = new File(path1);	
		
		if(!Folder1.exists()) {
			try {
				Folder1.mkdir();
				System.out.println("폴더가 생성되었습니다.");
			}catch(Exception e) {
				System.out.println(e);
			}
		}else {
			System.out.println("폴더가 이미 생성되어 있습니다.");
		}
		
File pw2 = new File("C:\\Temp\\b\\pw2.txt");
		
		try(Writer writer = new FileWriter(pw2);) {
			writer.write("안녕하세요\n".toCharArray());					
			writer.write("Hello \n");								
			writer.write('A');											
			writer.write('\r');										
			writer.write('\n');											
			writer.write("반값습니다", 2, 3);
			writer.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try(InputStream is = new FileInputStream(pw2);
			InputStreamReader isr1 = new InputStreamReader(is,"UTF-8")) {	
			int data;
			while((data = isr1.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println(isr1.getEncoding());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
