package Chap14.EX01;

public class CheckedException_1_1 {

	public static void main(String[] args) {
		
		try {
		System.out.println(10/8);	//���α׷��� ������ ���� �Ǿ� ������.
		}catch(ArithmeticException e) {//���ܿ� ���� ó��
			//try{}���� ������ �߻��� ��쿡 �۵�.
			//e.printStackTrace();  //������ ���� �ڼ��� ������ ���
			System.out.println("0�� ������ �����ϴ�.");
		}finally {
			//try{} ������ ��� �۵�(o), ������ �־ (o)
			//try{}�� �۵��Ǹ� �׻� �۵�
			//��ü�� ����� ��ü�� �޸𸮸� ���� �Ҷ� ,��) sc.close();
			System.out.println("Finally ����� �׻� ȣ���� �ȴ�.");
		}
		
		System.out.println("���α׷��� ���� ���� �մϴ�.");	//���� ����
	}

}
