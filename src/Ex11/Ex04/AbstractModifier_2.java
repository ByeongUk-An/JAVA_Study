package Ex11.Ex04;

//추상 클래스를 사용하지 않는 경우 :
	// 자식클래스에서 메소드 오버 라이딩시 오버라이딩이 오타를 통해 잘못 구현 될 수 있다.

class Animal {
	void cry() {} // 팀장이 cry() 정의해주고 구현은 팀원에게 위임.
}
class Cat extends Animal {
	void cry() {}
}

public class AbstractModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
