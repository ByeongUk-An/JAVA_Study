package Chap17.EX06Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set<E> : 인터페이스, 방번호(index)가 없다. 중복된 값을 넣을 수 없다.
// - HashSet : 중복된 값을 넣을 수 없다. 갑을 꺼내면 순서대로 꺼내지지 않는다.
// - LinkedHashSet : 중복된 값을 넣을 수 없다. 출력시 순서대로 출력.
// - TreeSet : 저장될때 값이 정렬이 되어서 저장. ascending (오름 차순 정렬되어 저장) 0 -> 9, a->z 가 -> 하
// 참고 : descending (내림차순 정렬) : 9 -> 0, z -> a, 하 -> 가

public class HashSetMethod {

	public static void main(String[] args) {

		Set<String> hSet1 = new HashSet(); // Set은 Interface 이므로 타입으로만 지정
		// 1. add(E element) : Set에 값을 추가, 바구니에 집어넣는다는 느낌(방번호가 없음)
		hSet1.add("가"); // "가"를 중복 저장 안됨.
		hSet1.add("나");
		hSet1.add("가");
		hSet1.add("라");
		System.out.println(hSet1);
		System.out.println(hSet1.toString()); // toString 메소드가 재정의 되어 있다.

		// 2. addAll (다른 set 객체) : 자신의 Set에 다른 Set에 저장된 값을 추가 : 중복된 값은 제거
		Set<String> hSet2 = new HashSet();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);

		// 3. remove (Object o) : 값으로 삭제, (List인 경우 방번호로 삭제)
		hSet2.remove("나");
		System.out.println(hSet2);

		// 4. clear() : 모두 삭제
		hSet2.clear();
		System.out.println(hSet2);

		// 5. isEmpty : 값이 비어있으면 true, 비어있지 않으면 false
		System.out.println(hSet2.isEmpty());

		// 6. contains(Object o) : 값이 Set에 존재하면 True, 값이 없으면 false
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("나")); // true
		System.out.println(hSet3.contains("라")); // false

		// 7. size() : Set에 포함된 값의 갯수
		System.out.println(hSet3.size());

		// 8. iterator() : Set 은 index를 가지지 않는다. for문은 방번호로 값을 출력, enhanced for문은 사용 가능,
		// 순회자, Set의 값들을 순회하면서 출력.
		// hasNext() : Set의 값이 존재하면 true, 존재하지않으면 false
		// next() : 값을 출력하고 다음값으로 이동
		System.out.println("===========iterator()를 사용한 출력.==============");

		Iterator<String> iterator = hSet3.iterator();
		// 클래스<E> 참조객체 = Set객체.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();

		System.out.println("============Enhancd for문을 사용해서 출력==============");

		for (String k : hSet3) {
			System.out.print(k);
		}
		System.out.println();

		// 9. toArray() : Set의 값들을 배열로 보낸다. Object 타입으로 리턴, 다운 캐스팅이 필요함.
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray)); //
		for (int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i]);
		}
		System.out.println();
		System.out.println("========================");
		for(Object k : objArray) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		//10. toArray(T[] t) : 바로 다운 캐스팅을 한후 출력
		String[] strArray1 = hSet3.toArray(new String[0]); // 0 : 방의 크기를 지정 합니다.
														   // 방의 크기가 실제보다 작을 경우 컴파일러가 방의크기만큼 지정해준다.
		System.out.println(Arrays.toString(strArray1));
		
		//11. 실제 Set의 값보다 방의 크기를 크게 했을 경우는 Null이 들어 갈 수 있다.
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
		Set<Integer> intSet1 = new HashSet();
		
		intSet1.add(30);
		intSet1.add(100);
		intSet1.add(32);
		intSet1.add(3123);
		
		
		Iterator<Integer> iterator1 = intSet1.iterator();
		// 클래스<E> 참조객체 = Set객체.iterator();
		System.out.println("================ iterator ==================");
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}
		System.out.println();

		System.out.println("============Enhancd for문을 사용해서 출력==============");

		for (Integer k : intSet1 ) {
			System.out.print(k + " ");
		}
		System.out.println();

	
	}

}
