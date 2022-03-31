package Generic.Ch01.Solution2;

class Apple{}
class Banana{}

class Goods<T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {
	public static void main(String[] args) {
		//1. Goods를 이용해 Apple 객체를 추가하거나 가져오기
		Goods<Apple> goods1 = new Goods<Apple>();  //Goods의 타입을 Apple 로 넣어주는것이다. 절대 객체를 넣어준게 아니다.
		goods1.setT(new Apple());
		Apple apple = goods1.getT();	// Object와 달리 제네릭(Generic)은 다운캐스팅이 필요없음
		
		
		
		//2. Goods를 이용해 Banana 객체를 추가하거나 가져오기
		Goods<Banana> goods2 = new Goods<Banana>();
		goods2.setT(new Banana());
		Banana banana = goods2.getT();
		
		//3. 잘못된 타입 선언
//		Goods<Apple> goods3 = new Goods<Apple>();
		//goods3.setT(new Banana());  //타입을 Apple로만 올수있게 해놓았는데 Banana객체가 오면서 오류발생
		//Apple apple2 = goods3.getT(); //문법오류는 발생하진 않지만 컴파일하면서 실행예외가 실행된다.
	}

}
