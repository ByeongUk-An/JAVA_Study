package Chap13.EX08.EX1;

//3. �޼ҵ��� �Ű� ������ ���� :
// 3-1 : ��ü ������ �Ű� ������ ���� ( Ŭ������ o, + �������� o )
// 3-2 : ��ü ������ �Ű� ������ ���� ( Ŭ������ o, + �������� x )
interface A{	//�������̽� , �߻�޼ҵ带 ����,
	public abstract void cry();	// �߻�޼ҵ� : public abstract �� ���� �Ǿ� �ִ�.
	void fly();
}

class B implements A { //B�� A�������̽��� ������ Ŭ����
	@Override
	public void cry() {
		System.out.println("�۸� : �Ű� ���� ������ ���");
	}
	@Override
		public void fly() {
		System.out.println("�������մϴ� : �Ű����� ����");
		}
}
class C {	//C ��ü�� abc �޼ҵ� ȣ��� A Ÿ���� �Ű������� �޴´�.
	void abc(A a) {	//���� �ڽ� Ŭ������ �Ű������� ���ð�� A Ÿ������ �ڵ����� ��ĳ���� �ȴ�.
		a.cry();
		a.fly();
	}
}
	
	
	
	


public class Anonymous_3_1 {

	public static void main(String[] args) {
		//1. Ŭ������ �����ϰ� ���������� �����ؼ� ���������� �Ű������� ������ ���̽�
		C c = new C();
		A a = new B();	//B�� ��üȭ �ؼ� A Ÿ������ ����, a : ���� ����
		c.abc(a);
		
		System.out.println("==========================");
		
		//2. Ŭ������ �����ϰ� ���������� �������� �ʴ� ���̽�
		c.abc(new B());	//new B�� void abc(A a)�� ���� �Ǹ鼭 Ÿ���� A�� �Ǹ鼭 ��ĳ������ �ȴ�.
	}

}
