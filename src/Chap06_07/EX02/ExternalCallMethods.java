package Chap06_07.EX02;

// 메소드 오버로딩 : 하나의 메소드명에 매개변수타입, 갯수에 따라서 각각 다른 메소드가 호출됨 (Java 에서만 적용)
// 메소드 오버라이딩 : 상속에서 부모 클래스의 메소드를 재정의 해서 사용하는것
import Chap06_07.Ex03.A;



public class ExternalCallMethods {

	public static void main(String[] args) {
		//객체생성
		A a = new A();	// 같은 패키지 내의 클래스는 import 없이 사용이 가능하다.
		
		//메소드 호출
		a.print();	//안녕
		int k = a.data(); //3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result); //8.2
		
		a.printMethod(5); // 1 ~ 12 사이의 값
		a.printMethod(13); // 잘못된 입력값
		
		// 주의 :
		
		System.out.println(a.data());  //출력구문에 호출 가능한 메소드 (리턴이 있는 메소드)
//		System.out.println(a.print(););  //오류발생
		a.print();
		System.out.println(a.sum(15, 13.2));
//		System.out.println(a.printMethod(3)); //오류 발생
	}

}
