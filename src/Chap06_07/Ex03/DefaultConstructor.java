package Chap06_07.Ex03;

/*
기본 생성자 : class A는 기본 생성자가 생략되어 있음
일반적인 class 블록 작성 순서
   1. 필드
   2. 생성자
   3. method
*/

class A { // class A는 현재 기본 생성자가 생략되어 있음
	int m; // 필드(class 블록에 변언된 변수) => 데이터타입 변수명
			// => heap 메모리 영역에 저장. 객체화 시켜야 사용 가능(static 사용시 객체화하지 않아도 사용 가능)
			// => heap 메모리 영역에는 반드시 초기값이 들어가야함

//	 A () {}; // 기본 생성자 : class 이름과 동일하면서 return 타입이 없는 method를 칭함
	// => 기본 생성자는 생략 가능
	// => 기본 생성자는 매개 변수도 없고 실행부도 가지지 않은 생성자

	void work() { // method => (인풋 매개변수) { 실행부 }
					// => return 타입이 있으면 자료형(int, String 등). return 타입이 없으면 void
					// => method는 호출해야 실행 : work()
		System.out.println(m); // m : 메모리의 값을 가지고 옴
	}
}

class B {
	int m; // 필드. heap 메모리 영역에 저장. 기본값으로 0을 출력

	B() {
	}; // 기본 생성자. 생략 가능 => 객체의 필드 초기값을 기본값으로 출력

	void work() {
		System.out.println(m); // 0 출력(필드 m 값(메모리 초기값 0) 출력)
	}
}

// 객체 생성시 생성자를 통해서 필드의 초기값을 할당하고 객체 생성

class C {
	int m;

	C(int c) { // 생성자의 인풋값을 받아서 메모리의 기본값으로 로드
		m = c;
	}
	
	void work () {
		System.out.println(m);   //
	}

}

class D {
	int m, n, l ;
	D () {}   // 기본 생성자
	
	D(int a, int b, int c) { // 매개 변수가 3개인 생성자
		m = a;
		n = b;
		l = c;
	}
	void work() {
		System.out.println("m : " + m + "n :" + n + "l :" + l);
	}
}



public class DefaultConstructor {

	public static void main(String[] args) {
		/*
		 * class 안에 포함될 수 있는 것 1. 필드 2. method 3. 생성자 4. inner class
		 * 
		 * 생성자의 2가지 특징 1. class 이름과 동일한 이름을 가진 method 2. 생성자는 return 타입이 없음 (method는
		 * return 타입이 있음) 3. 생성자 사용 이유 1) 객체를 생성할 때 필드값을 초기화 하면서 객체를 생성하고자 할 때 2) class
		 * 내에서 필드의 초기 값은 일반적으로 할당하지 않음 3) 초기값을 할당하면서 객체를 생성할 때
		 * 
		 * 객체를 생성할 때, 반드시 생성자를 호출해야함 : A a = new A(); => 객체 생성 구문
		 */

		/*
		 * 기본 생성자 (Default Constructor) - 인풋 매개변수가 없는 생성자, 실행부의 값도 비어있는 상태의 생성자. - 기본
		 * 생성자는 생략 가능 - 생략되어 있을 경우, 컴파일러가 자동으로 생성해서 컴파일. - class 내 기본 생성자 이외의 다른 생성자가
		 * 존재하는 경우, 기본 생성자 호출시 생략되면 안됨
		 */

//		A a = new A(); // A() : 기본 생성자 호출 << 기본 생성자 생략됨 >>  , 컴파일러가 기본 생성자를 할당
		// 객체 생성시 반드시 생성자를 호출해야 함

//		a.work(); // 객체의 초기값인 0 출력

		B b = new B(); // 기본 생성자 호출 << 기본 생성자 호출 >>
		b.work(); // 객체의 초기값인 0 출력
		
//		C c = new C(3); // <<생성자 호출시 기본값을 인풋해서 메모리 필드에 초기값 구성 
		
		C cc = new C(5);
		cc.work();
		
		// class C는 기본 생성자 생략 되어 있따.
		// class C는 인풋 매개 변수가 하나인 생성자가 존재
		
//		C ccc new C();   /오류 발생 :
		System.out.println("=============");
		
		D d = new D(); //기본 생성자 호출
		d.work();
		
		D dd = new D(3,4,5);
		dd.work();
		// 생성자 : 메소드 이름이 객체이름과 동일하고 리턴값이 없는 메소드
		// 객체 내의 필드의 값을 초기화 할떄 오버라이딩 (Overloading) 에 의해서 해당 생성자 호출
			//오버로딩 : 메소드명(생성자명,데이터 타입, 매개변수 갯수) <== 시그니쳐
		
		
	}

}
