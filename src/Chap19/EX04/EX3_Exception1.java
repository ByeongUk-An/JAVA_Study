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
 	1. is1 <== InputStream 객체 (절대 경로로 접근 : -ms94.txt), 예외처리 
 	2. is2 <== InputStream 객체 (상대 경로로 접근 : -utf-8.txt), 예외처리 (try ~ with resource로 예외처리)
 				close()메소드를 자동으로 처리
 */

public class EX3_Exception1 {

	public static void main(String[] args) {
		//1. is1 <== InputStream 객체 (절대 경로로 접근 : -ms94.txt), 예외처리
		File inFile = new File("D:\\abw\\JAVA_Study\\src\\Chap19\\EX04\\files\\exception-ms949.txt");
		InputStream is1 = null;  //전역 변수로 선언.  finally블락에서 is1.close()
		byte[] arr = new byte[100];
		
		
			try {
				is1 = new FileInputStream(inFile);   //객체생성
			} catch (FileNotFoundException e) {
				System.out.println("파일이 존재 하지 않습니다.");
			}
			int data = 0;
			try {
				while((data = is1.read()) != -1) {
					String str = new String(arr,0,data,Charset.forName("MS949"));
					System.out.println(str);
				}
			} catch (IOException e) {
				System.out.println("파일을 읽지 못하는 예외가 발생되었습니다.");
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
