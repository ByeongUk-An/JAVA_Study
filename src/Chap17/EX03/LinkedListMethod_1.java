package Chap17.EX03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

//LinkedList : ArrayList 와 동일 하게 사용.
	//LinkedList 는 모든 메서드가 동기화 처리가 되어 있다. 멀티쓰레드 환경에 사용되도록 되어있다.
		
//싱글 쓰레드 환경 : ArrayList
//멀티 쓰레드 환경 : LinkedList

public class LinkedListMethod_1 {

	public static void main(String[] args) {
		// List의 메소드 : 13개 정도의 메소드,
		// 1. ArrayList
		// 2. LinkedList
		// 3. LinkedList

		List<Integer> linked1 = new LinkedList<Integer>();

		// 1. add(E element) : 마지막 값에 값을 추가하기.
		linked1.add(3);
		linked1.add(6);
		linked1.add(9);
		System.out.println(linked1); // 값출력
		System.out.println(linked1.size()); // 값의 갯수

		// 2. add (int index, E element)
		linked1.add(1, 19); // 방번호 1번에 19를 추가, 기존 1번 인덱스는 뒤로 밀려난다.
		System.out.println(linked1);

		// 3. addAll (또다른 리스트의 객체를 복사해서 추가)
		List<Integer> linked2 = new LinkedList<Integer>();
		linked2.add(3);
		linked2.add(2);
		linked2.add(4);
		linked2.add(4);

		linked2.addAll(linked2); // aList1에 저장 된 값을 복사해서 aList2의 끝방에 붙여넣는다.
		System.out.println(linked2);

		// 4. addAll(int index, 또 다른 객체)
		List<Integer> linked3 = new LinkedList();
		linked3.add(1);
		linked3.add(2);

		linked3.addAll(1, linked3); // 자신의 값에 추가 다른 객체를 추가
		System.out.println(linked3);

		// 5. set(int index, E element) : 특정 방번호의 값을 수정
		linked3.set(1, 5); // 1번 방번호에 값을 5로 수정
		linked3.set(3, 6);
		// aList3.set(4, 7); //오류 발생, IndxeOutOfBoundsException
		System.out.println(linked3);
		// 6. remove(int index) : 특정 방번호의 값을 삭제
		linked3.remove(1); // 방번호 1번 방에 있는 값을 삭제
		System.out.println(linked3);

		// 7. remove(Object o) : 값을 삭제
		linked3.remove(new Integer(6)); // 값으로 삭제할 수 있음. Integer에 표시된 선은 오류표시가 아니라 추후 이 구문이 삭제되거나 변경될 수 있음을 알림
		System.out.println(linked3);

		// 8. clear() : 모두 삭제
		linked3.clear();
		System.out.println(linked3);
		System.out.println("============");

		// 9. isEmpty() : 값이 비어 있으면 True, 비어있지 않으면 False
		System.out.println(linked3.isEmpty());

		// 10. size() : 방의 개수, 값의 개수
		System.out.println(linked3.size());
		linked3.add(1);
		linked3.add(2);
		linked3.add(3);
		System.out.println(linked3.size());
		System.out.println("================");

		// 11. get(int index) : 방 번호의 값을 출력
		System.out.println(linked3.get(0));
		System.out.println(linked3.get(1));
		System.out.println(linked3.get(2));
		
		System.out.println("==========================");
		
		System.out.println(linked3);  //List 일떄 객체를 출력 하면 객체의 값을 출력함.
		
		//12. toArray() : List (리스트) ----> Array (배열)로 변환
		Object[] object = linked3.toArray();
		System.out.println(object);  //기본적으로 toArray()메소드는 Object 타입으로 리턴이 된다.
			//다운 캐스팅이 필요하다.
		System.out.println(Arrays.toString(object));	//배열일때는 Arrays.toString() 사용.
		
		System.out.println("=========================");
		
		//13-1 toArray(T[] t)  ====> t[] : Integer로 바로 캐스팅
		Integer[] integer1 = linked3.toArray(new Integer[0]); 
			//0의 의미 : 리스트에 저장된 값보다 작을경우 리스트에 저장된 값만 가지고 온다.
		System.out.println(Arrays.toString(integer1));
		
		//13-2 toArray(T[] t)  ====> t[] : Integer로 바로 캐스팅
		Integer[] integer2 = linked3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
