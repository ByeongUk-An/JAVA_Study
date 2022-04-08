package Chap16.EX02;

class Student1{
	String name ; 
	String id; 
	int pass; 
	
	Student1(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass; 
	}
	@Override
	public String toString() {
		return "이름 : " + name + " , id : " + id + " , pass" + pass ; 
	}
}
class Professor1 {
	String name ; 
	int year ; 
	String email; 
	
	Professor1(String name, int year, String email){
		this.name = name; 
		this.year = year;
		this.email =email;		
	}
	@Override
	public String toString() {
		return  name + "는 " + year + "년차이고 메일주소는  : " + email ;
	}
}
class Tiger1 {
	String name; 
	String run; 
	
	Tiger1(String name, String run) {
		this.name = name ; 
		this.run = run ; 	
	}
	@Override
	public String toString() {
		return  name + " 이는  " + run; 
	}
}
class Banana1 {
	String name;
	String color;
	int price; 
	Banana1 (String name, String color, int price){
		this.name =name;
		this.color = color;
		this.price = price; 
	}
	@Override
	public String toString() {
		return name + "는 색깔이 " + color + "이고 가격은 " + price + " 입니다. " ; 
	}
}

class Goods1 <T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	} 
	
}

public class EX_Using_Generic {
	public static void main(String[] args) {
		Goods1<Student1> goods1 = new Goods1();
		goods1.set(new Student1 ("홍길동", "aaaa", 1111));
		System.out.println(goods1.get());
		
		Goods1<Professor1> goods2 = new Goods1();
		goods2.set(new Professor1 ("김교수", 5, "aaa@aaa.com"));
		System.out.println(goods2.get());
		
		Goods1<Tiger1> goods3 = new Goods1();
		goods3.set(new Tiger1 ("호랑이", "껑충껑충 달립니다. "));
		System.out.println(goods3.get());
	
		Goods1<Banana1> goods4 = new Goods1();
		goods4.set(new Banana1 ("바나나",  "노란색" , 5000));
		System.out.println(goods4.get());	
	}

}
