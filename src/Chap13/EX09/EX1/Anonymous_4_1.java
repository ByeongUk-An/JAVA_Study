package Chap13.EX09.EX1;

interface A {
	void cry();
	void fly();
}
class C {
	void abc(A a) {
		a.cry();
		a.fly();
	}
}


public class Anonymous_4_1 {
	public static void main(String[] args) {
		//1. Ŭ���� ���� (x) + ���� ����(o)
		C c = new C();
		A a = new A() {
		@Override
		public void cry() {
			System.out.println("�۸�");
		}
		@Override
			public void fly() {
			System.out.println("�������� �����ƿ�");
			}
		};
		c.abc(a);
		
		//2. Ŭ������ ���� (x) + ���� ���� (x)
		C cc = new C();
		cc.abc(new A() {
			@Override
			public void cry() {
				System.out.println("�Ŀ�");
			}
			@Override
			public void fly() {
				System.out.println("����̴� ���� ���մϴ�.");
			}
		});
		
	
		
		
		
	}

}
