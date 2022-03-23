package Chap14.EX02;

//실행 예외 (Unchecked Exception, RunTime Exception ) : 컴파일 단계에서는 예외가 발생되지 않음.
	//실행시에 발생 될 수 있다.
class AA {}
class BB extends AA {}

public class UncheckException {
	public static void main(String[] args) {
		//실행 예외
		//ArithmeticException : 0으로 어떤 수를 나누면 오류가 발생.
		//System.out.println(10/0);
		
		//ClassCastException : 클래스의 타입을 변환할떄 변환 되지 않는 예외발생
		AA aa = new AA();
		//BB bb = (BB) aa;	//컴파일 단계에서는 오류가 발생되지 않는다.
		
		//ArrayIndexOutOfBoundsException : 배열의 존재하지 않는 방번호를 출력 할 경우 발생. 
		int[] array = {1,2,3};
		//System.out.println(array[3]);
		
		//NumberFormatException : 문자형 숫자를 정수타입으로 변환할수 없는 예외발생.
		//int num = Integer.parseInt("10!");  //문자열 10을 정수로 변환
		//System.out.println(num);
		
		//NullPointerException : 객체가 null 인데 메소드를 호출하는 경우 발생.
		String str = null;
		System.out.println(str.charAt(2));
		
		
	}

}
