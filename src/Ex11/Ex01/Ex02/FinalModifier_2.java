package Ex11.Ex01.Ex02;

//final �޼��� final class�� Ư¡
	//final �޼��� : �������̵��� �Ұ� : ���� �߿��� �޼���� �ڽĿ��� ������ ���� ���ϵ��� ����
	//final Ŭ���� : ����� �Ұ��� Ŭ����
	

class A {
	void abc() {}
	final void bcd() {} // final �Ҵ�� �޼ҵ�� �ڽ� Ŭ�������� �������̵��� �Ұ�
}
class B extends A {
	@Override
	void abc() {} // �޼ҵ� �������̵��� �����ϴ�.
	//@Override
	//void bcd() {} //�޼ҵ� �������̵� �Ұ���.
}
//final class C {} //final class �� ����� �Ұ��� Ŭ����
//class D extends C {}  
	

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
