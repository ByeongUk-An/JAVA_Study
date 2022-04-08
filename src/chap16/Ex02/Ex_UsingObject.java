package Chap16.EX02;
//Object 를 사용해서 4개의 객체를 저장하고 출력 해보기  : 완료시간 12:20분까지 (p.jangwoo@gmail.com)

//제너릭을 사용해서 4개의 객체를 저장하고 출력 해보기  : 완료시간 4:10분까지 (p.jangwoo@gmail.com)

class Student{
	String name ; 
	String id; 
	int pass; 
	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass; 
	}
	public void abc() {
		System.out.println("abc() 메소드 출력");
	}
	@Override
	public String toString() {
		return "이름 : " + name + " , id : " + id + " , pass" + pass ; 
	}
}
class Professor {
	String name ; 
	int year ; 
	String email; 
	
	Professor(String name, int year, String email){
		this.name = name; 
		this.year = year;
		this.email =email;		
	}
	@Override
	public String toString() {
		return "이름 : " + name + " , year : " + year + " , email : " + email ;
	}
}
class Tiger {
	String name; 
	String run; 
	
	Tiger(String name, String run) {
		this.name = name ; 
		this.run = run ; 	
	}
	@Override
	public String toString() {
		return  name + " 이는  " + run; 
	}
}
class Banana {
	String name;
	String color;
	int price; 
	Banana (String name, String color, int price){
		this.name =name;
		this.color = color;
		this.price = price; 
	}
	@Override
	public String toString() {
		return name + "는 색깔이 " + color + "이고 가격은 " + price + " 입니다. " ; 
	}
}

class All {  //모든 클래스를 저장 하는 클래스 
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	} 	
}


public class EX_UsingObject {
	public static void main(String[] args) {
		
		All a1 = new All(); 
		a1.setObject(new Student("홍길동","1111", 2222));
		System.out.println((Student) a1.getObject());
		((Student) a1.getObject()).abc();

	}
}
