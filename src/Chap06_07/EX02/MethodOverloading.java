package Chap06_07.EX02;

class B {
	static String name = "BTS" ;  //static Ű�� �Ҵ��� �Ǹ� ��ü �������� ȣ��
	
	static void print() {
		System.out.println(name);
		System.out.println("static �� ���� �޼ҵ��Դϴ�.");
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		// �޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű�����Ÿ��, ������ ���� ���� �ٸ� �޼ҵ尡 ȣ��� (Java ������ ����)
		// �޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ����ϴ°�
		
		// static : ��ü ���� ���� �ٷ� ȣ�� �ؼ� ��밡���ϵ��� �� �� �ִ� Ű����
			//��ü�̸��� �ƴ϶� Ŭ���� �̸����� ȣ���ؼ� ��밡��
		System.out.println(B.name); //��ü�̸��� �ƴ� Ŭ���� �̸����� ȣ���� ����
		B.print();					// Ŭ���� �̸����� ȣ��
		
		System.out.println("========================");
		
		print1();	// static�� �� �ְ� ������ Ŭ������ ������ �޼ҵ�� �ٷ� ȣ�� ����
		print1(13);	//�Ű������� 1���̰� intŸ���� �޼ҵ带 ȣ��
		print1(13.3); //�Ű������� 1���̰� double Ÿ���� �޼ҵ� ȣ��
		print1(2,5); //�Ű� ������ 2���� Ÿ��
		
		
	}
	//�޼ҵ� �������̵� : �޼ҵ� �̸��� ����, �Ű�����Ÿ��, �Ű����� ������ ���� �ش� �޼ҵ带 ȣ��
	public static void print1() { // �޼ҵ� �̸� �տ� static : 
		System.out.println("�����Ͱ������ϴ�.");
	}
	public static void print1(int a) {
		System.out.println("���� :" + a);
	}
	public static void print1(double a) {
		System.out.println("double :" + a);
	}
//	public static void print1(double k) { //�Ű������� 1, ������ Ÿ���� double
//		System.out.println(k);
//	}
	
	
	
	
	
	
	public static void print1(int a, int b) {
		System.out.println("a :" + a +" , " + "b :" + b);
	}

}
