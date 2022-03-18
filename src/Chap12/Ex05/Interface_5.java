package Chap12.Ex05;

//1. 방법1 : 객체를 생성후 구현하는 방법
//2. 방법2 : 익명클래스를 이용하는 방법

// 인터페이스 선언 : 기업의 최고 프로그래머 (PM)

interface A {
	double PI = 3.14;  // 인터페이스의 필드는 public static final 이 생략이 되어 있다.
	void run();		   // public abstract
}
class B implements A {
	@Override
	public void run() {  // public 주의
		System.out.println("달립니다");
	}
}

public class Interface_5 {

	public static void main(String[] args) {
		//1. 객체 생성후 출력
		A a1 = new B();
		a1.run();
		
		A a2 = new B() {
			public void run() {
				System.out.println("달려요");
			};
		};
		
		a2.run();
	}

}
