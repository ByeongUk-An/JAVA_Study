package chap03;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// ++�� 1�� ����
		int a = 3;
		++a;
		System.out.println(a);
		int b =3;
		b++;
		System.out.println(b);
		
		System.out.println("======================");
		
		int a1 = 3;
		int b1 = ++a1;          // a2�� ���� 1���� ��Ű�� --> b1�� ���� �Ҵ�.
		System.out.println(a1); //4
		System.out.println(b1); //4
		
		int a2 = 3;
		int b2 = a2++;              //a2 ���� b2�� ������ �ϰ� --> a2�� ���� 1�� ���Ѵ�
		System.out.println(a2);
		System.out.println(b2);
	}

}
