package Chap19.EX04;

/*
 	ASCII �ڵ� �� ��� : 1byte=8bit , ���� ó����Ʈ�� ��ȣ ��Ʈ, 7bit
 		1 ~ 32��Ʈ ������ : ����� �Ҽ����� Ư���� �ڵ�, ��) null, ����� ����, �����(7) ���� 10, (LF)
 		127 : delete.
 		
 		���� ��� ������ 33����Ʈ ~ 126��Ʈ
 		����, ����, Ư������.
 		
 		���
 		====================================
 		ASCII   ����        ASCII    ����
 		====================================
 		33       !          34      &
 		35       #          36      $
 */

public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("ASCII \t ���� \t\t ASCII \t ����");
		System.out.println("====================================");
		for (char c = 33; c <= 126; c++) {
			if (c % 2 != 0) {
				System.out.print(c + " = " + (int)c );
			}

			if (c % 2 == 0) {
				System.out.println("\t\t\t" +c + " = " + (int)c);
				
			}

		}
	}

}
