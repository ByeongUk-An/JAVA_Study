package Chap12.Ex09;

public class SamsungPhone implements PhoneInterface {

	//�������̽����� ������ �޼ҵ带 ���� �� �ڵ�
	@Override
	public void sendCall() {
		System.out.println("�򽺺�");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�Դ�");
	}

	//�߰����� SamsungPhone ���� ����� �߰�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	



}
