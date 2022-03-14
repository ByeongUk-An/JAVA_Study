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
			System.out.println("운동선수 정수 ex) 축구 11 씨름 2 탁구 2 농구 6 / 도중 중단하시려면 '그만'을 외쳐주세요!");
			k = sc.nextLine();
			s = k.split(" ");

			if (k.equals("그만")) {
				System.out.println("시스템을 종료합니다!");
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
			System.out.println("운동선수의 합 :" + sum); 
			System.out.println("운동선수의 평균 :" + (double)(sum/m));
			sc.close();
			
		}



	}

}
