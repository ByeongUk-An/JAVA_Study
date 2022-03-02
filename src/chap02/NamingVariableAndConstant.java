package chap02;
public class NamingVariableAndConstant {
	public static void main(String[] args) {
		//변수명
		boolean aBcD; //변수명은 첫자는 소문자로 시작, 단어를 연결한 경우 첫단어는 대문자로
		byte 가나다라; //변수명은 한글을 넣을수 있다. (권장하지 않음)
		short _abcd; //변수명에 특수문자 _를 사용할 수 있다.
		char $ab_cd; //변수명에 $, _를 사용할 수 있다.
		//char ab cd; // 공백이나 다른 특수문자를 넣을 수 없다.
		long abcd3; //변수명에 숫자를 넣을수 있다. 단 첫번째 단어에 숫자가 오면 오류 발생
		//long 3abcd; // 첫글자에 숫자가 오면 에러가 발생한다.
		//double main; // 자바에서 사용하는 예약어를 변수명으로 사용불가
		//double class; // 자바에서 사용하는 예약어를 변수명으로 사용불가
		int ABCD; //변수명은 대문자로 사용가능(권장하지 않음), 상수는 상수명을 전체 대문자로 사용.
		
		// 상수 : 값을 변경할수 없다. final 키워드를 사용 한다. , 대문자를 사용.
		final double PI;
		final int MY_DATA;
		final float my_Data; //권장하지 않는다
		
		PI = 3.141957;
		
		System.out.println(PI);
		
		//PI = 123,4567; // 상수에는 값을 재할당을 할 수 없다.
		
		abcd3 = 1234L; //정수 데이터 타입 long 변수에 값을 할당 할때, l, L을 명시해 줘야 한다.
		
		System.out.println(abcd3);
		abcd3 = 56789L; // 변수에 갑을 재할당.
		System.out.println(abcd3);
		
		aBcD = true; //aBcD 는 true,false 만 넣을 수 있다.
		
		가나다라 = 127; //byte : 1byte ( -129 ~ 127) 사이에 있는 값만 넣을수 있따.
		System.out.println(가나다라);
		
		//가나다라 = 128;
		
	}
}
