package Chap06_07.Ex05;

public class Bb { // Ŭ�����̸� : public ( ���� ��Ű������ ������ �����ϰ� �ٸ���Ű�������� ������ �����ϴ�.
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
