package Chap13.EX10.EX1;

class A {
	B b; // B : �������̽� Ÿ��, b : ���� ���� : ���� �Ҵ� �ϴ� ���
			// b : null
			// 1. ��ü ������ ���� �Ҵ�.
			// 2. �����ڸ� ���ؼ� ���� �Ҵ�.
			// 3. setter�� ���ؼ� ���� �Ҵ�.

	A() {
	} // �⺻������

	A(B b) {
		this.b = b;
	}
	

	public void setB(B b) {
		this.b = b;
	}

	interface B {
		void play();

		void stop();
	}

	void abc() { // play()������, stop() ������
		b.play();
		b.stop();
	}
}

public class Innerinterface_1_1 {
	public static void main(String[] args) {
		
		//3. setter�� ���ؼ� ���� �Ҵ�
		A a = new A();
		a.setB(new A.B() {

			@Override
			public void stop() {
				System.out.println("�����ּ���");
			}

			@Override
			public void play() {
				System.out.println("��������ּ���");
			}

		});
		a.abc();

		System.out.println("===========================");
		// 1. ��ü ������ �ʵ��� ���� �Ҵ�.
		A a1 = new A();
		a1.b = (A.B) new A.B() {
			public void play() {
				System.out.println("±±");
			};

			public void stop() {
				System.out.println("���� �ϴ��� ���ϴ�.");
			};
		}; // �������̽� A.B
		a1.abc();
		System.out.println("==============================");
		// 2. �����ڸ� �̿��ؼ� ���� �Ҵ�
		A a2 = new A(new A.B() {

			@Override
			public void stop() {
				System.out.println("����� �۸�");
			}

			@Override
			public void play() {
				System.out.println("�������� �۸�");
			}
		}); // ������ ���ο� A.B Ÿ���� ��ü ������ ����
		a2.abc();
	}

}