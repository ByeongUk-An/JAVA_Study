package chap02;

public class PrimaryDataType_2 {

	public static void main(String[] args) {
		//char �ڷ����� ���� �Ҵ��ϴ� ���
		//���ڷ� �����ϴ� ���
		char value1 = 'A'; //������
		char value2 = '��'; //�ѱ�
		char value3 = '3'; //���� 3�� �ƴϰ� ���� 3�� ����Ų��.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("=====================");
		
		//������ ���� �ϴ� ���
		
		char value4 = 65; //���� 65�� �ƽ�Ű �ڵ�� ���� A
		char value5 = 0xac00; //16������ ���� �Ҵ� 0
		char value6 = 51; //51:���� 3
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		// ���� �ڵ� Ÿ������ ����
		
		char value7 = '\u0041'; //�����ڵ�� �빮�� A
		char value8 = '\uac00';
		char value0 = '\u0033';
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value0);
		
		
		
		System.out.println("========���� A �� ���� �ϴ� �پ��� ���=============");
		
		char a ='A';  //����
		char b = 65;  // 10����
		char c = 0b1000001;  // 0b�� �������� ����
		char d = 00101; // 00�� 8����
		char e = 0x0041; // 0x�� 16����
		char f = '\u0041'; // �����ڵ�
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
	}

}
