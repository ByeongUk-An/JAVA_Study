package Chap19.EX08;

import java.io.InputStreamReader;


 
 /*InputStreamReader isr = new InputStreamReader (System.in, Charset)
 * InputStreamReader : byte => char 단위로 변환
 * System.in : 콘솔 입력, byte
 * 
 * 
 */




public class InputStreamReader_02 {

	public static void main(String[] args) {
		// 1. console 입력 (MS949) : defaultCharset, byte 스트림
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
			System.out.println("한글을 입력해주세요. >>");
			int data;
			while ((data = isr.read()) != '\r') {						// console 입력을 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
		} catch (Exception e) {
		}
		
		
		System.out.println("=====================================================");
		
		// 2. console 입력 (UTF-8)
		
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");){
			System.out.println("한글을 입력해주세요. >>");
			int data;
			while ((data = isr.read()) != '\r') {						// console 입력을 대기
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
		} catch (Exception e) {}
		
	}

}
