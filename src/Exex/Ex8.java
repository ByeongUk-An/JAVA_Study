package Exex;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 환산할 돈의 종류
		System.out.println("금액을 입력하세요!!");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int mp = 0;
		
		System.out.println("시작금액 :" + price);
		
		for (int i = 0; i < unit.length; i++) {
			mp=price/unit[i];
			price=price%unit[i];
			System.out.println(unit[i]+"원 갯수 :"+ mp+"개");
			System.out.println("남은 금액 :" + price);
		}
		sc.close();
	}
}
