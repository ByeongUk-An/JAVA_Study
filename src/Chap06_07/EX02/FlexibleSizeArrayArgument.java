package Chap06_07.EX02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// �迭�� ���̰� �������� �ʰ� �������� ���
		// 1.method1 (int...values) <<== �������̸� ó���ϴ� input �Ű����� ����
		method1();
		method1(1, 2);
		method1(1, 2, 3);
		method1(1, 2, 3, 4);
		method1(1, 2, 3, 4, 5);
		method1(1,2,3,4,5,6,7,8,9,10);
		
		//method2
		method2 ("�ȳ�", "�氡");
		method2("��","ȭ","��","��","��","��","��");
		method2("�䳢","ȣ����","����","��");

	}
	static void method1 (int...values) {
		System.out.println(values.length);
		System.out.println(Arrays.toString(values));
		
		
		//for
		for(int i = 0; i< values.length;i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
		
		//enhanced for
		for(int ar : values) {
			System.out.print(ar +" ");
		}
		System.out.println();
	}
	static void method2 (String...value) {
		System.out.println(value.length + "String");
		System.out.println(Arrays.toString(value));
		
		//for
		for(int i = 0; i< value.length; i++) {
			System.out.print(value[i] + "String");
		}
		System.out.println();
		
		//enhanced for
		for(String arr : value) {
			System.out.print(arr + "Hi");
		}
	}
/*
	static void method1() {
		System.out.println("�Ű������� ���� �޼ҵ� ȣ��");
		
	}

	static void method1(int a, int b) {
		System.out.print(a + " , " + b);
		System.out.println();
	}
	static void method1(int a, int b, int c) {
		System.out.print(a + " , " + b+" , " + c);
		System.out.println();
	}
	static void method1(int a, int b, int c, int d) {
		System.out.print(a + " , " + b+" , " + c + " , " + d);
		System.out.println();
	}
	static void method1(int a, int b, int c, int d, int e) {
		System.out.print(a + " , " + b+" , " + c + " , " + d + " , " + e);
		System.out.println();
	}
*/

}
