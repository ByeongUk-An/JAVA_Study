package chap04;

import java.util.Scanner;

public class For_Ex03 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}

		for (int a = 0; a <= 10; a++) {
			System.out.println(a);
		}

		// 2�� ����� ���
		int c = 0;
		for (int j = 0; j < 100; j += 2) {
			System.out.println(j + "");
			c = j;
		}
		// for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ� �� �� �ִ�.
		for (int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println(i + "*" + j + ":" + i * j);
		}

		// for ���� ��� �ؼ� 1 ���� 100 ���� * ���� ����� ������.
		for (int i = 1, j = 1; i <= 10; i++) {
			j = i * j;
			System.out.println(j);

//			System.out.println(i+"*"+j);
//			System.out.println(j);
		}
		System.out.println("====");
		// for ���� ����ؼ� 1���� 100���� ���Ѱ�
		for (int i = 0, j = 0; i < 101; i++) {
			j += i;
			System.out.println(j);

		}

		// ���� for �� : 1�� ~ 9��
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("==================");
		}

		// for ������ ���� ���� �߻� , ������ ���� ���
		// for(int i=0; ;i++) {
		// System.out.print(i + " ");
		// }

		// ���� ���� Ż��
		for (int i = 0;; i++) {
			System.out.println(i);
			if (i > 1000) {
				break;
			}
		}

		// for ���� ����ؼ� 1���� 1000���� 4�� ����� ���� ��: ��հ� : double

		double e = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 4) == 0) {
				e += i;
			}
		}
		System.out.println("���Ѱ�" + (int) e);
		System.out.println("��հ�" + e / 250);

		// for ���� ����ؼ� 1���� 1000���� 4�� ����� ���� ��: ��հ� : double 2��°���
		double sum1 = 0;
		double j = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 4) == 0) {
				sum1 += i; // sum = sum + i //4�� ����� ���Ѵ�.
				j++;
			}
		}
		System.out.println("���� :" + sum1);
		System.out.println("���� :" + (sum1 / (j)));

	}
}
