package Exex;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		// 양의 정수 10개 {1,5,99,22,345,125,2346,55,32,85} 를 입력하면 3의 배수 {99,345,2346} 이 나와야
		// 한다.
		System.out.println("양의 정수 10개를 입력하시오");
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.println(arr[i] + " ");
			}
		}
		sc.close();
	}
}
