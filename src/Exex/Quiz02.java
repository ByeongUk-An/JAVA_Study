package Exex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		boolean run = true;
		int nu = 0; // ��ĳ�ʷ� ��ȣ�� ��ǲ
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("================================");
			System.out.println("1. 19����� | 2. Ȧ���ܸ� ��� | 3. 3�� ����ܸ� ��� | 4. ���α׷� ����");
			System.out.println("================================");
			nu = sc.nextInt();

			if (nu == 1) { // ���� for ���� ����ؼ� 19�� ���
				for (i = 2; i < 20; i++) {
					for (j = 1; j < 20; j++) {
						System.out.println(i + "*" + j + "=" + i * j);
					}
				}
			} else if (nu == 2) { // Ȧ���ܸ� ���
				for (i = 2; i < 20; i++) {
					for (j = 1; j < 20; j++) {
						if (i % 2 != 0) {
							System.out.println(i + "*" + j + "=" + i * j);
						}
					}
				}

			} else if (nu == 3) { // 3�� ����ܸ� ���
				for (i = 3; i < 20; i++) {
					for (j = 1; j < 20; j++) {
						if (i % 3 == 0) {
							System.out.println(i + "*" + j + "=" + i * j);
						}
					}
				}
			} else if (nu == 4) { // ���α׷� ����
				break;
			}
		} while (run);
		// ��ĳ�� ����
		sc.close();
		System.out.println("���α׷��� ���� �մϴ�.");

	}

}
