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
		//1. 클래스 존재 (x) + 참조 변수(o)
		C c = new C();
		A a = new A() {
		@Override
		public void cry() {
			System.out.println("멍멍");
		}
		@Override
			public void fly() {
			System.out.println("강아지는 못날아요");
			}
		};
		c.abc(a);
		
		//2. 클래스는 존재 (x) + 참조 변수 (x)
		C cc = new C();
		cc.abc(new A() {
			@Override
			public void cry() {
				System.out.println("냐옹");
			}
			@Override
			public void fly() {
				System.out.println("고양이는 날지 못합니다.");
			}
		});
		
	
		
		
		
	}

}
