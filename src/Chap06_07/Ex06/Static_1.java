package Chap06_07.Ex06;

class Aaa {
	int m = 3; // �ʵ�(�ν��Ͻ� �ʵ�) : ��ü�� �����Ŀ� ��� ����
	static int n = 4; // �ʵ�(static �ʵ�) : ��ü �������� ��밡��, ��ü �����Ŀ��� ����� ����
						// ��� ��ü�� �����ϴ� ����

	void print1() { // �޼ҵ� (�ν��Ͻ� �޼ҵ�) : ��ü�� �����ؾ� ��밡��
		//�ν��Ͻ� �ʵ��, static �ʵ尡 �� �� �ִ�.
		System.out.println("�ν��Ͻ� �޼ҵ� ���" + " : m :" + m);
	}

	static void print2() { // �޼ҵ� (static �޼ҵ�) : ��ü �������� ��밡��, ��ü �����Ŀ��� ��밡��
		//static �޼ҵ� ������ �ν��Ͻ� �ʵ尡 �� �� ����. static �ʵ常 �;��Ѵ�.
			// static �޼ҵ�� ��ü �������� ȣ���� �ǹǷ� �ν��Ͻ� �ʵ尡 �� �� ����.
		System.out.println("static �޼ҵ� ���" + ": n :" + n );
		
	}
}

public class Static_1 {

	public static void main(String[] args) {
		// 1. ��ü ������ �ʵ�� �޼ҵ� ȣ�� ( �ν��Ͻ� �ʵ�, static �ʵ�, �ν��Ͻ� �޼ҵ�, static �޼ҵ� ) ��� ȣ��
		Aaa aaa = new Aaa();
		aaa.m = 10; // �ν��Ͻ� �ʵ� ȣ��
		aaa.n = 20; // static �ʵ� ȣ��
		aaa.print1(); // �ν��Ͻ� �޼ҵ� ȣ��
		aaa.print2(); // static �޼ҵ� ȣ��
		// 2. ��ü �������� Ŭ���������� static �ʵ�� �޼ҵ� ȣ�� ( static �ʵ�� static �޼ҵ常 ȣ���� ����
		Aaa.n = 100;   // static �ʵ� : Ŭ���� ������ ȣ���
		Aaa.print2();  // static �޼ҵ� : Ŭ���� ������ ȣ���
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n); //100
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n); //100
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n); //100
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);  // 100
		
		eee.n=300;
		System.out.println("=====static �ʵ尡 ����� �ʵ�� ��� ��ü���� �������� �ٶ󺸴� ����=====");
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
	}

}