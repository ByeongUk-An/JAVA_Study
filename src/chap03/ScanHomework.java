package chap03;

import java.util.Scanner;

public class ScanHomework {

	public static void main(String[] args) {
		System.out.println("�������� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		System.out.println(((a%3)==0) ? "3�� ����Դϴ�" : "3�� ����� �ƴմϴ�.");
		
//		if((a % 3)==0) {
//			System.out.println("3�� ����Դϴ�.");
//		}else {
//			System.out.println("3�� ����� �ƴմϴ�");
//		}
		
	}

}
