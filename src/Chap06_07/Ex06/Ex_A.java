package Chap06_07.Ex06;

import Chap06_07.Ex05.A;

public class Ex_A {

	public static void main(String[] args) {
		
		// �ٸ� ��Ű���� ��ü�� ����ϴ� ��� :
			// 1. ��üŬ�����̸��� ����ϴ� ���
	Chap06_07.Ex05.A a = new Chap06_07.Ex05.A();	//Ŭ������ ��ü�̸��� ��� : ��Ű����.Ŭ������
	
	//a.m = 5; // ���� �Ұ� : default ���������ڴ� �ٸ� ��Ű���� Ŭ�������� ������ �Ұ�.
	a.k = 50; // public : �ٸ� ��Ű���� Ŭ�������� ������ ����.
	a.print2(); // public
		//2. import�� ����ؼ� ���� �ϴ� ���
	A aa = new A();
	aa.k = 100;
	aa.print2();
		
	}
}
