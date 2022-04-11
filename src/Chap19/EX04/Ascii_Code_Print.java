package Chap19.EX04;

/*
 	ASCII 코드 값 출력 : 1byte=8bit , 제일 처음비트는 부호 비트, 7bit
 		1 ~ 32비트 까지는 : 출력을 할수없는 특수한 코드, 예) null, 헤더의 시작, 경고음(7) 개행 10, (LF)
 		127 : delete.
 		
 		실제 출력 가능한 33번비트 ~ 126비트
 		영문, 숫자, 특수문자.
 		
 		출력
 		====================================
 		ASCII   문자        ASCII    문자
 		====================================
 		33       !          34      &
 		35       #          36      $
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("ASCII \t 문자 \t\t ASCII \t 문자");
		System.out.println("====================================");
		for (char c = 33; c <= 126; c++) {
			if (c % 2 != 0) {
				System.out.print(c + " = " + (int)c );
			}

			if (c % 2 == 0) {
				System.out.println("\t\t\t" +c + " = " + (int)c);
				
			}

		}
	}

}
