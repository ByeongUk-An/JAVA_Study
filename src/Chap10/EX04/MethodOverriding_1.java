package Chap10.EX04;

import java.util.Arrays;

//�޼ҵ� �������̵�

class Animal {
	void cry() {
		
	}
}
class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("��������!");
	}
}
class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("�� �� ��߷���");
	}
}
class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("��");
	}
}


public class MethodOverriding_1 {
	public static void main(String[] args) {
		//1. ������ Ÿ������ ���� + ������ Ÿ������ ����.
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry(); //Animal Ŭ������ cry�� ȣ��
		bb.cry(); //Bird Ŭ������ cry�� ȣ��
		cc.cry(); //Cat Ŭ������ cry�� ȣ��
		dd.cry(); //Dog Ŭ������ cry�� ȣ��
		System.out.println("===============================");
		
		//2. Animal Ÿ������ ���� + �ڽ� Ÿ������ ���� : ���� ���ε��� ���ؼ� �θ��� cry�� ȣ���Ұ�� �ڽ���
			// �����ε��� �޼ҵ�� ���ε� �ȴ�.
		Animal ab = new Bird();	// ab�� Animal, Bird Ÿ���� ����. Animal �ʵ�� �޼ҵ常 ����
		Animal ac = new Cat();  // ac�� Animal, Cat Ÿ���� ����. Animal �ʵ�� �޼ҵ常 ����
		Animal ad = new Dog();  // ad�� Animal, Dog Ÿ���� ����. Animal �ʵ�� �޼ҵ常 ����
		
		ab.cry(); //Animal�� cry�� ȣ�� �Ұ�� �������ε��� ���ؼ� BirdŬ������ cry�� ȣ�� 
		ac.cry(); //Animal�� cry�� ȣ�� �Ұ�� �������ε��� ���ؼ� CatŬ������ cry�� ȣ�� 
		ad.cry(); //Animal�� cry�� ȣ�� �Ұ�� �������ε��� ���ؼ� DogŬ������ cry�� ȣ�� 
		
		System.out.println("===============================");
		
		//3. ��ü �迭�� ����
		Animal[] animal = {ab,ac,ad};
		// ��üŸ�� �迭�̸� = {��ü, ��ü, ��ü}
		
		for(Animal k : animal) {
			k.cry();
			
		}
		
		System.out.println("============================");
		
		for(int i = 0; i< animal.length; i++) {
			animal[i].cry();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
