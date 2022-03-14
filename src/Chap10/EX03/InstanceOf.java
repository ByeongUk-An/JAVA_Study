package Chap10.EX03;

//instancof : 객체 내부의 캐스팅이 가능여부를 알 수 있도록 하는 키워드
// 업캐스팅한 객체 내부에 어떤 타입이 존재하는지 True, False 로 리턴
// 다운 캐스팅 할 때 런타임 오류가 발생 될 수 있다. , 런타임 오류를 방지 시켜준다.
// 다운 캐스팅시 해당 타입이 객체에 존재 할 때 다운캐스팅 하도록 설정.

class A {
	int m;

	void a() {
		System.out.println(m);
	}
}

class B extends A {
	int n;

	void B() {
		System.out.println("n :" + n);
	}
}

public class InstanceOf {

	public static void main(String[] args) {
		
		//1. instanceof : 객체명 instanceof 타입(클래스이름)
		A aa = new A();	// aa는 A클래스 타입만 가지고 있다.
		A ab = new B(); // ab는 A클래스로 업캐스팅  ab는 A, B, 포함 하지만 접근은 A만 가능하다.
		
		System.out.println(aa instanceof A); // true
		System.out.println(ab instanceof A); // true
		System.out.println(aa instanceof B); // false
		System.out.println(ab instanceof B); // True
		
		if(aa instanceof B) { // aa객체에 B 타입이 포함 되어 있을 경우 실행하여 캐스팅한다
			B b = (B)aa; //런타임시 오류를 방지할 목적
			System.out.println("aa를 B타입으로 캐스팅 했습니다.");
		}else {
			System.out.println("aa는 B타입으로 캐스팅 실패했습니다.");
		}
		
		if (ab instanceof B) { //ab에 B타입이 존재하는 경우 다운캐스팅
			B b = (B)ab;
			System.out.println("ab를 B 타입으로 캐스팅 했습니다.");
		}else {
			System.out.println("ab를 B 타입으로 캐스팅 실패했습니다.");
		}
		
		if ("안녕" instanceof String) { //객체의 타입을 확인 => int,double,float,short 같은경우는 기본자료형이므로 안됨
			System.out.println("\"안녕\"은 String 입니다.");
		}else {
			System.out.println("\"안녕\"은 String 이 아닙니다.");
		}
		
		
		
		
	}

}
