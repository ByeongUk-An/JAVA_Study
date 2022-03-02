package chap01;
public class Hello02 {  //Hello02 class 이름
	//메소드 선언 (메소드 : 객체지향언어에서 함수(인풋값을 넣어서 프로그램에 따라 결과를 출력)를 메소드라고 호칭한다.)
	public static int sum (int n, int m) {  //sum매소드 이름
		return n+m;
	}
	public static void main(String[] args) {
		//변수 선언
		int i = 20; //i변수는 정수만 넣을수 있고 , 초기값으로 20을 할당해서 넣음
		int s;   //s변수는 정수값만 넣을수 있고, 초기값은 비워둠
		char a; //a변수는 한글자만 넣을수 있고 싱글쿼터(작은따옴표)를 사용하여야한다.(아스키값)
		String b;
		b = "오늘의 날씨는 춥습니다.";
		s = sum (i,10); //sum() 메소드 호출
		a='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
	}
}
