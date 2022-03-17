package Chap10.Ex06;

//this() 와 super() 의 혼용.  <== 생성자 호출, 생성자 내부, 첫라인
	//this() : 자신 객체의 생성자 호출
	//super() : 부모 객체의 생성자 호출

class AAAA {
	AAAA() {
		this(3);
		System.out.println("AAAA 생성자 1");
	}
	AAAA(int a) {
		// super() 가 생략되어있지만 상속된 부모가 없기 떄문에 실행되지않는다.
		System.out.println("AAAA 생성자 2");
	}
}

class BBBB extends AAAA {
	BBBB() {
		this(5);
		System.out.println("BBBB 생성자 1");
	}
	BBBB(int a) {
		//supber(); 생략
		System.out.println("BBBB 생성자 2");
	}
}

public class SuperMethod_2 {
	public static void main(String[] args) {
		//1. 객체 생성
		AAAA aaaa1 = new AAAA();
		System.out.println("======================");
		
		AAAA aaaa2 = new AAAA(3);
		System.out.println("========================");
		
		//2. 자식의 객체 생성
		BBBB bbbb1 = new BBBB();
//		BBBB bbbb2 = new BBBB(4);
		System.out.println("=========================");
		//3. 자식의 객체 생성 ( 매개변수 1개인 생성자 호출)
		BBBB bbbb2 = new BBBB(5);
		
	}

}
