package Chap17.EX12;

import java.util.Comparator;
import java.util.TreeMap;

//TreeMap<K,V>  : Key가 정렬되어서 처리 <오름차순 정렬> 
	//Key : 일반 객체를 사용할 경우, Comparable<E> compareTo(), Comaprator<E> compare() 재정의가 필요. 

//일반 클래스 
class MyClass{
	int data1; 
	int data2; 
	public MyClass(int data1, int data2) {
		this.data1 = data1; 
		this.data2 = data2; 
	}
	@Override
	public String toString() {
		
		return data1 + " 값 출력";
	}
}
//Comparable<E> 인터페이스의 compareTo() 재정의한 클래스 
class MyComparableClass implements Comparable<MyComparableClass> {
	int data1; 
	int data2; 
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1; 
		this.data2 = data2; 
	}
	@Override
	public String toString() {
		
		return data1 + " 값 출력";
	}
	@Override
	public int compareTo(MyComparableClass o) {   //오름 차순 정렬 방식 처리 
		if ( this.data1 < o.data1) {
			return  -1 ; 
		}else if (this.data1== o.data1) {
			return 0; 
		}else {
			return 1;
		}
	}
	
}

public class TreeMapMethod_2 {
	public static void main(String[] args) {

		//1. MyClass 를 TreeMap의 Key로 인풋 할 경우 : 실행시 오류 
		/*
		TreeMap<MyClass, String> treeMap1 = new TreeMap(); 
		
		MyClass m1 = new MyClass(2,5); 
		MyClass m2 = new MyClass(3,3); 
		
		treeMap1.put(m1, "첫번째");      //Comparable,Comparator 구현하지 않았는데, TreeMap의 Key로 사용, 실행시 오류
		treeMap1.put(m2, "두번째"); 
		
		System.out.println(treeMap1);
*/
		
		//2. Comparable 을 구현한 클래스를 사용. <== 객체 수정
		TreeMap<MyComparableClass, String> treeMap2 = new TreeMap(); 
		
		MyComparableClass my1 = new MyComparableClass(2, 5);
		MyComparableClass my3 = new MyComparableClass(10, 5);
		MyComparableClass my2 = new MyComparableClass(3, 3); 
		
		treeMap2.put(my1, "첫번째"); 
		treeMap2.put(my3, "세번째"); 
		treeMap2.put(my2, "두번째"); 
		
		System.out.println(treeMap2);
		System.out.println(treeMap2.size());
	
		//3. Comparator<E>  를 구현 : 기존의 객체를 사용, 객체 수정이 불필요 하다.
		TreeMap<MyClass, String> treeM	= new TreeMap( new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.data1 < o2.data1) {
					return -1; 
				}else if (o1.data1 == o2.data1) {
					return 0; 
				}else {
					return 1; 
				}
			}
		});
		
		MyClass m4 = new MyClass(2,5);
		MyClass m6 = new MyClass(20, 20); 
		MyClass m5 = new MyClass(3,3); 
		
		treeM.put(m4, "첫번째"); 
		treeM.put(m6, "세번째"); 
		treeM.put(m5, "두번째"); 
		
		System.out.println(treeM);
		System.out.println(treeM.size());
		
		
		
		
		
		
		
		
		
		
	}

}
