package Chap10.EX04;


// �޼ҵ� �������̵� (MethodOverridng) :
	// 1. �ݵ�� ��� ���迡���� �޼ҵ� �������̵��� �����ȴ�.
	// 2. �θ� Ŭ�������� ����� �޼ҵ带 ���Ӱ� �����ؼ� ��� �ϴ°�.
	// 3. @Override ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���ϼ� �ִ�.
	// 4. �ñ״��İ� ���ƾ� �Ѵ�. ( �޼ҵ��, �Ű����� Ÿ��, �Ű����� ����)
	// 5. �޼ҵ��� ���� �����ڰ� ���ų� ����� �Ѵ�.

class A {
	void print() {
		System.out.println("A Ŭ����");
	}
}
class B extends A {
	@Override  // �޼ҵ� �������̵��� , �ݵ�� �θ��� �޼ҵ带 ������ �ϵ��� ����.
			   // @Override ������̼��� ������� ���� ��� : ��Ÿ�� ���ų� ������ ���� ���� ���
			   // ������ �޼ҵ�� ���ǵ�.
	void print() {
		System.out.println("B Ŭ����");
	}
}




public class MethodOverriding {

	public static void main(String[] args) {
		//1. A Ÿ�� 
		A aa = new A();
		aa.print();          // A Ŭ������ print() ���
		//2. B Ÿ��
		B bb = new B();
		bb.print();			// B Ŭ������ print() ���
		
		// A Ÿ�� ��ĳ���� <==== �߿�! : B�� ��ĳ�����ؼ� A Ÿ������ �θ� 
		A ab = new B();
		ab.print();			// B Ŭ������ print() ���
			// ab.print()�� A Ŭ������ print�� ȣ�������� �������ε��� ���ؼ� aŬ������ print()�� ������ �ʰ� B�� �ִ� print()�� ����ش�.
		
		
	}

}
