package Chap19.EX08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class File_Reader_Writer_UTF8 {

	public static void main(String[] args) {
		// 1. 파일객체 생성
				File rwFile = new File("JAVA\\src\\chap19\\EX08\\refile_UTF8.txt");
				
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
