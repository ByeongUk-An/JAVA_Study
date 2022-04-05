package Chap17.EX08treeset;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력시 이름을 오름차순으로 출력하도록 구현. TreeSet에 name 컬럼을 정렬
// 1. Comparable<E> 의 compareTo() 메소드 재정의
	//기존의 객체 수정이 필요
// 2. comparator<E> 의 compare() 구현
	//기존객체 수정하지 않고 익명객체

class Abc {
	String name;  // << 컬럼이 정렬 컬럼. 오름 차순 정렬; 가나다라....하 , 
			   // 홍길동, 이순신, 강감찬  ===> 강감찬, 이순신, 홍길동  이름순으로 출력
	int age;	   // 나이
	
	public Abc(String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	@Override
	public String toString() {
		return  name + "의 나이는 :" + age + "입니다.";
	}
}

class Abc_T implements Comparable<Abc_T> {
	String name;
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Abc_T o) {
		return (this.name.compareTo(o.name));
	}
	
	@Override
	public String toString() {
		return name + "의 나이는 :" + age + "입니다.";
	}
}

public class Ex_TreeSetMethod_3 {
	public static void main(String[] args) {
		TreeSet<Abc_T> ts1 = new TreeSet();
		
		Abc_T a1 = new Abc_T("홍길동",30);
		Abc_T a2 = new Abc_T("이순신",17);
		Abc_T a3 = new Abc_T("강감찬",37);
		
		ts1.add(a1);
		ts1.add(a2);
		ts1.add(a3);
		
		System.out.println(ts1);
		System.out.println("=============");
		
		TreeSet<Abc> ts2 = new TreeSet<Abc>(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				return (o1.name.compareTo(o2.name));
			}
		});
		
		Abc b1 = new Abc("홍길동",29);
		Abc b2 = new Abc("이순신",21);
		Abc b3 = new Abc("강감찬",19);
		
		ts2.add(b1);
		ts2.add(b2);
		ts2.add(b3);
		
		System.out.println(ts2);
		
	}
}
