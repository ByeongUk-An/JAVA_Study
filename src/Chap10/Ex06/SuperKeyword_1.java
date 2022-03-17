package Chap10.Ex06;

//super : 부모 클래스
//this : 자신의 객체

//오버 라이딩 : 부모의 메소드가 완전히 삭제 되지 않아다.
class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}
class B extends A {
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc(); // this.abc  // this는 자신의 객체
		super.abc();
	}
}

public class SuperKeyword_1 {

	public static void main(String[] args) {
		//1. 객체 생성 
		B bb = new B();
		//2. 메소드 호출
		bb.bcd();

	}

}
