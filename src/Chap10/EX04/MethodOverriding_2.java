package Chap10.EX04;

class Animal2 {
	void run() {
		
	}
	
}

class Tiger extends Animal2 { // 호랑이는 네발로 달립니다.
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat () {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}
class Egle extends Animal2 {
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void egleEat() {
		System.out.println("독수리는 벌레와 동물을 먹습니다.");
	}
}
class Snake extends Animal2 {
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
	void snakeEat() {
		System.out.println("뱀은 쥐를 먹습니다.");
	}
 }


public class MethodOverriding_2 {

	public static void main(String[] args) {
		//1. 모든 객체는 Animal 타입으로 업캐스팅해서 생성
		Animal2 a = new Animal2();
		Animal2 b = new Tiger();
		Animal2 c = new Egle();
		Animal2 d = new Snake();
		a.run();
		b.run();
		c.run();
		d.run();
		
		
		
		//2. Animal2 배열에 각 객체를 저장.
		Animal2[] animal2 = {a,b,c,d};
		
		System.out.println("===========for==================");
		//3. for문으로 배열의 객체를 출력 . run()를 실행.
		for(int i = 0; i< animal2.length; i++) {
			animal2[i].run();
		}
		
		System.out.println("===========향상된 for==================");
		//4. Enhanced For 문을 사용해서 객체의 run() 메소드 출력
		for(Animal2 k : animal2) {
			k.run();
		}
		
		//5. 다운 캐스팅 ( instanceof 사용해서 ) 출력
		Animal2 aa = new Animal2();
		Tiger bb = (Tiger) b;
		Egle cc = (Egle) c;
		Snake dd = (Snake) d;
		if(bb instanceof Tiger) {
			bb.tigerEat();
		}else {
			System.out.println("호랑이 포함x");
		}
		if(cc instanceof Egle) {
			cc.egleEat();
		}else {
			System.out.println("독수리 포함x");
		}
		if(dd instanceof Snake) {
			dd.snakeEat();
		}else {
			System.out.println("뱀 포함x");
		}
		
	}

}
