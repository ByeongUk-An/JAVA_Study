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
//			System.out.println("�߸��� ������ �Է�!");
//			result = 0;	
//			break;
//		}
//		System.out.println(result);  //1������ ��
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° ���ڸ� �Է��ϼ���!");		
//		int num1 = sc.nextInt();
//		System.out.println("�����ڸ� �Է��ϼ���!");
//		char opt = sc.next().charAt(0);
//		System.out.println("�ι�° ���ڸ� �Է��ϼ���!");
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
//			System.out.println("�߸��� ������ �Է�!");
//			return;
//		}
//		System.out.println(result);           //2������ ��
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		String op = sc.next();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
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
			System.out.println("�߸��� ������ �Է�!");
			result = 0;	
			break;
		}
		System.out.println(result);  //3��������
		
		
		
	}

}
