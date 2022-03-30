package chap16.EX08;

class A {}
class B extends A {}
class C extends B {}


//���׸� Ÿ���� Ŭ���� : ���׸� Ÿ���� ������ ��ü�� ������ ��.
class D <T extends B> {    //T : classB , classC �� �� �� �ִ�.
	private T t;		   //<T extends B> �ǹ� : T Ÿ�Կ� ������ ����

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric {
	public static void main(String[] args) {
		//D<A> d1 = new D<>();  //�Ұ��� : <T>�� �� ��ü�� ������ ��, B class, C class�� ���� �ִ�.
		D<B> d2 = new D<B>();   //B, C�� Ÿ������ ���� ����
		D<C> d3 = new D<C>();
		
		D d4 = new D(); 	//D<B> D<C>  //Ÿ���� �������� �ʰ� ��ü ������ �ֻ��� Ÿ������ ������.
							// D<B> d2 = new D<B>();
		
		d2.set(new B());	//B ��ü ����.
		d2.set(new C());	//C ��ü ����.
		//d2.set(new A());	// ����
		
		//d3 ��ü�� ��ü�� ������ �� ���׸�Ÿ������ C�� �����ϹǷ� B��ü�� �Է��� �Ұ����ϴ�.
		d3.set(new C()); 		//d3.set(new B());����	//d3.set(new A()); ����
		
		d4.set(new B());
		d4.set(new C());
		


	}

}
