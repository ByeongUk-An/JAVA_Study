package Chap12.EX1;

abstract class Abc {
	abstract void cry();	//
	abstract void fly();
}
class Cat1 extends Abc {

	@Override
	void cry() {
		System.out.println("����̴� �Ŀ�");
	}

	@Override
	void fly() {
		System.out.println("����̴� �������ؿ�!");
	}
	
}

class Eagle1 extends Abc {

	@Override
	void cry() {
		System.out.println("�������� ����");
	}

	@Override
	void fly() {
		System.out.println("�������� Ǫ���Ǫ���!! ���ƿ�");
	}
}



public class Ex_AbstractClass {

	public static void main(String[] args) {
		//1. �ڽ� ��ü Cat, Eagle Ŭ������ ������ ���
		Cat1 cat1 = new Cat1();
		Eagle1 eagle = new Eagle1();
		cat1.cry();
		cat1.fly();
		eagle.cry();
		eagle.fly();
		//2. �͸� Ŭ���� ������ ���
		Abc abc = new Abc() {

			@Override
			void cry() {
				System.out.println("abc�� ����");
				
			}

			@Override
			void fly() {
				System.out.println("abc�� �������ؿ�~");
				
			}
			
		};
		abc.cry();
		abc.fly();
	}

}
