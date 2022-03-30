package chap16.EX08;

class A {}
class B extends A {}
class C extends B {}


//제네릭 타입의 클래스 : 제네릭 타입의 들어오는 객체를 제한을 둠.
class D <T extends B> {    //T : classB , classC 만 올 수 있다.
	private T t;		   //<T extends B> 의미 : T 타입에 접근을 제한

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric {
	public static void main(String[] args) {
		//D<A> d1 = new D<>();  //불가능 : <T>의 들어갈 객체를 제한을 둠, B class, C class만 들어갈수 있다.
		D<B> d2 = new D<B>();   //B, C를 타입으로 설정 가능
		D<C> d3 = new D<C>();
		
		D d4 = new D(); 	//D<B> D<C>  //타입을 지정하지 않고 객체 생성시 최상위 타입으로 설정됨.
							// D<B> d2 = new D<B>();
		
		d2.set(new B());	//B 객체 저장.
		d2.set(new C());	//C 객체 저장.
		//d2.set(new A());	// 오류
		
		//d3 객체는 객체를 생성할 떄 제네릭타입으로 C를 지정하므로 B객체는 입력이 불가능하다.
		d3.set(new C()); 		//d3.set(new B());오류	//d3.set(new A()); 오류
		
		d4.set(new B());
		d4.set(new C());
		


	}

}
