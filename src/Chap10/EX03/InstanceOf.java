package Chap10.EX03;

//instancof : ��ü ������ ĳ������ ���ɿ��θ� �� �� �ֵ��� �ϴ� Ű����
// ��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� True, False �� ����
// �ٿ� ĳ���� �� �� ��Ÿ�� ������ �߻� �� �� �ִ�. , ��Ÿ�� ������ ���� �����ش�.
// �ٿ� ĳ���ý� �ش� Ÿ���� ��ü�� ���� �� �� �ٿ�ĳ���� �ϵ��� ����.

class A {
	int m;

	void a() {
		System.out.println(m);
	}
}

class B extends A {
	int n;

	void B() {
		System.out.println("n :" + n);
	}
}

public class InstanceOf {

	public static void main(String[] args) {
		
		//1. instanceof : ��ü�� instanceof Ÿ��(Ŭ�����̸�)
		A aa = new A();	// aa�� AŬ���� Ÿ�Ը� ������ �ִ�.
		A ab = new B(); // ab�� AŬ������ ��ĳ����  ab�� A, B, ���� ������ ������ A�� �����ϴ�.
		
		System.out.println(aa instanceof A); // true
		System.out.println(ab instanceof A); // true
		System.out.println(aa instanceof B); // false
		System.out.println(ab instanceof B); // True
		
		if(aa instanceof B) { // aa��ü�� B Ÿ���� ���� �Ǿ� ���� ��� �����Ͽ� ĳ�����Ѵ�
			B b = (B)aa; //��Ÿ�ӽ� ������ ������ ����
			System.out.println("aa�� BŸ������ ĳ���� �߽��ϴ�.");
		}else {
			System.out.println("aa�� BŸ������ ĳ���� �����߽��ϴ�.");
		}
		
		if (ab instanceof B) { //ab�� BŸ���� �����ϴ� ��� �ٿ�ĳ����
			B b = (B)ab;
			System.out.println("ab�� B Ÿ������ ĳ���� �߽��ϴ�.");
		}else {
			System.out.println("ab�� B Ÿ������ ĳ���� �����߽��ϴ�.");
		}
		
		if ("�ȳ�" instanceof String) { //��ü�� Ÿ���� Ȯ�� => int,double,float,short �������� �⺻�ڷ����̹Ƿ� �ȵ�
			System.out.println("\"�ȳ�\"�� String �Դϴ�.");
		}else {
			System.out.println("\"�ȳ�\"�� String �� �ƴմϴ�.");
		}
		
		
		
		
	}

}
