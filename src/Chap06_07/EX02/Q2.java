package Chap06_07.EX02;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	
	static void math (String...values) {
		int sum = 0;
		double avg; // ����� �����ϴ� �ʵ�
		for( int i = 0; i<values.length; i++) {
			sum+= Integer.parseInt(values[i]);
		}
		avg = (double) sum / values.length;  //����� : double Ÿ���̾�� �Ѵ�.
		System.out.println();
		System.out.println("���Ƿ� ���� ������ �հ�� :" + sum);
		System.out.println("���Ƿ� ���� ������ ����� :" + avg);
	}

	public static void main(String[] args) {
		// ������ ���� �Ҵ� �޾Ƽ� �հ�� ����� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ������ �־ �Է��ϼ���. >>>");

		String num = sc.nextLine(); // ������ ���Ƿ� ��ü ���� ���� String
		String[] array1 = num.split(" "); // split �� �����ڸ� �������� ���ڸ� �߶� �迭�� ����

//		for (int i = 0; i < array1.length; i++) {
//			System.out.print(array1[i] + " ");
//		}
		math(array1);

	}

}
