package chap04;
public class IF__Ex01 {
	public static void main(String[] args) {
		//if �� : 
		/*
		 * if(����) {
		 * 	 ����� �ڵ�;
		 * }
		 */
		int value1 =5;
		if(value1 > 3) {
			System.out.println("����1 : ������ ���϶� ����");
		}
		/*
		 * if (����) {
		 *    ������ ���϶� ������ ����;
		 * } else {
		 *    ������ �����϶� ������ ����;
		 * }
		 */
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1) {
			System.out.println("����3");   // ������ True �϶� ����
		}else {
			System.out.println("����4");   // ������ False �϶� ����
		}
		
		if(bool2) {
			System.out.println("����5");   // ������ True �϶� ����
		}else {
			System.out.println("����6");   // ������ False �϶� ����
		}
		
		System.out.println("=========================");
		
		//if ~ else �� ���� �����ڷ� ��ȯ�� �����ϴ�!!
		
		System.out.println((bool1) ? "����7" : "����8"); // �� : ����7
		System.out.println((bool2) ? "����7" : "����8"); // ���� : ����8
		
		/*
		 * if�� ������ ���� ���϶� ?
		 * 
		 * if (����1) {
		 *    ����1�� ���϶� ���� �ڵ�;
		 * } else if(����2) {
		 *    ����1�� �����̰� ����2�� ���϶� ���� �ڵ�;
		 * } else if(����3) {
		 *    ����1,����2 �� �����̰� ����3�� ���϶� ���� �ڵ�;
		 * } else {
		 *    ����1,����2,����3�� �� �����϶� else�� ����;
		 * }
		 */
		
		int value2 = 55;
		
		if(value2 >= 90) {
			System.out.println("A ����, ���� :" + value2);
		}else if(value2 >= 80) {
			System.out.println("B ����, ���� :" + value2);     //�����Ŀ� if ���� ���� ���´�.
		}else if(value2 >= 70) {
			System.out.println("C ����, ���� :" + value2);
		}else {
			System.out.println("F ����, ���� :" + value2);
		}
		
		
		/*
		 *  if ������ ������ ������ �ٲ�� ���� ���
		 */
		
int value3 = 85;
		
		if(value3 >= 90) {
			System.out.println("A ����, ���� :" + value3);
		}else if(value3 >= 70) {
			System.out.println("B ����, ���� :" + value3);     //�����Ŀ� if ���� ���� ���´�.
		}else if(value3 >= 80) {
			System.out.println("C ����, ���� :" + value3);
		}else {
			System.out.println("F ����, ���� :" + value3);
		}
		System.out.println("===========================");
		/*
		 * ������ �ο� �Ҷ� �����ϰ� ����
		 */
int value4 = 80;
		if(value4 <=100 && value4 >= 90) {
			System.out.println("A �����Դϴ�.");
		}else if (value4 < 80 && value4 >= 70) {
			System.out.println("C �����Դϴ�.");
		}else if (value4 < 90 && value4 >=80) {
			System.out.println("B �����Դϴ�.");
		}else {
			System.out.println("F �����Դϴ�.");
		}
		
		/*
		 * if ������ ���๮�� �ϳ��� �� {�߰�ȣ} �� ���� �� �� �ִ�.
		 */
		
		System.out.println("=====================");
		
		if(3 < 5)
			System.out.println("�ȳ�");
		    
		System.out.println("=====================");
		
		if (3 > 5)
			System.out.println("�ȳ��ϼ��� 2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
