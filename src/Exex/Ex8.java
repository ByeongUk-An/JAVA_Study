package Exex;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // ȯ���� ���� ����
		System.out.println("�ݾ��� �Է��ϼ���!!");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int mp = 0;
		
		System.out.println("���۱ݾ� :" + price);
		
		for (int i = 0; i < unit.length; i++) {
			mp=price/unit[i];
			price=price%unit[i];
			System.out.println(unit[i]+"�� ���� :"+ mp+"��");
			System.out.println("���� �ݾ� :" + price);
		}
		sc.close();
	}
}
