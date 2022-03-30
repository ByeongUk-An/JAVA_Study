package chap16.EX12;

//제네릭 메소드의 상속 : 일반 클래스 내의 제네릭 메소드

class Parent {  //일반 클래스
	
	//Number : Boolean, Charactor를 제외한 Wrapper (기본 데이터타입을 객체형으로 변환) 타입의 클래스가 올수 있다.
			//Byte, Short, Integer,Long,Double,Float
	<T extends Number> void print(T t) {  //제네릭 메소드
		System.out.println(t);
	}
}

class Child extends Parent {  // 제네릭 메소드 상속은 일반 상속과 같다.
	
}



public class InheritanceGenericMethod {
	public static void main(String[] args) {
		//1. 부모 클래스의 제네릭 메소드 사용
		Parent p = new Parent();
		p.<Integer>print(100);
		p.<Double>print(100.2345);
		//p.<String>print("안녕")  //오류, Number만 들어 갈 수 있다.
		p.print(10);	//매개변수도 들어가는 값의 타입을 알 수 있는 경우 생략가능
		p.print(12.14124);
		
		//2. 자식 클래스에서 제네릭 메소드 사용.
		Child c = new Child();
		c.<Integer>print(200);
		
		
		
		
	}

}
