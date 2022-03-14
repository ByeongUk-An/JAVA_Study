package Chap10.EX04;

class Animal2 {
	void run() {
		
	}
	
}

class Tiger extends Animal2 { // ȣ���̴� �׹߷� �޸��ϴ�.
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat () {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}
class Egle extends Animal2 {
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void egleEat() {
		System.out.println("�������� ������ ������ �Խ��ϴ�.");
	}
}
class Snake extends Animal2 {
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
	void snakeEat() {
		System.out.println("���� �㸦 �Խ��ϴ�.");
	}
 }


public class MethodOverriding_2 {

	public static void main(String[] args) {
		//1. ��� ��ü�� Animal Ÿ������ ��ĳ�����ؼ� ����
		Animal2 a = new Animal2();
		Animal2 b = new Tiger();
		Animal2 c = new Egle();
		Animal2 d = new Snake();
		a.run();
		b.run();
		c.run();
		d.run();
		
		
		
		//2. Animal2 �迭�� �� ��ü�� ����.
		Animal2[] animal2 = {a,b,c,d};
		
		System.out.println("===========for==================");
		//3. for������ �迭�� ��ü�� ��� . run()�� ����.
		for(int i = 0; i< animal2.length; i++) {
			animal2[i].run();
		}
		
		System.out.println("===========���� for==================");
		//4. Enhanced For ���� ����ؼ� ��ü�� run() �޼ҵ� ���
		for(Animal2 k : animal2) {
			k.run();
		}
		
		//5. �ٿ� ĳ���� ( instanceof ����ؼ� ) ���
		Animal2 aa = new Animal2();
		Tiger bb = (Tiger) b;
		Egle cc = (Egle) c;
		Snake dd = (Snake) d;
		if(bb instanceof Tiger) {
			bb.tigerEat();
		}else {
			System.out.println("ȣ���� ����x");
		}
		if(cc instanceof Egle) {
			cc.egleEat();
		}else {
			System.out.println("������ ����x");
		}
		if(dd instanceof Snake) {
			dd.snakeEat();
		}else {
			System.out.println("�� ����x");
		}
		
	}

}
