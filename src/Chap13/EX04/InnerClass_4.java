package Chap13.EX04;

//���� �̳�Ŭ���� : Ŭ������ �޼ҵ� ���ο� ����� Ŭ����
	//�޼ҵ� ������ �ʵ�� final Ű�� ������. ���� ���� �� �� ����.
	//�����̳�Ŭ�������� ���Ǵ� ���� ������ �ڵ����� final �� ���� �ȴ�. ������ �����Ϸ��� �ڵ����� �Ҵ��� ��.

class A {
	int a = 3;	// �ʵ� : Heap ������ ���� , �ݵ�� �ʱ�ȭ�� ������ �����.
				//�ʵ� �ʱⰪ�� �Ҵ��Ŀ� ���� �����Ҷ��� ��üȭ �ؼ� ���� ����
				//�����ڳ� setter�� ���ؼ� �ʱⰪ�� �Ҵ��Ŀ� ��ü�� ����
	A(int a) {	//�����ڸ� ���ؼ� a�� �ʱⰪ �Ҵ�
		this.a = a;
	}
	public void setA(int a) {	//setter�� ���ؼ� �ʵ��� ���� �ʱ�ȭ
		this.a = a;
	}
	void ccc() {	//���� ���� : �޼ҵ� ������ ����, �޸��� ���ذ����� ����
		int a = 3;	//���� ���� �ʱ� �� 3 �Ҵ�.
		a = 4;		//a ������ ���� 4�� ����
		a = 10; 	//a ������ ���� 10���� ����
		int b;	//���� �ʱ�ȭ�� ���� �ʴ´�.
		
	}
	
	void abc() {
		int b = 5;	//���� ���� : �޼ҵ� ���ο� ����� ���� (final�� ����)
					//���� �̳�Ŭ�������� ���� ��� : final
		//	b = 10; //�ڵ����� final Ű�� �����Ϸ��� ���ؼ� �ڵ����� �Ҵ�.
		int c = 10;
			c= 20;
		class B {	//���� �̳� Ŭ����
			void bcd() {
				System.out.println(a);	// �ʵ�
				System.out.println(b);	// ��������
				a = 5;	// �ʵ�� �������� ����
				//b = 7;	//����Ŭ���� ���ο� ����� ���������� �ڵ����� finalŰ�� �����Ϸ��� ���ؼ� �Ҵ��
			}
		}
		B bb = new B();
		bb.bcd();
		
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
		//1. ��ü�� ������ �޼ҵ� ȣ��
		A a = new A();
		a.abc();
	}

}