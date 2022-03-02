package chap04;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 2;
//		String op = "*";
//		int result = 0;
//		
//		switch (op) {
//		case "+":
//			result = num1 + num2;
//			break;	
//		case "-":
//			result = num1 - num2;
//			break;
//		case "*":
//			result = num1 * num2;
//			break;
//		case "/":
//			result = num1 / num2;
//			break;
//		case "%":
//			result = num1 % num2;
//			break;
//		default:
//			System.out.println("잘못된 연산자 입력!");
//			result = 0;	
//			break;
//		}
//		System.out.println(result);  //1번문제 끝
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력하세요!");		
//		int num1 = sc.nextInt();
//		System.out.println("연산자를 입력하세요!");
//		char opt = sc.next().charAt(0);
//		System.out.println("두번째 숫자를 입력하세요!");
//		int num2 = sc.nextInt();
//		int result = 0;
//		if(opt == '+') {
//			result = num1 + num2;
//		}else if(opt == '-') {
//			result = num1 - num2;
//		}else if(opt == '*') {
//			result = num1 * num2;
//		}else if(opt == '/') {
//			result = num1 / num2;
//		}else if(opt == '%') {
//			result = num1 % num2;
//		}else {
//			System.out.println("잘못된 연산자 입력!");
//			return;
//		}
//		System.out.println(result);           //2번문제 끝
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("연산자를 입력하세요");
		String op = sc.next();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();
		int result = 0;
		
		switch (op) {
		case "+":
			result = num1 + num2;
			break;	
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못된 연산자 입력!");
			result = 0;	
			break;
		}
		System.out.println(result);  //3번문제끝
		
		
		
	}

}
