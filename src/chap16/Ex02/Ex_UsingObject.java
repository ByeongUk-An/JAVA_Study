package Chap16.EX02;
//Object �� ����ؼ� 4���� ��ü�� �����ϰ� ��� �غ���  : �Ϸ�ð� 12:20�б��� (p.jangwoo@gmail.com)

//���ʸ��� ����ؼ� 4���� ��ü�� �����ϰ� ��� �غ���  : �Ϸ�ð� 4:10�б��� (p.jangwoo@gmail.com)

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
		System.out.println("abc() �޼ҵ� ���");
	}
	@Override
	public String toString() {
		return "�̸� : " + name + " , id : " + id + " , pass" + pass ; 
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
		return "�̸� : " + name + " , year : " + year + " , email : " + email ;
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
		return  name + " �̴�  " + run; 
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
		return name + "�� ������ " + color + "�̰� ������ " + price + " �Դϴ�. " ; 
	}
}

class All {  //��� Ŭ������ ���� �ϴ� Ŭ���� 
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
		a1.setObject(new Student("ȫ�浿","1111", 2222));
		System.out.println((Student) a1.getObject());
		((Student) a1.getObject()).abc();

	}
}
