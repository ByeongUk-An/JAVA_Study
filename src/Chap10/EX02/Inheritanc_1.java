package Chap10.EX02;

class Aa {
	int m;
	void abc() {
		System.out.println("�θ� �޼ҵ�");
	}
}
class Bb extends Aa {
	int n;
	void bcd() {
		System.out.println("�ڽ� �޼ҵ�");
	}
}

public class Inheritanc_1 {

	public static void main(String[] args) {
		//Ÿ��ĳ������ ���� �ʴ� ���
		Bb b = new Bb();  //b�� Aa, Bb ���� �Ѵ�. Aa, Bb�� �ʵ�� �޼ҵ带 ��� ��밡��
		b.m = 10; // �θ� �ʵ�
		b.n = 20; // �ڽ� �ʵ�
		b.abc(); // �θ� �޼ҵ�
		b.bcd(); // �ڽ� �޼ҵ�
		
		//��ĳ���� : �ڽ� => �θ�  : Aa Ÿ�԰�, Bb�� Ÿ�� ��� ���� ������ Aa
		Aa a = new Bb();
		a.m = 100;
//		a.n = 200; // a.n�� �ȵǴ������� �츮�� ������ Bb�� Aa�� ��ĳ������ �Ͽ� Aa�� Bb�� �ʵ� �޼ҵ带 ������� ������ ������ ��ĳ���� �� Aa���� ������ �����ϴ�.
		
		Bb bb6 = (Bb) a; // ������ a�� Bb���� Aa�� ��ĳ���� �Ǿ� �ִ°��� Bb�� �ٿ�ĳ������ �Ѱ��̴�. ��ĳ������ ��ȯ�Ѱ͸� ������ ���������� �ٿ�ĳ���� �ϸ� Aa,Bb�� �ʵ�� �޼ҵ�
							//�� ��� ����� �����ϴ�
		bb6.m = 100;
		bb6.n = 200;
	}

}
