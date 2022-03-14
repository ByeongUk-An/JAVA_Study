package Ex99.overloading;

class Animal3 { // 부모 클래스, 모든 클래스는 Object 클래스를 상속한다. //extends Object가 생략이 되어 있다. Object는 최상위
				// 요소이다.
	String name;
	int age;

	void cry() {
		System.out.println("동물은 웁니다.");
	}

	@Override // Object.toString 메소드는 객체 자체를 출력할때 호출이 된다.
	public String toString() { // 객체의 주소를 출력 한다. [패키지명.클래스명@객체의메모리의 해쉬코드가 찍힌다]
		// TODO Auto-generated method stub
//		return super.toString();
		return "이름은 : " + name + ",나이는 :" + age + "입니다.";
	}

}

class Tiger3 extends Animal3 {
	Tiger3() {
	}; // 기본 생성자 : 변수의 초기화 값을 할당 하지 않고 초기화.
		// 다른 생성자가 객체내에 존재 할 경우 기본생성자를 외부에서 호출시 생략되어 있으면 안된다.

	Tiger3(String a, int b) { // 생성자 : 객체르 생성할때 메모리의 초기 값을 부여 할당 할 때 사용.
		super.name = a; // super : 부모클래스, this : 자기자신의 객체
		super.age = b;
	}

	@Override
	void cry() {
//		super.cry();   //super 키워드는 부모클래스 , super : 상속 관계일때 부모 클래스
		// this 키워드는 자기자신의 객체 ,
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}
}

class Cat3 extends Animal3 { // 생성자 : 객체를 생성할때 메모리의 초기 값을 부여 할당 할 떄 사용.

	Cat3() {
	}; // 기본 생성 자

	Cat3(String a, int b) {
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
//		super.cry();
		System.out.println("고양이는 냐옹 하고 웁니다.");
	}
}

class Dog3 extends Animal3 {

	Dog3() {
	};

	Dog3(String a, int b) { // 생성자
		super.name = a;
		super.age = b;
	}

	@Override
	void cry() {
//		super.cry();
		System.out.println("강아지는 멍멍 하고 웁니다.");
	}

}

public class Test02 {

	public static void main(String[] args) {

		Animal3 a3 = new Animal3(); // a3 객체 생성

		System.out.println(a3); // 객체 자체를 출력 할 경우, Object 클래스의 toString 메소드가 호출된다.
		// Object.toString() : 객체의 메모리주소의 해쉬코드를 출력
		// Ex99.overloading.Animal3@32d2fa64 <== 패키지명.객체명@해쉬코드
		System.out.println(a3.toString());

		// 객체 자체를 출력하면 Object 클래스의 toString 메소드를 호출한다.

		System.out.println("===========================");

		Animal3 t3 = new Tiger3(); // Tiger3를 Animal3 로 업캐스팅
		Animal3 c3 = new Cat3(); // Cat3를 Animal3 로 업캐스팅
		Animal3 d3 = new Dog3(); // Dog3를 ANimal3 로 업캐스팅

		t3.cry(); // 부모의 cry()를 호출 할 경우 오버라이딩된 Tiger3의 cry()를 호출
		c3.cry(); // Animal3.cry 를 호출 ====> 오버라이딩 된 Cat3의 cry()를 호출
		d3.cry();

		System.out.println("==================");

		Animal3[] arr = { t3, c3, d3 };

		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}

		System.out.println("====================");
		for (Animal3 k : arr) {
			k.cry();
		}

		System.out.println("====================");

		Animal3 aa3 = new Tiger3("호랑이", 5);
		Animal3 cc3 = new Cat3("고양이", 2);
		Animal3 dd3 = new Dog3("강아지", 3);

		System.out.println(aa3); // 객체 자체를 출력시, 기본적으로는 객체의 메모리 해쉬코드가 출력
		System.out.println(cc3); // Object의 toString() 메소드를 재정의 => Object를 오버라이딩
		System.out.println(dd3);

		Animal3[] arr2 = { aa3, cc3, dd3 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		for(Animal3 j : arr2) {
			System.out.println(j+"inhanced");
		}

	}

}
