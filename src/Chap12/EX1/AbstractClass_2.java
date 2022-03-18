package Chap12.EX1;

// 2. 추상 메소드를 사용하는 2번째 방법 : 자식 객체 생성없이 익명 클래스를 활용하는 방법
	//1번만 임시적으로 사용할때, 이벤트 처리

abstract class AAA {
	abstract void abc(); //추상메소드
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		//1. 익명 객체 생성
		AAA aaa = new AAA() { //익명 객체를 활용한 추상메소드를 클래스 생성없이 구현 한 것
			void abc() {
				System.out.println("방법2 : 객체 생성 없이 익명클래스로 추상메소드 구현");
			}
		};	
		
		//2. 메소드 호출
		aaa.abc();
	}

}
