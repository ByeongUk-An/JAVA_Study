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
		System.out.println("�迭�� ���� :" + k);
		System.out.println("�迭�� ����� :" + (k/value.length));
	}

	public static void main(String[] args) {
		// Car Class �� ��üȭ �ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ� �ؼ� ��� �غ�����.
		System.out.println("============sonata====================");
		Car sonata = new Car();
		sonata.company = "����";
		sonata.model = "�ҳ�Ÿ";
		sonata.color = "�Ķ���";
		sonata.maxSpead = 190;
		System.out.print(sonata.company);
		System.out.print(sonata.model);
		System.out.print(sonata.color);
		System.out.print(sonata.maxSpead);
		System.out.println();
		sonata.setCompany("���");
		sonata.setModel("bmw");
		sonata.setColor("������");
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
		bmw.color = "�丶���";
		bmw.maxSpead = 300;
		System.out.print(bmw.company);
		System.out.print(bmw.model);
		System.out.print(bmw.color);
		System.out.print(bmw.maxSpead);
		System.out.println();
		bmw.setCompany("bbmw");
		bmw.setModel("320d");
		bmw.setColor("��Ȳ��");
		bmw.setMaxSpead(50);
		System.out.print(bmw.company);
		System.out.print(bmw.model);
		System.out.print(bmw.color);
		System.out.print(bmw.maxSpead);
		System.out.println();
		
		System.out.println("============���====================");
		Car kia = new Car();
		kia.company = "Kia";
		kia.model = "k9";
		kia.color = "�����";
		kia.maxSpead = 80;
		System.out.print(kia.company);
		System.out.print(kia.model);
		System.out.print(kia.color);
		System.out.print(kia.maxSpead);
		kia.setCompany("Gia");
		kia.setModel("K5");
		kia.setColor("������");
		kia.setMaxSpead(190);
		System.out.print(kia.company);
		System.out.print(kia.model);
		System.out.print(kia.color);
		System.out.print(kia.maxSpead);
		
		System.out.println("============����====================");
		Car benz = new Car();
		benz.company = "BBenz";
		benz.model = "�ƹ氡����";
		benz.color = "#000";
		benz.maxSpead = 500;
		System.out.print(benz.company);
		System.out.print(benz.model);
		System.out.print(benz.color);
		System.out.print(benz.maxSpead);
		benz.setCompany("Benz");
		benz.setModel("eŬ����");
		benz.setColor("#00ff00");
		benz.setMaxSpead(300);
		System.out.print(benz.company);
		System.out.print(benz.model);
		System.out.print(benz.color);
		System.out.print(benz.maxSpead);
		
		System.out.println("============�Ｚ====================");
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
		
		
		//�� ������ ���� �Ҵ��ϰ� ����� ������. (�޸𸮸� ���� ���, settor�� ���ؼ� ���� �Ҵ�)
		
		//[����] : ��ĳ�ʷ� ������ �������� �޾Ƽ� �հ�, ��� ...
		System.out.println();
	
		System.out.println("�迭�� ���� ������ �Է����ּ���!!");
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
