package Chap10.Ex06;

//super : �θ� Ŭ����
//this : �ڽ��� ��ü

//���� ���̵� : �θ��� �޼ҵ尡 ������ ���� ���� �ʾƴ�.
class A {
	void abc() {
		System.out.println("A Ŭ������ abc()");
	}
}
class B extends A {
	void abc() {
		System.out.println("B Ŭ������ abc()");
	}
	void bcd() {
		abc(); // this.abc  // this�� �ڽ��� ��ü
		super.abc();
	}
}

public class SuperKeyword_1 {

	public static void main(String[] args) {
		//1. ��ü ���� 
		B bb = new B();
		//2. �޼ҵ� ȣ��
		bb.bcd();

	}

}
