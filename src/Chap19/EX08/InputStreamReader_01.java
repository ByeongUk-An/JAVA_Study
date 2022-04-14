package Chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* InputStreamReader/ OutputStreamWriter
 * 		Stream의 byte 데이터를 char데이터로 변환하는 객체
 * 		인코딩을 지정할 수 있다.
 * 		byte 포멧은 인코딩을 잘 지정해주어야 한다.
 * 		char 포멧으로 바꾸면 인코딩 타입을 신경쓸 필요가없다.
 * 		사용목적 1. FileReader : default charset 만 사용가능하여서, 현재 Default charset MS949 이지만 외부 파일이 UTF-8 로 읽어올 경우
 * 		사용목적 2. 네트워크에서 전송되는 스트림이 UTF-8, MS-949 byte ===> char로 변환해서 처리
 */


public class InputStreamReader_01 {

	public static void main(String[] args) {
		// 1. 파일 객체 생성 및 읽기
		File isr = new File("JAVA\\src\\chap19\\EX08\\isr.txt");		// isr.txt 는 UTF-8로 저장되어져 있다.
		
		try (Reader reader = new FileReader(isr);){						// FileReader는 인코딩 설정이 되지 않는다. defaultCharset만 가능
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("========================================");
		
		// 2. FileInputStream + InputStreamReader를 이용한 파일 읽기
		try (InputStream is = new FileInputStream(isr);
				InputStreamReader isr1 = new InputStreamReader(is, "UTF-8")){
			int data;
			while((data = isr1.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
		
		
	}

}
