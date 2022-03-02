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

		// 2의 배수를 출력
		int c = 0;
		for (int j = 0; j < 100; j += 2) {
			System.out.println(j + "");
			c = j;
		}
		// for문 내에서 초기값과 증가값은 여러 변수를 할당 할 수 있다.
		for (int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println(i + "*" + j + ":" + i * j);
		}

		// for 문을 사용 해서 1 부터 100 까지 * 값을 출력해 보세요.
		for (int i = 1, j = 1; i <= 10; i++) {
			j = i * j;
			System.out.println(j);

//			System.out.println(i+"*"+j);
//			System.out.println(j);
		}
		System.out.println("====");
		// for 문을 사용해서 1부터 100까지 더한값
		for (int i = 0, j = 0; i < 101; i++) {
			j += i;
			System.out.println(j);

		}

		// 이중 for 문 : 1단 ~ 9단
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("==================");
		}

		// for 문에서 무한 루프 발생 , 조건이 없을 경우
		// for(int i=0; ;i++) {
		// System.out.print(i + " ");
		// }

		// 무한 루프 탈출
		for (int i = 0;; i++) {
			System.out.println(i);
			if (i > 1000) {
				break;
			}
		}

		// for 문을 사용해서 1부터 1000까지 4의 배수만 더한 값: 평균값 : double

		double e = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 4) == 0) {
				e += i;
			}
		}
		System.out.println("더한값" + (int) e);
		System.out.println("평균값" + e / 250);

		// for 문을 사용해서 1부터 1000까지 4의 배수만 더한 값: 평균값 : double 2번째방법
		double sum1 = 0;
		double j = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 4) == 0) {
				sum1 += i; // sum = sum + i //4의 배수만 더한다.
				j++;
			}
		}
		System.out.println("합은 :" + sum1);
		System.out.println("합은 :" + (sum1 / (j)));

	}
}
