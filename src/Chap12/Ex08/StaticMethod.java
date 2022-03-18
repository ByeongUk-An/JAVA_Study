package Chap12.Ex08;
// �������̽� ���ο� static Ű�� �� �޼ҵ� : ���� �ڽĿ��� ���� ���� �ٷ� ȣ��

/*
 * �������̽� ���� ���� ���
 * 	1. �ʵ� : [public static final]
 * 	2. �޼ҵ� :[public abstract]    <== �߻� �޼ҵ� (�����ΰ� ���� �޼ҵ�)
 * 			 [public] default     <== �����ΰ� �ִ� �޼ҵ� (Java 1.8 �̻󿡼� ���ο� ���)
 * 			 [ public] static     <== �����ΰ� �ְ�, ��ü ���� ���� ȣ���� �����ϴ�.
 */

interface A {
	static void abc() {  //Java 1.8 �̻󿡼� ���Ӱ� �߰��� ���
		System.out.println("A �������̽��� ���� �޼ҵ�");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		//1. ����(static) �޼ҵ� ȣ��
		A.abc();   
	}

}
