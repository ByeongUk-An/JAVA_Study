package chap16.EX08;

// 제네릭 클래스를 생성해서, 타입 제한 (Apple,Strawberry, Banana) ,Pancil은 타입으로 접근할 수 없도록 설정

class Apple extends Fluit {
	String name;
	int price;
	Apple(String name, int price) { 
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "이고 가격은 " + price;
	}
	@Override
	public void print() {
		System.out.println(name + "의 가격은" + price + "원 이나 합니다. 비싸요...");
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
		return name + "이고 가격은 " + price;
	}
	public void print() {
		System.out.println(name + "의 가격은" + price + "원 이나 합니다. 비싸요...");
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
		return name + "이고 가격은 " + price;
	}
	public void print() {
		System.out.println(name + "의 가격은" + price + "원 이나 합니다. 비싸요...");
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
		return name + "이고 가격은 " + price;
	}
	public void print() {
		System.out.println(name + "의 가격은" + price + "원 이나 합니다. 비싸요...");
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
		applePrinter.setMeterial1(new Apple("사과",3000));
		
		Apple apple = applePrinter.getFluit();
		System.out.println(apple);
		apple.print();
		
		System.out.println("======================");
		
		GenericPrint<Strawberry> strawPrinter = new GenericPrint();
		strawPrinter.setMeterial1(new Strawberry("딸기",5000));
		
		Strawberry berry = strawPrinter.getFluit();
		System.out.println(berry);
		berry.print();
		
		System.out.println("======================");
		
		GenericPrint<Banana> bananaPrinter = new GenericPrint();
		bananaPrinter.setMeterial1(new Banana("딸기",5000));
		
		Strawberry banana = strawPrinter.getFluit();
		System.out.println(banana);
		banana.print();
		
		System.out.println("======================");
		
//		GenericPrint<Pancil> pancilPrinter = new GenericPrint();
//		pancilPrinter.setMeterial1(new Pancil("딸기",5000));
//		
//		Strawberry pancil = strawPrinter.getFluit();
//		System.out.println(pancil);
//		pancil.print();
		
		
		
		
		
		
	}
}
