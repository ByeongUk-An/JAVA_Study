package Chap19.EX04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/*
 	1. is1 <== InputStream ��ü (���� ��η� ���� : -ms94.txt), ����ó�� 
 	2. is2 <== InputStream ��ü (��� ��η� ���� : -utf-8.txt), ����ó�� (try ~ with resource�� ����ó��)
 				close()�޼ҵ带 �ڵ����� ó��
 */

public class EX3_Exception1 {

	public static void main(String[] args) {
		//1. is1 <== InputStream ��ü (���� ��η� ���� : -ms94.txt), ����ó��
		File inFile = new File("D:\\abw\\JAVA_Study\\src\\Chap19\\EX04\\files\\exception-ms949.txt");
		InputStream is1 = null;  //���� ������ ����.  finally������� is1.close()
		byte[] arr = new byte[100];
		
		
			try {
				is1 = new FileInputStream(inFile);   //��ü����
			} catch (FileNotFoundException e) {
				System.out.println("������ ���� ���� �ʽ��ϴ�.");
			}
			int data = 0;
			try {
				while((data = is1.read()) != -1) {
					String str = new String(arr,0,data,Charset.forName("MS949"));
					System.out.println(str);
				}
			} catch (IOException e) {
				System.out.println("������ ���� ���ϴ� ���ܰ� �߻��Ǿ����ϴ�.");
			}finally {
				if(is1 != null) {
					try {
						is1.close();
					}catch(IOException e) {
						
					}
				}
			}
				
		System.out.println();
	
		
		
		
	}

}
