package chap03;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// ++는 1씩 증가
		int a = 3;
		++a;
		System.out.println(a);
		int b =3;
		b++;
		System.out.println(b);
		
		System.out.println("======================");
		
		int a1 = 3;
		int b1 = ++a1;          // a2의 값을 1증가 시키고 --> b1에 값을 할당.
		System.out.println(a1); //4
		System.out.println(b1); //4
		
		int a2 = 3;
		int b2 = a2++;              //a2 값을 b2에 대입을 하고 --> a2의 값을 1을 더한다
		System.out.println(a2);
		System.out.println(b2);
	}

}
