package Chap06_07.EX02;

// �޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű�����Ÿ��, ������ ���� ���� �ٸ� �޼ҵ尡 ȣ��� (Java ������ ����)
// �޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ����ϴ°�
import Chap06_07.Ex03.A;



public class ExternalCallMethods {

	public static void main(String[] args) {
		//��ü����
		A a = new A();	// ���� ��Ű�� ���� Ŭ������ import ���� ����� �����ϴ�.
		
		//�޼ҵ� ȣ��
		a.print();	//�ȳ�
		int k = a.data(); //3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result); //8.2
		
		a.printMethod(5); // 1 ~ 12 ������ ��
		a.printMethod(13); // �߸��� �Է°�
		
		// ���� :
		
		System.out.println(a.data());  //��±����� ȣ�� ������ �޼ҵ� (������ �ִ� �޼ҵ�)
//		System.out.println(a.print(););  //�����߻�
		a.print();
		System.out.println(a.sum(15, 13.2));
//		System.out.println(a.printMethod(3)); //���� �߻�
	}

}
