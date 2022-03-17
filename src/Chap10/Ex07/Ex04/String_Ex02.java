package Chap10.Ex07.Ex04;

class AA {
	String name;
	AA(String name) {
		this.name = name;
	}
}

class BB {
	String name;
	BB(String name) {
		this.name = name;
	}
	@Override
	public String toString() { //패키지명.클래스명@해쉬코드 : 기본출력  // name의 필드값을 출력
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == (A)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}

public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String("안녕");
		String s2 = "안녕";
		
		System.out.println(s1);// String 클래스는 toString() 재정의 되어있다.
		System.out.println(s1.equals(s2));  // String 클래스는 equals() 재정의 되어있다.
			// 값을 비교하도록 재정의
		
		AA aa1 = new AA("안녕");
		AA aa2 = new AA("안녕");
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2)); //객체 주소를 비교하기떄문에 false
		
		BB bb1 = new BB("안녕");
		BB bb2 = new BB("안녕");
		
		System.out.println(bb1);
	}

}
