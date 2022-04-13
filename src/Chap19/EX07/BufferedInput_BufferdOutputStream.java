package Chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//추가 기능을 제공하는 스트림, 기반스트림이 존재해야한다. 단독으로 사용할 수 없다.
//BufferdInputStream : InputStream 에 필터를 장착해서 (읽기) 성능을 아주 빠르게 하는 스트림. 
	// , 단독으로 사용 할 수 없다. 기반스트림에 추가기능을 제공
//BufferdOutputStream : OutputStream 에 필터를 장착해서 (쓰기) 성능을 아주 빠르게 하는 스트림.
	// , 단독으로 사용 할 수 없다. 기반스트림에 추가기능을 제공

public class BufferedInput_BufferdOutputStream {
	public static void main(String[] args) {
		//두파일을 복사, Buffered 를 사용하지 않고 처리하는 경우
		
		File orgfile = new File("Chap19\\EX07\\mycat_origin.jpg"); //원본 파일.
		File copyfile1 = new File("Chap19\\EX07\\mycat_copy1.jpg"); //Buffered를 사용하지 않고 처리하는경우
		File copyfile2 = new File("Chap19\\EX07\\mycat_copy2.jpg"); //Buffered를 사용하는 경우
		
		//성능 측정을 하기위한 변수 선언.
		long start,end,time1,time2; //time1 : Buffered를 사용하지 않는경우 , time2 : Buffered를 사용한 경우
		
		//1. Buffered 를 사용하지 않고 처리하는 경우 (BufferedInputStream, BufferOutStream)
		start = System.nanoTime();  //시작 시간
		
		try(InputStream is = new FileInputStream(orgfile);		//Auto close()
			OutputStream os = new FileOutputStream(copyfile1);	//Auto close()
				) {
			//데이터 복사 코드 생성.
			int data;
			while((data = is.read()) != -1) { //is 에서 1byte읽어서       ,-1은 마지막 까지. 
				os.write(data);				  // os에 1byte 쓰기 
			}
		} catch (IOException e1) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream" + time1); //버퍼를 사용하지 않고 복사. copy1.jpg
		
		
		//2. Buffered를 사용하면서 처리하는 경우 (BufferdInputStream)
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgfile); 
			 BufferedInputStream bis = new  BufferedInputStream(is);
			 OutputStream os = new FileOutputStream(copyfile2);
			 BufferedOutputStream bos = new BufferedOutputStream(os);  //Auto close()
				) {
			//복사할 코드 생성
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (IOException e) {}
		
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);
		
		// Buffered 사용한 경우 (time2), Buffered 사용하지 않는 경우 (time1)
		System.out.println("속도 차이 몇 배 :"+time1 / time2);
	}

}
