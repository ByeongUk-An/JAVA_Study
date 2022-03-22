package Chap13.EX08.EX1;

//3. 메소드의 매개 변수로 전달 :
// 3-1 : 객체 생성후 매개 변수로 전달 ( 클래스명 o, + 참조변수 o )
// 3-2 : 객체 생성후 매개 변수로 전달 ( 클래스명 o, + 참조변수 x )
interface A{	//인터페이스 , 추상메소드를 정의,
	public abstract void cry();	// 추상메소드 : public abstract 가 생략 되어 있다.
	void fly();
}

class B implements A { //B는 A인터페이스를 구현한 클래스
	@Override
	public void cry() {
		System.out.println("멍멍 : 매개 변수 전달후 출력");
	}
	@Override
		public void fly() {
		System.out.println("날지못합니다 : 매개변수 전달");
		}
}
class C {	//C 객체의 abc 메소드 호출시 A 타입을 매개변수로 받는다.
	void abc(A a) {	//하위 자식 클래스가 매개변수로 들어올경우 A 타입으로 자동으로 업캐스팅 된다.
		a.cry();
		a.fly();
	}
}
	
	
	
	


public class Anonymous_3_1 {

	public static void main(String[] args) {
		//1. 클래스가 존재하고 참조변수를 생성해서 참조변수를 매개변수로 던지는 케이스
		C c = new C();
		A a = new B();	//B를 객체화 해서 A 타입으로 생성, a : 참조 변수
		c.abc(a);
		
		System.out.println("==========================");
		
		//2. 클래스가 존재하고 참조변수를 생성하지 않는 케이스
		c.abc(new B());	//new B가 void abc(A a)로 가게 되면서 타입이 A로 되면서 업캐스팅이 된다.
	}

}
