package chap16.EX09;

//제네릭 메소드의 범위 지정 :

class A { // 일반 클래스내의 제네릭 메소드

	// Number : Boolean, Charactor를 제외한 6개의 타입(Byte,short,Integer,Long,Float,Double)
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue()); // Number 타입의 메소
	}
}

interface MyInterface {
	void print(); // public abstract가 생략됨.
}

class C implements MyInterface { // 인터페이스를 구현한 클래스
	@Override
	public void print() {
		System.out.println("인터페이스를 구현한 클래스 - 출력");
	}
}

class B { // 제네릭 타입 내부에서 인터페이스를 적용 할때는 extends 키를 사용한다.
	public <T extends MyInterface> void method2(T t) { // T에 타입에 올수 있는 것은 MyIntereface를 구현한
														// 클래스만 올 수 있다.
		t.print();
	}
}

class D {
	public <T extends String> void abc(T t) {
		System.out.println(t); 	//String은 toString 메소드가 재정의 되어있다.
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A(); // 일반 클래스 객체 생성후 제네릭 메소드 호출
		a.<Double>method1(5.8);
		a.method1(22.5); // 매개변수로 던지는 값이 타입을 식별 할 수 있는 경우 생략 가능
		a.<Long>method1(10000000L); // Long
		a.<Float>method1(100.5555F); // Float
//		a.<Boolean>method1(true);   // 제네릭 메소드 상속받은 값이 Number이기떄문에 Boolean,Charactor는 제한된다.

		B b = new B(); //

		// Method2에 매개변수로 올수 있는 것은 인터페이스 타입, 인터페이스를 구현한 자식 클래스
		// 인터페이스를 구현한 내부 익명클래스

		b.<MyInterface>method2(new MyInterface() {
			public void print() {
				System.out.println("print() 익명 클래스로 출력");
			};
		});

		b.<MyInterface>method2(new C()); // 매개변수로 인터페이스를 구현한 자식 객체

		// 익명 클래스로 제네릭 메소드 호출후 매개변수로 던져주기

		b.method2(new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명으로 처리된 클래스");
			}
		});
		
		D d = new D();
		d.<String> abc("안녕");
		d.abc("하세요");
		
		
	}

}
