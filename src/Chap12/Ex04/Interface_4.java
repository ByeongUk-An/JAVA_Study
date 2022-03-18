package Chap12.Ex04;

//인터페이스 상속시 자식 클래스 접근 지정자 오류 << 중요
	//인터페이스의 메소드를 구현 할 때 반드시 public을 넣어줘야 한다.
interface A {
	public abstract void abc();
}

class F implements A { //F 클래스는 완성된 메소드가 구현 되어 있어야 한다.

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
}

interface B {
	void abc();
}
class C implements A {

	public void abc() { // A 인터페이스에 abc(); 를 오버라이딩 해서 구현한 메소드
						//자식은 부모보다 접근지정자가 같거나 넗어야 한다.
	}
	
}
class D implements B {
	public void abc() {  //인터페이스의 메소드를 구현할때는 반드시 public 접근 지정자를 사용해야 낳다.
		
	}
}

class E implements B {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface_4 {

	public static void main(String[] args) {

	}

}
