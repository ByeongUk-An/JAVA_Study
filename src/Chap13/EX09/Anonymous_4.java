package Chap13.EX09;

// �Ű������� �޾Ƽ� ó�� : �������̽��� ������ Ŭ���� (x) , a

interface A {
	void abc();	//public abstract
}
class C {
	void cde(A a) {
		a.abc();
	}
}

public class Anonymous_4 {

	public static void main(String[] args) {
		C c = new C();
		//3.�������̽��� ������ Ŭ������ ����. + ���������� �����ؼ� ���� �����ش�.
		A a = new A() {  //�������̽��� ������ �ڽ� �͸� ��ü������ Ÿ���� A�� ������ �������� �����ؼ� �����ش�.
			@Override
			public void abc() {
				System.out.println("Ŭ����(x) + ��������(o)"); 
			}
		};
		c.cde(a);
		
		//4.�������̽��� ������ Ŭ������ ����. + ���������� ����.  <<==== ���� ���� ���(�ӽ÷� �ѹ��� ���)
			//�̺�Ʈ ó�� ���.
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("Ŭ����(x) + ��������(x)");
			}
		});
		

	}

}
