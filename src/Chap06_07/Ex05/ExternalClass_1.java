package Chap06_07.Ex05;

class B { // �ܺ� Ŭ���� : public �� �ü� ����. default �� �����Ǿ� �̴�.
		 // �ٸ� ��Ű���� Ŭ���������� ������ �Ұ�, ���� ��Ű�� �������� ���� ����
	private int a = 1; // private : ���� Ŭ���������� ����� �����ϴ�.
	int b = 2;		   // default : ���� ��Ű������ �ٸ� Ŭ�������� ���� ����
	protected int c = 3;	// protected : default ���� + �ٸ���Ű���� ������ �����ѵ� (��ӵ� ��츸 �����ϴ�.)
	public int d = 4;		// public : �ٸ� ��Ű������ ������ �����ϴ�.
	
	// private < default < protected < public
	
	private void print1 () { // ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 20;
		b = 10;
		c = 30;
		d = 40;
		System.out.println("");
	}
	
	void print2 () { // ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 20;
		b = 10;
		c = 30;
		d = 40;
		System.out.println("");
	}
	protected void print3 () { // ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 20;
		b = 10;
		c = 30;
		d = 40;
		System.out.println("");
	}
	
	public void print4 () { // ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 20;
		b = 10;
		c = 30;
		d = 40;
		System.out.println("");
	}
}

class C { 
	
}

public class ExternalClass_1 {

	public static void main(String[] args) {
		B b = new B();  // default ���� �����ڰ� class �̸��� �Ҵ� / ���� Ŭ������ �����ϹǷ� B Class�� ������ �� �ִ�.
		
		
		Bb bb = new Bb(); // public ���� ������, ���� ��Ű�� ������ ����
		
		// ���� ��Ű���� �ٸ� Ŭ�������� ����
		
		//�ʵ� ����
//		bb.a = 10; // private : Ŭ���� ���ο����� ����� �����ϴ�.
		bb.b = 20; // default : ���� ��Ű���� Ŭ�������� ������ ���
		bb.c = 30; // protected : default �� ����, + << �ٸ� ��Ű������ ������ ���������� ��Ӱ����϶��� >>
		bb.d = 40; // public : protected�� ���� + �ٸ� ��Ű������ ���� ����

		//�޼ҵ� ����
//		bb.print1(); // private  : ���� �߻�, Ŭ���� ���ο����� ȣ��
		bb.print2(); // default  : ��Ű�� ���� 
		bb.print3(); // protected
		bb.print4(); // public
		
		
	}

}
