package Chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* InputStreamReader : byte => char 단위, 읽기, Charset을 지정해서 파일을 읽을 수 있다.
 * OutputStreamWriter : byte => char 단위, 쓰기, Charset을 지정해서 파일을 쓸 수 있다.
 */



public class OutputStreamWriter_01 {

	public static void main(String[] args) {
		// FileWriter를 통해서 데이터 쓰기 (DefaultCharset : MS949)
		File osw1 = new File("JAVA\\src\\chap19\\EX08\\osw1.txt");
		try (Writer writer =  new FileWriter(osw1);){
			writer.write("OutputStreamWriter1 예제 파일입니다.\n".toCharArray());					// String을 char[] 배열에 저장
			writer.write("한글과 영문이 모두 포함되어 있습니다.");										// String
			writer.write('\n');																	// char
			writer.write("Good Bye!!!\n\n");
			writer.flush();
		} catch (IOException e) {}
		
		
		// OutputStreamWriter를 사용해서 MS949 => UTF-8 로 파일 쓰기
		File osw2 = new File("JAVA\\src\\chap19\\EX08\\osw2.txt");
		
		try (OutputStream os =  new FileOutputStream(osw2);
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8")){
			osw.write("OutputStreamWriter1 예제 파일입니다.\n".toCharArray());					// String을 char[] 배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다.");										// String
			osw.write('\n');																	// char
			osw.write("Good Bye!!!\n\n");
			osw.flush();
		} catch (IOException e) {}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
