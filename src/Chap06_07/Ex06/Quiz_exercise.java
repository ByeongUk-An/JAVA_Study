package Chap06_07.Ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_exercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k;
		String[] s;
		int sum = 0;
		int c = 0;
		int m = 0;

		while (true) {
			System.out.println("����� ���� ex) �౸ 11 ���� 2 Ź�� 2 �� 6 / ���� �ߴ��Ͻ÷��� '�׸�'�� �����ּ���!");
			k = sc.nextLine();
			s = k.split(" ");

			if (k.equals("�׸�")) {
				System.out.println("�ý����� �����մϴ�!");
				return;
			}

			for (int i = 0; i < s.length; i++) {
				if (i % 2 == 0) {
					m += 1;

				} else {
					c = Integer.parseInt(s[i]);
					sum += c;
				}
			}
			System.out.println("������� �� :" + sum); 
			System.out.println("������� ��� :" + (double)(sum/m));
			sc.close();
			
		}



	}

}
