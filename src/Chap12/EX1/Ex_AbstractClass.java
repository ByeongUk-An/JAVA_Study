package Chap12.EX1;

abstract class Abc {
	abstract void cry();	//
	abstract void fly();
}
class Cat1 extends Abc {

	@Override
	void cry() {
		System.out.println("고양이는 냐옹");
	}

	@Override
	void fly() {
		System.out.println("고양이는 날지못해요!");
	}
	
}

class Eagle1 extends Abc {

	@Override
	void cry() {
		System.out.println("독수리는 피죤");
	}

	@Override
	void fly() {
		System.out.println("독수리는 푸드득푸드득!! 날아요");
	}
}



public class Ex_AbstractClass {

	public static void main(String[] args) {
		//1. 자식 객체 Cat, Eagle 클래스를 생성후 출력
		Cat1 cat1 = new Cat1();
		Eagle1 eagle = new Eagle1();
		cat1.cry();
		cat1.fly();
		eagle.cry();
		eagle.fly();
		//2. 익명 클래스 생성후 출력
		Abc abc = new Abc() {

			@Override
			void cry() {
				System.out.println("abc는 영어");
				
			}

			@Override
			void fly() {
				System.out.println("abc는 날지못해용~");
				
			}
			
		};
		abc.cry();
		abc.fly();
	}

}
