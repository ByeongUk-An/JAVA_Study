package Chap12.EX1;

// 2. �߻� �޼ҵ带 ����ϴ� 2��° ��� : �ڽ� ��ü �������� �͸� Ŭ������ Ȱ���ϴ� ���
	//1���� �ӽ������� ����Ҷ�, �̺�Ʈ ó��

abstract class AAA {
	abstract void abc(); //�߻�޼ҵ�
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		//1. �͸� ��ü ����
		AAA aaa = new AAA() { //�͸� ��ü�� Ȱ���� �߻�޼ҵ带 Ŭ���� �������� ���� �� ��
			void abc() {
				System.out.println("���2 : ��ü ���� ���� �͸�Ŭ������ �߻�޼ҵ� ����");
			}
		};	
		
		//2. �޼ҵ� ȣ��
		aaa.abc();
	}

}
