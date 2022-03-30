package chap16.EX08;

// ���׸� Ŭ������ �����ؼ�, Ÿ�� ���� (Apple,Strawberry, Banana) ,Pancil�� Ÿ������ ������ �� ������ ����

class Apple extends Fluit {
	String name;
	int price;
	Apple(String name, int price) { 
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	@Override
	public void print() {
		System.out.println(name + "�� ������" + price + "�� �̳� �մϴ�. ��ο�...");
	}
}

class Strawberry extends Fluit {
	String name;
	int price;
	Strawberry(String name, int price) {
		this.name =name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	public void print() {
		System.out.println(name + "�� ������" + price + "�� �̳� �մϴ�. ��ο�...");
	}
	
}
class Banana extends Fluit {
	String name;
	int price;
	Banana(String name, int price) {
		this.name =name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	public void print() {
		System.out.println(name + "�� ������" + price + "�� �̳� �մϴ�. ��ο�...");
	}
}

class Pancil {
	String name;
	int price;
	Pancil(String name, int price) {
		this.name =name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ " + price;
	}
	public void print() {
		System.out.println(name + "�� ������" + price + "�� �̳� �մϴ�. ��ο�...");
	}
}



class GenericPrint<T extends Fluit> {
	private T Fluit;

	public T getFluit() {
		return Fluit;
	}

	public void setMeterial1(T Fluit) {
		this.Fluit = Fluit;
	}
	
	public String toString() {
		return Fluit.toString();
	}
	public void printing() {
		Fluit.print();
	}

	
	
	
}

public class EX_Restric_Generic_Type {
	public static void main(String[] args) {
		GenericPrint<Apple> applePrinter = new GenericPrint();
		applePrinter.setMeterial1(new Apple("���",3000));
		
		Apple apple = applePrinter.getFluit();
		System.out.println(apple);
		apple.print();
		
		System.out.println("======================");
		
		GenericPrint<Strawberry> strawPrinter = new GenericPrint();
		strawPrinter.setMeterial1(new Strawberry("����",5000));
		
		Strawberry berry = strawPrinter.getFluit();
		System.out.println(berry);
		berry.print();
		
		System.out.println("======================");
		
		GenericPrint<Banana> bananaPrinter = new GenericPrint();
		bananaPrinter.setMeterial1(new Banana("����",5000));
		
		Strawberry banana = strawPrinter.getFluit();
		System.out.println(banana);
		banana.print();
		
		System.out.println("======================");
		
//		GenericPrint<Pancil> pancilPrinter = new GenericPrint();
//		pancilPrinter.setMeterial1(new Pancil("����",5000));
//		
//		Strawberry pancil = strawPrinter.getFluit();
//		System.out.println(pancil);
//		pancil.print();
		
		
		
		
		
		
	}
}
