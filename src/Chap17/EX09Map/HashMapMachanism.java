package Chap17.EX09Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Map : Key는 중복되지 않아야 함. equals(),hashCode() 재정의 시켜야 한다.
	//Value는 중복되어도 됨.

//equals(), hashCode()를 재정의 하지 않는 클래스
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data + " ";
	}
}
//equals()만 재정의 클래스
class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { //obj는 Object 타입으로 업캐스팅
		if(obj instanceof B) {  //obj가 B타입을 내포할떄 (True)
			if(this.data == ((B)obj).data) {
				return true;	
			}
		}
		return false;
	}
}
//equals(), hashCode()를 재정의 클래스
class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if(this.data == ((C)obj).data) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data); //권장방법  
		//return data;
	}
	@Override
	public String toString() {
		return data + "";
	}
}
public class HashMapMachanism {
	public static void main(String[] args) {

		//1. 두 메소드 모두 오버라이딩 하지 않는 경우
		Map<A, String> hashMap1 = new HashMap<A,String>();
		
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2); // == 은 Stack주소를 비교, false
		System.out.println(a1.equals(a2)); // ==, false
		
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		System.out.println("============================");
		
		
		//2. equals() 만 오버라이딩 된 경우
		Map<B,String> hashMap2 = new HashMap();
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); //false
		System.out.println(b1.equals(b2));  //true
		
		hashMap2.put(b1, "첫번째");
		hashMap2.put(b2, "두번째");
		
		System.out.println(hashMap2.size()); //2
		System.out.println(hashMap2);
		System.out.println();
		
		//3. equals(), hashCode() 모두 오버라이딩 된것
		Map <C, String> hashMap3 = new HashMap();
		C c1 = new C(3);
		C c2 = new C(4);
		
		System.out.println(c1 == c2); //false
		System.out.println(c1.equals(c2));  //true
		
		hashMap3.put(c1,"첫번쨰");
		hashMap3.put(c2,"두번쨰");
		
		System.out.println(c1.hashCode() + " , " + c2.hashCode()); //34 : 10진법
		System.out.println(hashMap3); //22 : 16진수
		System.out.println(hashMap3.size()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
