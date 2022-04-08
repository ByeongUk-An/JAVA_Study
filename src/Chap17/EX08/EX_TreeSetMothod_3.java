package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력시 이름을 오름 차순으로 출력하도록 구현하라. TreSet에 name 컬럼을 오름차순으로 정렬
// 1. Comparable<E> 의 compartTo() 메소드 재정의 
		//기존의 객체 수정이 필요
// 2. Comparator<E> 의 cpmpare() 구현 
		//기존의 객체를 수정없이 구현 

//완료 시간 : 11: 20분까지, p.jangwoo@gmail.com , 조장님에게도 메일


class Abc {
	String name; 		// <<= 컬럼이 정렬 컬럼.  오름 차순 정렬: 가나다라....하 ,  
						// 홍길동, 이순신, 강감찬     ===> 강감찬, 이순신, 홍길동 
	int	age; 			//나이
	Abc (String name, int age){
		this.name = name ; 
		this.age = age; 
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	
}
class Abc_T implements Comparable<Abc_T> {
	String name; 		// <<= 컬럼이 정렬 컬럼.  오름 차순 정렬: 가나다라....하 ,  
						// 홍길동, 이순신, 강감찬     ===> 강감찬, 이순신, 홍길동 
	int	age; 			//나이
	Abc_T (String name, int age){
		this.name = name ; 
		this.age = age; 
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	@Override
	public int compareTo(Abc_T o) {
		//방법1. 
		return (this.name.compareTo(o.name)); 	
		//방법2.
		/*
		if (this.name.charAt(0) < o.name.charAt(0)) {
			return -1; 
		}else if (this.name.charAt(0) == o.name.charAt(0)) {
			return 0;
		}else {
			return 1;
		}
		*/
	}
}

public class EX_TreeSetMothod_3 {

	public static void main(String[] args) {
		
		//1. Comparable<E> 을 사용하는 방법
		TreeSet<Abc_T> treeSet1 = new TreeSet(); 
		Abc_T a1 = new Abc_T("홍길동", 10); 
		Abc_T a2 = new Abc_T("이순신", 50); 
		Abc_T a3 = new Abc_T("강감찬", 30); 
		
		treeSet1.add(a1); 
		treeSet1.add(a2); 
		treeSet1.add(a3); 
		System.out.println(treeSet1);
		System.out.println("===============================");
				
		//2. Comparator<E> 를 사용하는 방법
		TreeSet<Abc> treeSet2 = new TreeSet(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				//방법1. 
				return (o1.name.compareTo(o2.name)); 	
				//방법2.
				/*
				if (this.name.charAt(0) < o.name.charAt(0)) {
					return -1; 
				}else if (this.name.charAt(0) == o.name.charAt(0)) {
					return 0;
				}else {
					return 1;
				}
				*/
			}
		}); 
		
		Abc a4 = new Abc("홍길동", 10); 
		Abc a5 = new Abc("이순신", 50); 
		Abc a6 = new Abc("강감찬", 30); 
		
		treeSet2.add(a4); 
		treeSet2.add(a5); 
		treeSet2.add(a6); 
		System.out.println(treeSet2);
			
	}

}
