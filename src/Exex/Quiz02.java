package Exex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		boolean run = true;
		int nu = 0; // 스캐너로 번호를 인풋
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("================================");
			System.out.println("1. 19단출력 | 2. 홀수단만 출력 | 3. 3의 배수단만 출력 | 4. 프로그램 종료");
			System.out.println("================================");
			nu = sc.nextInt();

			if (nu == 1) { // 이중 for 문을 사용해서 19단 출력
				for (i = 2; i < 20; i++) {
					for (j = 1; j < 20; j++) {
						System.out.println(i + "*" + j + "=" + i * j);
					}
				}
			} else if (nu == 2) { // 홀수단만 출력
				for (i = 2; i < 20; i++) {
					for (j = 1; j < 20; j++) {
						if (i % 2 != 0) {
							System.out.println(i + "*" + j + "=" + i * j);
						}
					}
				}

			} else if (nu == 3) { // 3의 배수단만 출력
				for (i = 3; i < 20; i++) {
					for (j = 1; j < 20; j++) {
						if (i % 3 == 0) {
							System.out.println(i + "*" + j + "=" + i * j);
						}
					}
				}
			} else if (nu == 4) { // 프로그램 종료
				break;
			}
		} while (run);
		// 스캐너 종료
		sc.close();
		System.out.println("프로그램을 종료 합니다.");

	}

}
