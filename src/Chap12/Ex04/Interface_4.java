package Chap12.Ex04;

//�������̽� ��ӽ� �ڽ� Ŭ���� ���� ������ ���� << �߿�
	//�������̽��� �޼ҵ带 ���� �� �� �ݵ�� public�� �־���� �Ѵ�.
interface A {
	public abstract void abc();
}

class F implements A { //F Ŭ������ �ϼ��� �޼ҵ尡 ���� �Ǿ� �־�� �Ѵ�.

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
}

interface B {
	void abc();
}
class C implements A {

	public void abc() { // A �������̽��� abc(); �� �������̵� �ؼ� ������ �޼ҵ�
						//�ڽ��� �θ𺸴� ���������ڰ� ���ų� ����� �Ѵ�.
	}
	
}
class D implements B {
	public void abc() {  //�������̽��� �޼ҵ带 �����Ҷ��� �ݵ�� public ���� �����ڸ� ����ؾ� ����.
		
	}
}

class E implements B {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface_4 {

	public static void main(String[] args) {

	}

}
