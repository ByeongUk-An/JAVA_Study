package Chap17.EX08treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet : 출력시 정렬되어서 출력. (오름차순 정렬(ascending) : 1  --> 9, a --> z, 가 --> 하)
// 출력시 검색의 메소드가 지원.
// 임의의 값을 넣으면 Set에 정렬되어서 저장, 출력시에 오름차순으로 정렬되어서 출력.
// Set <= SortedSet(정렬 메소드정의) <= NavigableSet(검색 메소드 정의) <= TreeSet
// TreeSet<String> treeSet = new TreeSet<String>(); 타입을 TreeSet으로 지정해야 정렬 및 검색기능을 사용.
// Set 인터페이스의 모든 메소드 사용. 추가적으로 정렬 메소드 / 검색 메소드를 사용가능

public class TreeSetMethod {
	public static void main(String[] args) {
		// TreeSet 에 값을 넣었을 경우 오름차순 정렬되어 값이 Set에 저장, 출력시 오름차순 정렬로 출력.
		TreeSet<Integer> treeSet = new TreeSet();
		for (int i = 50; i > 0; i -= 2) { //50,48,46,44,42,40....... 4,2
			treeSet.add(i);  // 내부적으로 임의의 값을 넣을때 오름차순으로 정렬되어 값이 저장.
			
		}
		System.out.println(treeSet);
		
		//TreeSet에서만 사용 가능한 메소드 (1. ~ 15)
		
		System.out.println("============데이터 검색 (가져오기)==============");
		//1. first() : 제일 처음값을 리턴
		System.out.println(treeSet.first());
		//2. last() : 제일 마지막값을 리턴
		System.out.println(treeSet.last());  //50
		//3. lower(E element) : 엘리먼트보다 작은 값 26보다 작은 값은 24 이다.
		System.out.println(treeSet.lower(26));
		//4. higher(E element) : 엘리먼트보다 큰 값을 출력 28 출력
		System.out.println(treeSet.higher(26));
		//5. floor (E elemeent) : element를 포함해서 작은 값을 출력
		System.out.println(treeSet.floor(25));  // 24
		System.out.println(treeSet.floor(26));  // 26
		//6. ceilling(E elemenet) : element를 포함해서 큰 값을 출력
		System.out.println(treeSet.ceiling(27));
		System.out.println(treeSet.ceiling(28));
		
		
		System.out.println("===========데이터 꺼내기 ==============");
		//7. pollFirst() : 제일 값을 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println();
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());  //25번 루프돌면서 첫번째 값만 꺼내와서 출력.
		}
		System.out.println();
		System.out.println(treeSet.size()); //0  , treeSet의 값이 비어있는 상태
		
		//8.pollLast() : 제일 마지막값 꺼내오기
		for (int i = 50; i> 0; i-=2) {
			treeSet.add(i);  // 오름차순으로 정렬되어서 저장.
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println(treeSet);
		
		for (int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast());
		}
		System.out.println(treeSet.size());  //0
		System.out.println("=============정렬===============");
		//9. SortedSet<E> headSet(E element) : 정렬을 사용하기 위해서 SortedSet<E> 타입으로 리턴
			//SortedSet<E> : 정렬된 데이터를 저장하는 Set.
				//headSet(E element) : element의 Head 쪽으로의 값을 저장. <element 값은 미포함>
		for (int i = 50; i > 0; i-=2) {
			treeSet.add(i);  //오름차순으로 정렬되어서 treeSet에 저장.
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20); // headSet(20) 은 SortedSet으로 리턴값을 돌려줌.
		//Set<Integer> sSet = treeSet.headSet(20);
		System.out.println(sSet);
		
		//10. NavigableSet<E> headSet(E element, boolean inclusive) : element를 포함(true), 미포함(false)gotj head쪽으로 출력
		NavigableSet<Integer> nSSet = treeSet.headSet(20,true);
		//Set<Integer> nSet = treeSet.headSet(20,true);
		System.out.println(nSSet);
		
		//11. SortedSet<E> tailSet(Element)
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); //시작값은 포함이 기본, 끝깞을 미포함이 기본 <<== <<<모든 언어에서 동일한 내용>>>
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet(E element, boolean inclusive) : element를 포함(true), 미포함(false)해서 tail쪽으로 출력
		NavigableSet nSet2 = treeSet.tailSet(20, false);
		//Set nSet2 = treeSet.tailSet(20,true);
		System.out.println(nSet2);
		System.out.println("================특정범위의 값가져오기 subSet()==================");
		
		//13. SortedSet<EE> subSet(E element, E element); 특정 범위의 값을 set으로 담을때.
		SortedSet sSet3 = treeSet.subSet(10, 20);  //10과 20사이의 범위의 값
		System.out.println(sSet3); //20,22
		//14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, false);
		System.out.println(nSet4);
		
		System.out.println("==============반대로 정렬하기 descendingSet()==================");
		
		//15. NavigableSet<E> descendingSet() : 현재 정렬을 기준으로 반대로 정렬한다. 원래뜻 : descending <내림차순 정렬>
		System.out.println(treeSet); //오름차순 정렬
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet(); //내림차순 정렬
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet(); //내림차순 정렬을 오름차순으로 변경
		System.out.println(descendingSet2);
	}

}
