package Exex;

public class St {

	public static void main(String[] args) {
		//String �� ���� �Ҵ� �Ҷ� �����ڸ� ���ؼ� �Ҵ�. // ������ �޸� ������ ������
		String aa = new String("�ȳ�");
		String bb = new String("�ȳ�");
		
		
		
		

		System.out.println(aa);
		System.out.println(bb);
		// �⺻ �ڷ����϶� : == (���� ��)
		// ���� �ڷ����ϋ� : == (�����ϴ� �ּ��� ������ ��)
		// ���� �ڷ����϶� ���� �� : equals(������) �� ���
		// �޸��� �ּ� ���� �� (aa, bb�� �ٸ� �޸� �ּҸ� ������.
		if(aa == bb) {
			System.out.println(true);
			
		}else {
			System.out.println(false);   // false ��� (����Ű�� �ּҰ��� �ٸ���.)
		}
		// String �� ���� ���ͷ� ���� �ٷ� �Ҵ�. // �޸� ������ ���� �Ѵ�.
		String a = "���";
		String b = "���";
		
		if(a==b) {   //���� �ڷ������� "==" : �޸��� �ּҸ� ��
			System.out.println(true); // true �� ��� (���� ���Ѵ�)
		}else {
			System.out.println(false);
		}
		
		
	}

}
