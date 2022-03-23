package Chap14.EX05;
// ���� ������ ��ü���� AutoCloseable �� ����� ����,
	//try ( ��ü �������� ) {} catch {} : �ڵ����� close() �ȴ�. //
	// 1. AutoCloseable �������̽��� close() �޼ҵ带 �������̵� �ؾ��Ѵ�.

	//java.lang.AutoCLoseable : java.lang <= import�� ���ص� �ȴ�.
	//java.lang.Object        : java.lang <= import�� ���ص� �ȴ�.

	//���ܸ� ó���ϴ� ��� 
		// 1. try catch �� ����ؼ� ���� ó�� �ϴ¹��	: �ڽ��� ���� ���ܸ� ó�� �ϰڴ�.
		// 2. thorws�� ���ؼ� ���ܸ� ó�� �ϴ� ��� : ���ܸ� ���� ó������ �ʰ� ȣ���ϴ°����� ���ܸ� ó���ϵ��Ϲ̷��.
			//���� ����. �޼ҵ� ���� ����
			//throw : ���ܸ� ������ �߻���Ų��.

class A implements AutoCloseable {
	String resource;	//resource = �ʱⰪ(null) �ʵ�Ư��
	A (String resource) {	//�������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε�
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {	//close() �޼ҵ尡 �ڵ����� ȣ��ȴ�.
		if(resource != null) {
			resource = null;
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
			System.out.println(resource);
		}
	}	
}

public class TryWithResource_2 {
	public static void main(String[] args) {
		//1. �ڵ� ���ҽ� ���� ���
		try(A a1 = new A("Ư�� ����");) {
			
		}catch (Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}//finally ����� a1.close() �޼ҵ带 �ڵ����� ȣ���.
		
		System.out.println("==========================================");
		
		//2. �������� ���ҽ� ����
		A a2 = null;
		try {
			a2 = new A("������ �ʱⰪ �Ҵ�");
		}catch(Exception e) {
			
		}finally {	
			if(a2.resource != null) {
				
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
