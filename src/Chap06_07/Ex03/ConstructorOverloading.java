package Chap06_07.Ex03;


// ������ �����ε� : �ϳ��� ������ �� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ��
// ���� ) ������Ÿ�Ե� ����, ������ ���� ��� �ΰ��̻� ������ �����߻�
class Abc {
	int a , b , c;
	String d;
	
	
	Abc() {}
	Abc(int a) {
		this.a = a;
		System.out.println(a);
	}
	Abc(String d) {
		this.d = d;
		System.out.println(d);
	}
	Abc(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
	Abc(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a+b+c);
	}
	
}




public class ConstructorOverloading {
	public static void main(String[] args) {
		Abc abc = new Abc(); // �⺻ ������ ȣ��
		Abc abc1 = new Abc(30); // �Ű� ���� �ϳ��� ������ ȣ��
		Abc abc2 = new Abc("��´�"); // �Ű������� ���� ������ Ÿ���� �ٸ��� �ش� �޼ҵ带 ȣ��
		Abc abc3 = new Abc(10,20);
		Abc abc4 = new Abc(10,20,30);
	}

}
