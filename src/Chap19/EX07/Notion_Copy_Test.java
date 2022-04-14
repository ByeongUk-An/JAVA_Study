package Chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*	추가 기능을 제공하는 Stream 
 * 1. BufferedInputStream
 * 		InputStream에 필터를 장착해서 읽기 성능을 빠르게한 Stream
 * 		Buffer(메모리)를 사용한다.
 * 		기반 Stream의 추가 기능
 * 		단독으로 사용할 수 없다.
 * 2. BufferedOutputStream
 * 		OutputStream에 필터를 장착해서 쓰기 성능을 빠르게한 Stream
 * 		Buffer(메모리)를 사용한다.
 *  	기반 Stream의 추가 기능
 * 		단독으로 사용할 수 없다.
 */


public class Notion_Copy_Test {

	public static void main(String[] args) {
		/* 두 파일을 복사 (속도차이 확인)
		 * 	1) Buffered를 쓰지 않고 처리하는 경우
		 * 	2) Buffered를 쓰고 처리하는 경우
		 */
		
		File orgFile =  new File("C:\\Temp\\copy_test\\Notion_Setup_origin.exe");		// 원본파일
		File copyFile1 =  new File("C:\\Temp\\copy_test\\Notion_Setup_copy1.exe");		// buffered 사용하지않고 복사
		File copyFile2 =  new File("C:\\Temp\\copy_test\\Notion_Setup_copy2.exe");		// buffered 사용해서 복사
		
		/* 성능 측정을 하기위한 변수 선언
		 * start : 시작시간
		 * end : 끝나는 시간
		 * time1 : buffered를 사용하지 않는 경우의 시간
		 * time2 : buffered를 사용한 경우의 시간
		 */
		long start, end, time1, time2;
		
		
		// 1. Buffered를 사용하지 않고 처리는 경우 (InputStream, OutputStream)
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(orgFile);
				OutputStream os = new FileOutputStream(copyFile1);) {				// try with source 구문 : Auto Close
			// 데이터 복사 코드 생성
			int data;
			while ((data = is.read()) != -1) {										// 1byte단위 읽기
				os.write(data);														// 1byte단위 쓰기
			}
			
		} catch (IOException e) {
		}
		
		end = System.nanoTime()	;
		time1 = end - start;
		System.out.println("Without BufferedXXXStream : " + time1);					// Buffered를 사용하지 않고 복사한 시간
		
		
		// 2. Buffered를 사용해서 처리는 경우 (BufferedInputStream, BufferOutputStream)
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgFile);							// 기반 Stream
				BufferedInputStream bis = new BufferedInputStream(is);				// 추가기능을 제공하는 Stream, 성능을 빠르게 처리
				OutputStream os = new FileOutputStream(copyFile2);					// 기반 Stream
				BufferedOutputStream bos = new BufferedOutputStream(os)){			// 추가기능을 제공하는 Stream, 성능을 빠르게 처리
			int data;
			while ((data = bis.read()) != -1) {										// Buffer를 사용해서 읽기
				bos.write(data);													// Buffer를 사용해서 쓰기
			}
		} catch (IOException e) {
		}
		
		end = System.nanoTime()	;
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);					// Buffered를 사용하고 복사한 시간
		
		
		// 3. Buffered 사용한 경우(time2), 사용하지 않은 경우(time1)의 비율
		System.out.println("속도 차이 : " + time1/time2 + "배");
		

	}

}
