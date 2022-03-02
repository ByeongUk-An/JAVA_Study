package chap04;
public class Switch_Ex02 {
	public static void main(String[] args) {

		// Switch ������ Break�� ó�� ���� �ʾ����� : �ش� case�� �̵��� �� ������ case�� ���� ����!!
		int value1 = 2;
		
		switch(value1) {
		case 1:
			System.out.println("A ����");
		case 2:
			System.out.println("B ����");
		case 3:
			System.out.println("C ����");
		case 4:
			System.out.println("D ����");
		default :
			System.out.println("�а���!!");
		}
		
		System.out.println("===============================");
		
		// Switch���� break�� ���� �� ���
		
		int value2 = 3;
		
		switch(value2) {
		case 1:
			System.out.println("A ����");
			break;
		case 2:
			System.out.println("B ����");
			break;
		case 3:
			System.out.println("C ����");
			break;
		case 4:
			System.out.println("D ����");
			break;
		default :
			System.out.println("�а���!!");          //Switch���� ������ default�� break���� ���� �ص� �ȴ�.
		}
		
		System.out.println("===========================");
		
		if(value2 == 1) {
			System.out.println("A ����");
		} else if(value2 == 2) {
			System.out.println("B ����");
		} else if(value2 == 3) {
			System.out.println("C ����");
		} else {
			System.out.println("�а�");
		}
		
		/*
		 * switch �� ����ؼ� ������ 7�� �̻��� pass, 7�� ���ϴ� fail �� ��� (���� : 1~10)
		 */
		
		int a = 8;
		
		switch(a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
