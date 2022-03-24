package Chap14.EX07;

// Exception - Checked Exception - ������ ����, �ݵ�� ����ó���� ���־�� �Ѵ�.
// 			 - unChecked Exception , RunTime Exception - ����ÿ� ����,
// ���� ó�� ��� - try catch <== �ڽ��� ���� ���ܸ� ó��
//             - throws <== ����ó���� �̷�°�(����), �޼ҵ������� ���ܸ� �޼ҵ� ȣ��� ȣ���ϴ� �ʿ� �̷�°�.
//			   - throw : ���ܸ� ������ �߻�.

// 1. Exception�� �߻��Ǵ� �޼��� ���ο��� �ڽ��� ���� ���ܸ� ó���� ���
class A {
	void abc() {
		bcd(); // bcd(); ȣ��
	}

	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); // �Ϲݿ��� ClassNotFoundException
			Thread.sleep(1000); // ms : 1000, 1�� //�Ϲݿ���

		} catch (ClassNotFoundException | InterruptedException e) {

		}
		// Class.forName => �����ε� - �����Ͻÿ� üũ���� �ʰ� �����Ҷ� ��ü�� �����ϴ��� Ȯ��.
		// ����� Ŭ���� ������ �����Ҽ��� �ְ� �������� �������� �ֱ⋚���� ���� ó���� ���־�� �Ѵ�.
	}
}


//2. Throws�� ����Ͽ� Exception�� �̷�� ���
class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {

		}
	}

	//bcd() �޼ҵ带 ȣ���ϴ� ���� ���ܸ� �̷�ڴ�.
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls =Class.forName("java.lang.Object"); //�Ϲݿ��� ClassNotFOundException
		Thread.sleep(1000);  //ms : 1000, 1�� //�Ϲݿ���
	}
}

public class ThrowsException_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
