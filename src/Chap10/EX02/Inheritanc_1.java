package Chap10.EX02;

class Aa {
	int m;
	void abc() {
		System.out.println("부모 메소드");
	}
}
class Bb extends Aa {
	int n;
	void bcd() {
		System.out.println("자식 메소드");
	}
}

public class Inheritanc_1 {

	public static void main(String[] args) {
		//타입캐스팅을 하지 않는 경우
		Bb b = new Bb();  //b는 Aa, Bb 포함 한다. Aa, Bb의 필드와 메소드를 모두 사용가능
		b.m = 10; // 부모 필드
		b.n = 20; // 자식 필드
		b.abc(); // 부모 메소드
		b.bcd(); // 자식 메소드
		
		//업캐스팅 : 자식 => 부모  : Aa 타입과, Bb의 타입 모두 포함 하지만 Aa
		Aa a = new Bb();
		a.m = 100;
//		a.n = 200; // a.n이 안되는이유는 우리가 위에서 Bb는 Aa로 업캐스팅을 하여 Aa와 Bb의 필드 메소드를 가지고는 있지만 접근은 업캐스팅 된 Aa에만 접근이 가능하다.
		
		Bb bb6 = (Bb) a; // 기존에 a는 Bb에서 Aa로 업캐스팅 되어 있는것을 Bb로 다운캐스팅을 한것이다. 업캐스팅은 변환한것만 접근이 가능하지만 다운캐스팅 하면 Aa,Bb의 필드와 메소드
							//가 모두 사용이 가능하다
		bb6.m = 100;
		bb6.n = 200;
	}

}
