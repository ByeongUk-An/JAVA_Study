package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : 추상 클래스  <== FIleInputStream을 구현한 클래스
//OutPutStream : 추상 클래스 <== FileOutputStream을 구현한 클래스

//FileInputStream : byte()단위 데이터 읽기
//FileOutputStream : byte() 단위 데이터 쓰기.

//Windoes 콘솔, 메모장 Enter를 넣으면 : \r\n

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		
		// 1. 입력 파일 생성 
		File outFile = new File("Chap19/EX05/FileOutput1.txt");
		
		// 2. 1개의 bytes 씩 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutputStream에 존재하지 않는 파일을 넣으면 실행시 파일이 생성됨.
			//FileInputStream은 경로에 파일이 존재해야된다. 존재하지않으면 예외발생
		
		
		os1.write('J');		//write : IOException
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');  // 13 엔터  <== 생략 가능
		os1.write('\n');  // 10 엔터
			
			//중요 : write() 메서드는 버퍼에(RAM)에 쓰기, 버퍼가 꽉차면 파일에 쓰기
			// flush() : 버퍼(RAM)에 저장된 내용을 파일에 강제로 쓰기 할 때 사용.
		
		os1.flush(); // 버퍼가 꽉 차지 않더라도 강제로 파일에 쓰기를 한다. , <== 생략가능
		os1.close(); // close() 호출시 flush()가 작동이 된다.
		
		
		//3. n-byte 단위 쓰기 (byte[]의 offset 부터 length  개의 byte 데이터 쓰기)
		
		
		OutputStream os2 = new FileOutputStream(outFile);  //덮어쓰기.   // (outFile) 이런씩으로 적으면 기본적으로  "," 뒤에 false가 온다.
			//FileOutputStream(File o, Boolean append) append = true : 이어쓰기, append = false : 덮어쓰기(기본값)
			
		byte[] byteArray1 = "Hello".getBytes();   // Hello는 String인데 이것을 byte로 변환 해줘야 한다.(String --> byte 로 변환) : getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); 	// \r은 생략 가능, \n만 넣어도 Windoes 에서 Enter 처리가됨.
		
		os2.flush();
		os2.close();
		
		//4. n-byte 단위 쓰기 (byte[] 의 offset 부터 length 개의 byte 데이터쓰기)
	
		OutputStream os3 = new FileOutputStream(outFile, true);  //이어쓰기.
		
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2,10,8); //write 일때는 3byte 뒤에서 8읽어서 저장.
									// 주의 : read()는 length를 읽고 offset이 실행
		
		os3.flush();
		os3.close();
		
		
	}

}
