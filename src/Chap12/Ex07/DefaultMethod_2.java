package Chap12.Ex07;

interface A { // �θ� �������̽�
	default void abc() { // �������̽����� �����ΰ� �ִ� �޼ҵ� : default
		System.out.println("A �������̽��� abc()");
	}
}
class B implements A {  //extends Object�� ������ 
	public void abc() {  // �������̵�
		A.super.abc();  // super.abc() Object Ŭ������ abc()�� ȣ�� �϶�� ���̴�. �� Class B�� �θ� ������ �ֻ��� ��ü�� Object�� �θ�� ����� �Ǵµ� ������ �Ǿ��ֵ�.
		System.out.println("BŬ������ abc()");
	}
}

public class DefaultMethod_2 {

	public static void main(String[] args) {
		//1. ��ü ����
		B b = new B();
		
		//2. �޼ҵ� ȣ��
		b.abc();  // B�� abc()�� ȣ��
		
		System.out.println("======================");
		A a1 = new B();	//�������̽��� ��ü ������ �Ұ�, Ÿ�� ������ �����ϴ�.
		a1.abc();
		
	}

}
