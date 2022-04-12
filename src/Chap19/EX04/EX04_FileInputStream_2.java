package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// FileInputStream
// is1 : MS949 �ѱ۷� �б� ó��, try (with resource) , ���� ó��.
// is2 : UTF-8 �ѱ� �б� ó��, try�������� ����ó��



public class EX04_FileInputStream_2 {
	public static void main(String[] args) {
		File inFile = new File("Chap19\\EX04\\files1\\exception-ms949.txt");
		byte[] byteArray = new byte[100];
		try(InputStream is1_1 = new FileInputStream(inFile)) {
			int data;
			while((data = is1_1.read(byteArray)) != -1) {
				System.out.println(new String(byteArray,Charset.forName("MS949")));
			}
		}  catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}
		
		File inFile2 = new File("Chap19\\EX04\\files1\\exception-utf8.txt");
		
		InputStream is2 = null;
		byte[] byteArray2 = new byte[100];
		try {
			is2 = new FileInputStream(inFile2);
			int data;
			while((data = is2.read(byteArray2)) != -1) {
				System.out.println(new String(byteArray2,Charset.forName("UTF-8")));
			}
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}finally {
			try {
				is2.close();
			} catch (IOException e) {
				
			}
		}
		
		
	}

}
