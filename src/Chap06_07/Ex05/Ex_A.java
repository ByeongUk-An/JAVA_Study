package Chap06_07.Ex05;

// ���� ��Ű�� ������ class A �� ����

public class Ex_A {
	
	public static void main(String[] args) {
		// A class�� ���� ��Ű�� ���ο� ���� �ϹǷ� import �� ������� �ʰ� ����� �����ϴ�.
		
		A a = new A();  // import ���� ����� �����ϴ� : A��� class�� ���� ��Ű�� ���� ����
		
		a.m = 10;  // A class �� ���� �����ڰ� , default �� �� ��밡��������, ������ ������Ű�� �������� ������ �����ϴ�.
		a.n = 20;
		
		a.print(); // default ���� ������ �̹Ƿ� ������ �����ϴ�.
	}
}
