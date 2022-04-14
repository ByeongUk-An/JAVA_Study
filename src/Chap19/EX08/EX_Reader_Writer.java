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
 	
 	1.�ֿܼ��� �ѱ��� �о
 	C:\Temp\a\aaa.txt (MS949)
 	C:\Temp\b\bbb.txt (UTF-8)
 	���Ͽ� ������.
 	
 	-a , b ������   Appcliation���� ���� �ϼ���.
 	
 	2. �� ���Ͽ��� ���� ������ �ֿܼ� ���� ���� ��� �ϼ���.
 */

public class EX_Reader_Writer {

	public static void main(String[] args) {
		// MS949 ���� 
		String path = "C:\\Temp\\a";
		File Folder = new File(path);
		
		if(!Folder.exists()) {
			try {
				Folder.mkdir();
				System.out.println("������ �����Ǿ����ϴ�.");
			}catch(Exception e) {
				System.out.println(e);
			}
		}else {
			System.out.println("������ �̹� �����Ǿ� �ֽ��ϴ�.");
		}
		
		File pw1 = new File("C:\\Temp\\a\\pw1.txt");
		
		try(Writer writer = new FileWriter(pw1);) {
			writer.write("�ȳ��ϼ���\n".toCharArray());					
			writer.write("Hello \n");								
			writer.write('A');											
			writer.write('\r');										
			writer.write('\n');											
			writer.write("�ݰ����ϴ�", 2, 3);
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
				System.out.println("������ �����Ǿ����ϴ�.");
			}catch(Exception e) {
				System.out.println(e);
			}
		}else {
			System.out.println("������ �̹� �����Ǿ� �ֽ��ϴ�.");
		}
		
File pw2 = new File("C:\\Temp\\b\\pw2.txt");
		
		try(Writer writer = new FileWriter(pw2);) {
			writer.write("�ȳ��ϼ���\n".toCharArray());					
			writer.write("Hello \n");								
			writer.write('A');											
			writer.write('\r');										
			writer.write('\n');											
			writer.write("�ݰ����ϴ�", 2, 3);
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
