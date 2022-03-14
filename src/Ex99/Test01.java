package Ex99; //상속

class Human { // 부모 클래스
	String name; // 인스턴스 필드 : 객체화 시켜야 사용 가능, Heap
	int age;

	void eat() { // 인스턴스 메소드 : 객체화 시켜야 사용 가능, Heap에 저장되어 있는 메소드는(pointer = 주소값)만 가지고 있다.
		System.out.println("사람이 먹습니다."); // 실제 위치는 클래스 역영내의 인스턴스메소드 영역에 위치 => 실제 메소드의 코드가 저장
	}

	void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
}
class Student extends Human {
	int studentID;
	void goToSchool() {
		System.out.println("학생은 학교에 갑니다.");
	}
}
class Worker extends Human {
	int workerID;
	void goToCompany() {
		System.out.println("직장에 갑니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();  // 부모 클래스
		h.name = "홍길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();  // 자식 클래스 : 자식 클래스는 부모클래스의 필드와 메소드를 상속 받는다.
		s.name = "신사임당";  //부모클래스의 필드
		s.eat();  // 부모 클래스의 메소드
		s.sleep();  // 부모 클래스의 메소드
		
		s.studentID = 1111;   //자식 클래스의 필드
		s.goToSchool();  // 자식 클래스의 메소드
		
		Worker w = new Worker();  // 자식클래스
		w.name = "이순신"; //부모클래스의 필드
		w.eat();  //부모 클래스의 메소드
		w.sleep(); // 부모 클래스의 메소드
		
		w.workerID = 2222;  // 자식 클래스의 필드
		w.goToCompany(); // 자식 클래스의 메소드
		
		
		Human h1 = new Student();  //업캐스팅 상속관계에서만 가능!!  자식에서 부모타입으로 형변환   h1은 Human의 필드와 메소드만 사용가능
										//h : Human, Student 타입이 모두 저장되지만, Human 만 접근이 가능하다.
		h1.name = "BTS";  // 부모클래스
		h1.eat();	// 부모클래스
		
		
		// 업캐스팅이 되고 다시 Student를 사용 하려면 다운캐스팅을 해주어야 한다.
		// 다운캐스팅 : 부모 ==> 자식으로 타입 변환
		// 다운캐스팅은 if 조건문으로 instanceof를 사용해서 확인 후 사용  => 다운캐스팅은 구문에는 오류가 없겠지만 런타임 에러가 발생할 수 있다.
		System.out.println(h1 instanceof Human);   // instanceof h1이 Human의 타입을 가지고 있는지 확인  // 결과값 : true
		System.out.println(h1 instanceof Student); // instanceof h1이 Student의 타입을 가지고 있는지 확인   // 결과값 : true
		
		if ( h1 instanceof Student) { // 다운캐스팅을 할때에는 런타임 오류를 방지하기 위해 객체의 다운캐스팅할 데이터 타입이 존재하는지 확인
			Student s2 = (Student) h1;
			// 다운캐스팅은 항상 수동으로 앞에 타입을 적어줘야 한다.  업캐스팅은 자동으로 컴파일러가 캐스팅을 해준다.
			s2.studentID = 123123;
			s2.goToSchool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker) h1;   // 현재 우리는 Worker를 업캐스팅 하지 않았다. 하지만 문법상으론 맞아 에러가 발생 되지 않지만 런타임에서는 에러가 발생한다.	
			System.out.println("h1에는 Worker가 포함이 된다.");
		}else {
			System.out.println("h1은 Worker를 포함한다.");
			System.out.println(h1 instanceof Worker);  //false	
		}
		
		   
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
