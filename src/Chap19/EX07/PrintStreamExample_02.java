package Chap19.EX07;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamExample_02 {

	public static void main(String[] args) {
		
		// �뙆�씪 媛앹껜 �깮�꽦
		File outFile1 = new File("JAVA\\src\\chap19\\EX07\\printstream3.txt");
		
		//
		try (PrintStream ps = new PrintStream(outFile1)){
			ps.println(9.8);												// 異쒕젰 �썑, �씪�씤媛쒗뻾
			ps.print(3 + "�븞�뀞" + 12345 + "\n");								// 異쒕젰 �썑, �씪�씤媛쒗뻾X
			ps.printf("%d �씠 �샇異쒕릺�뿀�뒿�땲�떎. \n",7);								// %d : int 媛믪쓣 �샇異�
			ps.printf("%s %f �씠 �샇異쒕릺�뿀�뒿�땲�떎.","�븞�뀞",5.8);						// %s : String, %f : double 媛믪쓣 �샇異�		
		} catch (Exception e) {
		}
		
		//
		try(InputStream is = new FileInputStream(outFile1);) {
			int count;
			byte[] byteArray1 =  new byte[100];
			count = is.read(byteArray1);
			
			System.out.println(new String(byteArray1, 0, count, Charset.forName("UTF-8")));
			
		} catch(Exception e) {
			
		}
	}
}
