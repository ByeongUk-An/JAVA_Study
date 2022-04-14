package Chap19.EX08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/* Reader/Writer
 * 문자만 처리하도록 특화된 추상클래스
 * char 단위 입출력
 * 		byte : 1byte
 * 		char : 2byte
 * UTF-16으로 처리 (모든 언어 2byte)
 * 인코딩의 신경을 덜써도 된다.
 * 
 * FileReader/FileWriter
 * Reader/Writer 를 구현한 클래스
 * charset 지정 옵션이 없다. (default Charset)
 */

/* 비교
 * OutputStream
 * 		byte 단위 출력
 * 		추상클래스
 * 		FileOutputStream이 구현
 * 		문자, 데이터, mp3, JPG, AVG... 모든 처리 가능
 * 		charset 지정 가능
 * 
 * Writer
 * 		char 단위 출력
 * 		추상클래스
 * 		FileWriter가 구현
 * 		문자만 특화 처리
 * 		charset 지정 불가능
 */



public class File_Reader_Writer {

	public static void main(String[] args) {
		// 1. 파일객체 생성
		File rwFile = new File("JAVA\\src\\chap19\\EX08\\refile.txt");
		
		try (Writer writer = new FileWriter(rwFile);){
			writer.write("안녕하세요\n".toCharArray());					// .toCharArray() : String을 char[] 배열에 저장
			writer.write("Hello \n");										// String
			writer.write('A');											// char
			writer.write('\r');											// char
			writer.write('\n');											// char
			writer.write("반값습니다", 2, 3);
			writer.flush();
			
		} catch (IOException e) {}
		
		// 2. FileReader를 이용한 파일 읽기 (Default MS949)  **Characterset 지정옵션이 없다. 무조건 default
		
		try (Reader reader = new FileReader(rwFile);){
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		

	}

}
