package Chap06_07.EX02;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	
	static void math (String...values) {
		int sum = 0;
		double avg; // 평균을 저장하는 필드
		for( int i = 0; i<values.length; i++) {
			sum+= Integer.parseInt(values[i]);
		}
		avg = (double) sum / values.length;  //평균은 : double 타입이어야 한다.
		System.out.println();
		System.out.println("임의로 들어온 정수의 합계는 :" + sum);
		System.out.println("임의로 들어온 정수의 평균은 :" + avg);
	}

	public static void main(String[] args) {
		// 임의의 값을 할당 받아서 합계와 평균을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값을 공백을 넣어서 입력하세요. >>>");

		String num = sc.nextLine(); // 공백이 들어가므로 전체 정수 값을 String
		String[] array1 = num.split(" "); // split 는 구분자를 기준으로 글자를 잘라서 배열에 저장

//		for (int i = 0; i < array1.length; i++) {
//			System.out.print(array1[i] + " ");
//		}
		math(array1);

	}

}
