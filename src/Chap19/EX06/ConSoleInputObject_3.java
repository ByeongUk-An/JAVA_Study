package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConSoleInputObject_3 {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;  // is 콘솔을 통해서 인풋을 받겠다.

		System.out.println("영문만 입력하세요.");
		
		//1. 1-byte 단위 읽기
		int data;
		while((data = is.read()) != '\r') { // '\r'  
			System.out.print((char)data);
		}
		
		is.read(); //10 <== \n
		
		System.out.println();
		System.out.println();
		System.out.println("=============");
		
		//2. n-byte 읽기 ( byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);  //count1은 100, 100, 30, -1
		
		for(int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1 = " + count1 );
		}
		
		int count2 ;
		
		count2 = is.read(byteArray1);	//배열 내부에 \r\n 들어간다.
		
		System.out.println(new String(byteArray1,0,count2));
		
//		while((count2 = is.read(byteArray1))  != '\r') {
//			System.out.println(new String(byteArray1));
//		}
//		
		//3. n-byte 단위로 읽고 (length 만큼 읽어 와서 byte[] offset 위치에 저장.
		
		byte[] byteArray2 = new byte[8];  //
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray2,offset,length);
		
		for(int i = 0; i < offset + length; i++) {
			System.out.println((char)byteArray2[i]);
		}
		
		is.close();  //제일 마지막에 처리 해줘야 한다. 중간에 close() 하면 다시 호출이 불가능
		
		
	}

}
