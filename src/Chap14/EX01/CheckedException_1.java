package Chap14.EX01;

import java.util.Scanner;

//Error : ���α׷��Ӱ� ������ �� ���� �κ�, OS���� �߻��ϴ� Error, H/W Errow
//Exception (����) : ���α׷��Ӱ� ���� �� �� �ִ� �κ�.
	//���ܰ� �߻� �Ǹ� ���α׷��� ����Ǿ� ������.
	//���ܰ� �߻� �Ǵ��� ���α׷��� ������� �ʰ� ó���� ������Ѵ�. (����ó��)

//ArithmeticException : ����� 0���� ������ �߻��ϴ� Exception(����)
	//��ǻ�ʹ� ����� 0���� ������� ��� �Ұ�
public class CheckedException_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� �ϳ��� �Է� �ϼ���>>>");
		int a = sc.nextInt();
		int b = 10;
		
		try {	//try ��� ���� ���� (Exception) �� �߻��� ���
			//try ���
			System.out.println(b / a);	
		}catch(ArithmeticException e) { 
			//catch ��� : try{} ������� ������ �߻� �� ��� catch ����� �۵��ȴ�.
			System.out.println("�����߻�");
		}finally {
			
		}
		
		System.out.println("���α׷��� ���� �մϴ�.");
		
		
	}

}
