package Chap06_07.EX02;


//�⺻Ÿ���� �޼ҵ�
public class InternalCallMethod {

	public static void main(String[] args) {
		// ���� Ŭ���� �ȿ��� ���� �޼ҵ� ȣ��
		
		InternalCallMethod aaa = new InternalCallMethod();
		aaa.print();	//aaa ��ü�� pinrt �޼ҵ� ȣ�� : static Ű�� ������� ���� ���� ��üȭ ������� ȣ���� �����ϴ�.
		
		int a = aaa.twice(18);
		System.out.println(a); //36
		
		double b = aaa.sum(5, 6.9);
		System.out.println(b);
		
		
	}
	void print() { //static Ű���� ���� �޼ҵ� ����, ��üȭ ���Ѽ� �޼ҵ� ȣ��
		System.out.println("�ȳ�");
		
	}
	int twice(int k) {
		return k * 2;
	}
	double sum (int m , double n) {
		return m + n;
	}

}
