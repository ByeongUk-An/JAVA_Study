package Chap12.Ex05;

//1. ���1 : ��ü�� ������ �����ϴ� ���
//2. ���2 : �͸�Ŭ������ �̿��ϴ� ���

// �������̽� ���� : ����� �ְ� ���α׷��� (PM)

interface A {
	double PI = 3.14;  // �������̽��� �ʵ�� public static final �� ������ �Ǿ� �ִ�.
	void run();		   // public abstract
}
class B implements A {
	@Override
	public void run() {  // public ����
		System.out.println("�޸��ϴ�");
	}
}

public class Interface_5 {

	public static void main(String[] args) {
		//1. ��ü ������ ���
		A a1 = new B();
		a1.run();
		
		A a2 = new B() {
			public void run() {
				System.out.println("�޷���");
			};
		};
		
		a2.run();
	}

}
