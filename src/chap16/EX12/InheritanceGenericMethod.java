package chap16.EX12;

//���׸� �޼ҵ��� ��� : �Ϲ� Ŭ���� ���� ���׸� �޼ҵ�

class Parent {  //�Ϲ� Ŭ����
	
	//Number : Boolean, Charactor�� ������ Wrapper (�⺻ ������Ÿ���� ��ü������ ��ȯ) Ÿ���� Ŭ������ �ü� �ִ�.
			//Byte, Short, Integer,Long,Double,Float
	<T extends Number> void print(T t) {  //���׸� �޼ҵ�
		System.out.println(t);
	}
}

class Child extends Parent {  // ���׸� �޼ҵ� ����� �Ϲ� ��Ӱ� ����.
	
}



public class InheritanceGenericMethod {
	public static void main(String[] args) {
		//1. �θ� Ŭ������ ���׸� �޼ҵ� ���
		Parent p = new Parent();
		p.<Integer>print(100);
		p.<Double>print(100.2345);
		//p.<String>print("�ȳ�")  //����, Number�� ��� �� �� �ִ�.
		p.print(10);	//�Ű������� ���� ���� Ÿ���� �� �� �ִ� ��� ��������
		p.print(12.14124);
		
		//2. �ڽ� Ŭ�������� ���׸� �޼ҵ� ���.
		Child c = new Child();
		c.<Integer>print(200);
		
		
		
		
	}

}
