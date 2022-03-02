package chap03;

import java.util.Scanner;

public class ScanHomework {

	public static void main(String[] args) {
		System.out.println("정수값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		System.out.println(((a%3)==0) ? "3의 배수입니다" : "3의 배수가 아닙니다.");
		
//		if((a % 3)==0) {
//			System.out.println("3의 배수입니다.");
//		}else {
//			System.out.println("3의 배수가 아닙니다");
//		}
		
	}

}
