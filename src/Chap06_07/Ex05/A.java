package Chap06_07.Ex05;

	// ���� ������( ĸ��ȭ : �����͸� �ܺη� ���� ��ȣ) : Public, protected, default ( �����ؼ� ��� ), private
		// Ŭ���� �̸�, �ʵ��, �޼ҵ��, �����ڸ�  <<== ���� �����ڰ� �ݵ�� �Ҵ��� �Ǿ� �ִ�.
		// Ŭ���� �̸� : public, default
public class A {
	
	int m = 3;  // �ʵ��� �⺻ ���� �����ڴ� default : ������ , ���� ��Ű�� �������� ������ ���� , ���� ��Ű�� ���� �ٸ� Ŭ�������� ������ ����
	int n = 4;			// default : �ٸ� ��Ű���� Ŭ���������� ���� �Ұ�.
						// private : �ܺ� Ŭ�������� ������ �Ұ�
	public int k = 10;  // public : �ٸ� ��Ű������ ������ ����
	
	void print () {		// default : ���� ��Ű������ Ŭ���������� ��� ���� (default �� ����)
		System.out.println("����Ʈ ����" + m + " , " + n);
	}
	public void print2() {
		System.out.println("����Ʈ ����" + k);
	}
	
	public static void main(String[] args) {
	
	}
}
