package Chap13.EX09;

// 매개변수로 받아서 처리 : 인터페이스를 구현한 클래스 (x) , a

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
		//3.인터페이스를 구현한 클래스가 없다. + 참조변수를 생성해서 값을 던져준다.
		A a = new A() {  //인터페이스를 구현한 자식 익명 객체생성후 타입을 A로 지정한 참조변수 생성해서 던져준다.
			@Override
			public void abc() {
				System.out.println("클래스(x) + 참조변수(o)"); 
			}
		};
		c.cde(a);
		
		//4.인터페이스를 구현한 클래스가 없다. + 참조변수도 없다.  <<==== 제일 많이 사용(임시로 한번만 사용)
			//이벤트 처리 사용.
		c.cde(new A() {
			@Override
			public void abc() {
				System.out.println("클래스(x) + 참조변수(x)");
			}
		});
		

	}

}
