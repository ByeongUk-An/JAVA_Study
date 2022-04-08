package Chap16.EX01;

// Generic ����� ������.  - ��ǰ�� ������ Ŭ���� �Ź� ������ ��� �Ѵ�. 

// ��ü�� ���� Ŭ������ ���� ��� , �Ź� ��ü�� �����Ҷ� ���� �װ�ä�� ���� Ŭ������ ����� ��� �Ѵ�.
// ��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�. <== ���ο� ��ǰ�� �߰� �ɶ� ���� �� ��ǰ�� ���� Ŭ������ ������ ��� �Ѵ�. 
// �ڵ尡 ������ ���� ������. 


class Apple {		//��� Ŭ���� , ����� ������ ���� ��ü 
	String name ; 
	int price ; 
	
	Apple (String name, int price){ //������ 
		this.name = name;
		this.price = price; 
	}
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּ� �� �ƴ϶� �ʵ��� ������ ���. 
		return "�̸� : " + name + " , ���� : " + price ; 
	}
}

//1. Apple �� ���� �� �ִ� Ŭ���� ����. 
class Goods1 {   //��ǰ�� ����� ���� Ŭ���� 
	private Apple apple = new Apple("���" , 1000);

	public Apple getApple() {   //getter  : ��ü �ʵ��� ������ ��� �ϴ°� 
		return apple;
	}

	public void setApple(Apple apple) {   //setter 
		this.apple = apple;
	} 	
}

class Pancil {  //���� Ŭ���� 
	String name ; 
	int price ; 
	Pancil (String name, int price){	//�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�. 
		this.name =name; 
		this.price = price; 
	}
	@Override
	public String toString() {
		return "�̸� : " + name + " , ���� : " + price ; 
	}
}

class Goods2 { //��ǰ2 :  ���� ��ǳ�� ���� Ŭ���� 
	private Pancil pancil = new Pancil ("����" , 2000);

	public Pancil getPancil() {
		return pancil;
	}

	public void setPancil(Pancil pancil) {
		this.pancil = pancil;
	}
	
	
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1 ��ǰ�� ����Ǿ� �ִ�. Apple ��ü �߰� �� �������� 
		Goods1 goods1 = new Goods1 ();	//�⺻ ������ ȣ�� 
		goods1.setApple(new Apple("���2", 2000));    //setter�� ���� �Ҵ��ϰ� 
		System.out.println(goods1.getApple());    //������ ������ ��� 
		
		//2. Goods2 ��ǰ�� ���� . Pancil ��ü�� ���� , 
		Goods2 goods2 = new Goods2(); 
		goods2.setPancil(new Pancil("����2", 3000));    //Setter�� Pancil ��ü ���� �� ���Ҵ�. 
		System.out.println(goods2.getPancil());
		
		
		
		
		
		
		
		
	}

}
