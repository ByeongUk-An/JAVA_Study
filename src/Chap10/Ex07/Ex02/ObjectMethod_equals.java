package Chap10.Ex07.Ex02;

class A {
	String name;

	A(String name) {
		this.name = name;
	}
}

class B {
	String name;

	B(String name) {
		this.name = name;
	}
	@Override											// a1.equals(a2)
	public boolean equals(Object obj) {  // 객체를 매개변수로 넣을떄 Object ㅏㅌ입으로 자동으로 업캐스팅
		if(this.name == ((B)obj).name) { // B 타입으로 다운 캐스팅후 각 객체의 name 필드의 값을 비교.
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectMethod_equals {

	public static void main(String[] args) {
		//1. 객체 생성
		A a1 = new A("안녕");
		A a2 = new A("바이");
		
		/*2. 객체 비교(==, equals() )
			 == : 기본 타입일 경우 값을 비교해서 true, false를 리턴
			 == : 참조 타입일 경우 객체의 번지를 비교
	   equals() : object의 객체의 번지를 비교 
	   	객체 내부의 특정 필드의 값을 비교하기위해 재정의 해서 사용한다.
		*/
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		System.out.println("=====================");
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		System.out.println(b1 == b2); // false 겍체의 메모리 주소가 다르다
		System.out.println(b1.equals(b2)); // true 객체의 주소를 비교하는게 아닌 값을 비교
		
	}

}
