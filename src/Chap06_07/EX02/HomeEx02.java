package Chap06_07.EX02;

import java.util.Scanner;

public class HomeEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int[] num = new int[size];
		for( int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
