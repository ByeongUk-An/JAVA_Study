package Chap10.EX04;

//�޼ҵ� �����ε�(Method Overloading) vs �޼ҵ� �������̵� (Method Overriding)
/*
 * 1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸����� ( �Ű����� Ÿ��, �Ű����� �� )�� ���� �ش� �޼ҵ尡 ȣ��
 * 		-- ��Ӱ��� ������ ����. , �����ڿ��� ���� ���...
 * 2. �޼ҵ� �������̵� : �ݵ�� ��� ���迡�� ���.
 * 		�θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ���°�
 * 			1. ��Ӱ��迩�ߵȴ�. 2. �޼ҵ��� �ñ״���(�޼ҵ��,�Ű����� ����, �Ű����� Ÿ��)�� ���ƾ� �Ѵ�.
 * 			3. �ڽĿ��� �θ��� ����������(public,prottected,default,prevate)�� ���ų� �� ���� �������� �Ѵ�.
 */

class Ab {
	void print1() {	//�������̵�
		System.out.println("Ab Ŭ������ print1()");
	}
	void print2() { //�����ε�
		System.out.println("Ab Ŭ������ print2()");
	}
}

class Bc extends Ab {
	@Override
	void print1() {
		System.out.println("Bc Ŭ������ print1");
	}
	
	void print2 (int a) {	//�����ε�
		System.out.println("Bc Ŭ������ print2");
	}
}

public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. Ab Ÿ�� ����
		
		Ab aa = new Ab(); 
		aa.print1(); //A Ŭ������ print1 ȣ��
		aa.print2(); //A Ŭ������ print2 ȣ��
		
		System.out.println("====================");
		
		// 2. Bc Ÿ�� ����, ������ ȣ�� Bc 
		Bc bc = new Bc();
		bc.print1(); //Bc Ŭ������ print1�� ȣ��
		bc.print2(); //Ab Ŭ������ print2�� ȣ�� : �θ�Ŭ������ �޼ҵ� ȣ��
		bc.print2(3); //Bc Ŭ������ prin2�� ȣ�� : �ڽ�Ŭ������ �޼ҵ� ȣ��
		
		System.out.println("=====================");
		
		//3. Ab Ÿ������ ����, Bc Ÿ�� ������ ȣ�� ��ĳ����
		Ab cc = new Bc();
		cc.print1(); //�޼ҵ� �������̵��� �Ǿ������Ƿ� ���� ���ε��� ���ؼ� Bc�� �ִ� print1 ȣ��
		cc.print2(); //��ĳ������ �Ǿ� Ab �� Bc�� Ŭ���� ��� ������ �Ǿ������� ������ AbŬ������ ������ �����ϴ�.
	}

}
