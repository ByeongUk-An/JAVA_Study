package Chap13.EX06.EX01;
//1. �������̽��� �߻�޼ҵ带 ������ <<<Ŭ������ ����>>�� ȣ�� : ����ϰ� ����ϴ� ���
interface A{	//�������̽� , �߻�޼ҵ带 ����,
	public abstract void cry();	// �߻�޼ҵ� : public abstract �� ���� �Ǿ� �ִ�.
	void fly();
}

class B {
	A a = new C();
	void abc() {
		a.cry();
		a.fly();
	}
	
	
	
	class C implements A {	// class C�� A �������̽��� �޼ҵ带 ������ Ŭ����
		@Override
		public void cry() {
			System.out.println("�۸�");
		}
		@Override
		public void fly() {
			System.out.println("���� ���մϴ�");
		}
	}
}


public class AnonymousClass_1 {

	public static void main(String[] args) {
		B b = new B();  //
		b.abc();
	}

}
