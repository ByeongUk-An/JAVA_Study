package Chap06_07.Ex06;

import Chap06_07.Ex05.C;

public class EX_C {
	

	public static void main(String[] args) {
		
		// �ٸ� Ŭ������ ������ / public �� ���� / model , color �޸𸮷� ���� �Ұ�
				//model�� color�� setter �� public ���ؼ� �Ҵ��� ���
				C c = new C();
				c.maxspeed = 300;
				c.setModel("Sonata");
				c.setColor("red");
				c.print();
//				
		
		
	}

}
