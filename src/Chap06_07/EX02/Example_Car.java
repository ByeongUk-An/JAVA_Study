package Chap06_07.EX02;

import java.util.Arrays;
import java.util.Scanner;

public class Example_Car {
	static void num (int...value) {
		System.out.println(value.length);
		System.out.println(Arrays.toString(value));
		int k = 0;
		
		for(int i =0; i<value.length;i++) {
			k += value[i];
			
			
		}
		System.out.println("배열의 합은 :" + k);
		System.out.println("배열의 평균은 :" + (k/value.length));
	}

	public static void main(String[] args) {
		// Car Class 를 객체화 해서 5개의 객체를 생성해서 값을 할당 해서 출력 해보세요.
		System.out.println("============sonata====================");
		Car sonata = new Car();
		sonata.company = "현대";
		sonata.model = "소나타";
		sonata.color = "파란색";
		sonata.maxSpead = 190;
		System.out.print(sonata.company);
		System.out.print(sonata.model);
		System.out.print(sonata.color);
		System.out.print(sonata.maxSpead);
		System.out.println();
		sonata.setCompany("기아");
		sonata.setModel("bmw");
		sonata.setColor("빨간색");
		sonata.setMaxSpead(30);
		System.out.print(sonata.company);
		System.out.print(sonata.model);
		System.out.print(sonata.color);
		System.out.print(sonata.maxSpead);
		System.out.println();
		
		System.out.println("============bmw====================");
		Car bmw = new Car();
		bmw.company = "BMW";
		bmw.model = "520d";
		bmw.color = "토마토색";
		bmw.maxSpead = 300;
		System.out.print(bmw.company);
		System.out.print(bmw.model);
		System.out.print(bmw.color);
		System.out.print(bmw.maxSpead);
		System.out.println();
		bmw.setCompany("bbmw");
		bmw.setModel("320d");
		bmw.setColor("주황색");
		bmw.setMaxSpead(50);
		System.out.print(bmw.company);
		System.out.print(bmw.model);
		System.out.print(bmw.color);
		System.out.print(bmw.maxSpead);
		System.out.println();
		
		System.out.println("============기아====================");
		Car kia = new Car();
		kia.company = "Kia";
		kia.model = "k9";
		kia.color = "국방색";
		kia.maxSpead = 80;
		System.out.print(kia.company);
		System.out.print(kia.model);
		System.out.print(kia.color);
		System.out.print(kia.maxSpead);
		kia.setCompany("Gia");
		kia.setModel("K5");
		kia.setColor("베이지");
		kia.setMaxSpead(190);
		System.out.print(kia.company);
		System.out.print(kia.model);
		System.out.print(kia.color);
		System.out.print(kia.maxSpead);
		
		System.out.println("============벤츠====================");
		Car benz = new Car();
		benz.company = "BBenz";
		benz.model = "아방가르드";
		benz.color = "#000";
		benz.maxSpead = 500;
		System.out.print(benz.company);
		System.out.print(benz.model);
		System.out.print(benz.color);
		System.out.print(benz.maxSpead);
		benz.setCompany("Benz");
		benz.setModel("e클래스");
		benz.setColor("#00ff00");
		benz.setMaxSpead(300);
		System.out.print(benz.company);
		System.out.print(benz.model);
		System.out.print(benz.color);
		System.out.print(benz.maxSpead);
		
		System.out.println("============삼성====================");
		Car sam = new Car();
		sam.company = "Sam";
		sam.model = "SM6";
		sam.color = "white";
		sam.maxSpead = 200;
		System.out.print(sam.company);
		System.out.print(sam.model);
		System.out.print(sam.color);
		System.out.print(sam.maxSpead);
		sam.setCompany("Samsung");
		sam.setModel("sm3");
		sam.setColor("Red");
		sam.setMaxSpead(500);
		System.out.print(sam.company);
		System.out.print(sam.model);
		System.out.print(sam.color);
		System.out.print(sam.maxSpead);
		
		
		//각 변수의 값을 할당하고 출력해 보세요. (메모리를 직접 사용, settor를 통해서 값을 할당)
		
		//[문제] : 스캐너로 임의의 정수값을 받아서 합계, 평균 ...
		System.out.println();
	
		System.out.println("배열의 방의 갯수를 입력해주세요!!");
		Scanner arnum = new Scanner(System.in);
		int b = arnum.nextInt();
		
		Scanner crnum = new Scanner(System.in);
		int[] arr = new int[b];
		for(int i = 0; i< b; i++) {
			arr[i] = crnum.nextInt();
		}
		num(arr);
		arnum.close();
		
	}

}
