package Chap13.EX10;

//�̳��������̽� (InnerInterface) : Ŭ���� ������ �������̽��� ����, �ܤ���Ŭ���� �����ϰ� ����� ��������
//								Ŭ���� ���ο� ����.
//	static �� �ڵ����� �����Ϸ��� ���ؼ� ����. <<== ����

class A {
	static interface B {	//static �� �����Ϸ��� ���ؼ� �ڵ����� �߰���.
		void bcd();    // public abstract
	}
}

//�̳� �������̽��� ������ Ŭ���� C  
class C implements A.B {	// A.B�� AŬ���� �ȿ� �̳��������̽� B�� ���Ѵ�. / A,B : A�������̽� �� B�������̽�
	@Override
	public void bcd() {
		System.out.println("�̳��������̽��� ������ Ŭ���� C");
	}
}
		
public class InnerInterface_1 {

	public static void main(String[] args) {
		//1. �ڽ� ��ü�� ���� ������ ��� (�ڽ� Ŭ������ ���� �� ���)
		A.B ab = new C();  //�θ��� Ÿ������ ��ĳ������ �������̵��� ���� ���
		ab.bcd();
		C c = new C();	//�ڽ��� �޼ҵ带 ���� ȣ��
		c.bcd();
		//2. �͸��̳� Ŭ������ ��� (�ڽ� Ŭ���� ���� ���)
		A.B b = new A.B() {
			
			@Override
			public void bcd() {
				System.out.println("�͸��̳� Ŭ������ ��ü ������ ���");
			}
		};
		b.bcd();
		
		
	}

}
