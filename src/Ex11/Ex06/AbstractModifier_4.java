package Ex11.Ex06;

abstract class Animal {
	String name;
	int age;
	
	abstract void cry();
	abstract void run();
}

class Cat extends Animal {
	
	Cat(String name, int age) {
		super.name = name;
		super.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("냐옹");
		
	}

	@Override
	void run() {
		System.out.println("폴짝");
		
	}
	
}
class Tiger extends Animal {
	Tiger(String name, int age) {
		super.name = name;
		super.age = age;
	}

	@Override
	void cry() {
		System.out.println("어흥");
		
	}

	@Override
	void run() {
		System.out.println("철푸덕");
		
	}
	
}
class Eagle extends Animal {
	Eagle(String name, int age) {
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("피죤");
		
	}

	@Override
	void run() {
		System.out.println("푸드득");
		
	}
	
}

public class AbstractModifier_4 {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이",10);
		Animal a2 = new Tiger("호랑이",5);
		Animal a3 = new Eagle("독수리",15);
		
		//1. Animal 배열 객체에 저장 후
		Animal[] arr = {a1,a2,a3};
		
		//2. For문을 사용해서 객체를 출력시 이름과 나이를 출력 , .cry(), run()
		for(int i =0; i< arr.length; i++) {
			System.out.println(arr[i].name + "는" + arr[i].age + "살 입니다");
			arr[i].cry();
			arr[i].run();
		}
		
		System.out.println("=====================");
		//3. Enhanced For 문을 사용해서  이름과 나이를 출력 , .cry(), run()
//		for(Animal k : arr) {
//			System.out.println(k.name + "는" + k.age +"살 입니다.");
//			k.cry();
//			k.run();
//		}
	}

}
