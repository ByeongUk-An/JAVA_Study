package Chap06_07.Ex06;

// 객체의 필드에 값을 할당 하는 방식 : 3가지
	//1. 필드에 직접 값을 부여 하는 방식							<== 객체를 생성후
	//2. setter 를 통해서 객체에 필드에 값을 부여. ( 컨트롤이 된다 )	<== 객체를 생성 후 
	//3. 생성자를 통해서 객체의 필드 값을 부여 ( 컨트롤 된다 )			<== 객체를 생성할때 초기값으로 필드에 값을 할당


class Aa { // 1. 객체 생성후 직접 필드에 값 할당
	String name;
	int age;
	String mail;
	
	void print() {
		System.out.println("name :" + name + "age :" + age + "mail :" + mail);
	}
}

class Bb { // 2. setter를 통해서 객체의 필드의 값을 할당
	String name;
	int age;
	String mail;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	void print() {
		System.out.println("name :" + name + "age :" + age + "mail :" + mail);
	}
}

class Cc { //3. 생성자를 통해서 객체의 필드의 값을 할당
	String name;
	int age;
	String mail;
	
	Cc(String name, int age, String mail) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		
	}
	
	void print() {
		System.out.println("name :" + name + "age :" + age + "mail :" + mail);
	}
}


public class FiledOfValue {

	public static void main(String[] args) {
		
		//1. 객체의 필드에 직접 값을 할당.
		Aa aa = new Aa();
		aa.name = "안병욱";
		aa.age = 30;
		aa.mail = "quddnr005@naver.com";
		aa.print();
		
		//2. 객체의 setter 를 사용해서 필드의 값을 부여
		Bb bb = new Bb();
		bb.setName("안병욱");
		bb.setAge(30);
		bb.setMail("quddnr005@naver.com");
		bb.print();
		
		//3. 생성자(Constructor)를 사용해서 필드의 값을 부여.
		Cc cc = new Cc("안병욱",30,"quddnr005@naver.com");
		cc.print();
	}

}
