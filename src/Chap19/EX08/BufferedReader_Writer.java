package Chap19.EX08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedReader_Writer {

	public static void main(String[] args) {
		// 1. 파일 객체 생성
		File rwfile = new File("JAVA\\src\\chap19\\EX08\\BufferedFile.txt");
		
		// 2. FileWriter를 이용해서 쓰기 (MS949)
		try (Writer writer = new FileWriter(rwfile);
				BufferedWriter bw = new BufferedWriter(writer)){					// 성능향상을 위한 Filter
			bw.write("안녕하세요\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다.", 2, 3);
			bw.flush();
		} catch (Exception e) {}
		
		// 3. FileReader를 이용해서 읽기 (MS949)
		/* readLine()
		 * BufferedReader에만 존재하는 메소드
		 * 한 라인씩 읽는다.
		 * 리턴타입이 String
		 * 파일의 끝을 나타낼때, null
		 */
		try (Reader reader = new FileReader(rwfile);
				BufferedReader br = new BufferedReader(reader)){
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {}
		
		
		
		
	}

}
