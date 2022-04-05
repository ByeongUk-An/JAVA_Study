package Chap17.EX09Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map<K,V> : K <= Key, V <= Value 형식으로 데이터를 저장.
	//Key는 중복 될 수 없다. <== Set으로 관리.		index가 아니다. index는 0부터 할당, JVM이 할당한다.
	//Value는 중복된 값을 넣을수 있다.

	//HashMap : 출력이 랜덤하게 출력.

public class HashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer,String> hMap1 = new HashMap<> ();
		
		//1. put(K key, V value) : 값을 넣을때.
		hMap1.put(2, "나다라");
		hMap1.put(1, "가나다");
		hMap1.put(3, "다라마");
		//hMap1.put(3, "가가가");  //키를 중복해서 저장 될 수 없다. 동일키로 값을 넣을경우 기존 값이 수정이 된다.
		
		System.out.println(hMap1);
		
		//2. puaAll(다른맵객체) : 다른 맵을 복사해서 사용.
		Map<Integer, String> hMap2 = new HashMap();
		hMap2.putAll(hMap1);
		System.out.println(hMap2);
		
		//3. replace(K key, V value) : key의 저장된 value의 값을 수정
		hMap2.replace(1, "나나나나");
		hMap2.replace(4, "라라라라"); //key 4는 존재하지 않는데 오류는 뜨지 않고 작동이 되지 않는다.
		System.out.println(hMap2);
		
		//4. replace(K key, V oldvalue, V newvalue) : oldvalue를 newvalue로 수정
		hMap2.replace(1, "나나나나", "라라라라");
		hMap2.replace(2, "나나나나", "라라라라"); //동작안됨.. <== key와value가 정확히 일치해야 수정됨.
		System.out.println(hMap2);
		
		//5. get(Object key) : Map의 값을 가져올떄. Key를 넣어줘야 Key에 할당된 Value를 출력.
		System.out.println(hMap2.get(1)); //주의 1 index가 아니라 key이다.
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		//6. containsKey(Object key) : 맵에 해당 키가 존재하는지 확인, true false
		System.out.println(hMap2.containsKey(2));//true
		System.out.println(hMap2.containsKey(7));//false
		
		//7. containsValue(Object value) : 맵에 해당 값이 존재하는지 확인, true false
		System.out.println(hMap2.containsValue("라라라라"));
		
		//8. Set<K> keySet() : 키만 추출
		Set<Integer> keySet = hMap2.keySet();  //hMap2의 저장된 keySet을 추출
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>> entrySet() : 키와 값의 세트
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); 총 갯수
		System.out.println(hMap2.size());
		
		//11. remove(Object key) // 키를 넣어서 value를 삭제.
		hMap2.remove(1); // 1번삭제
		hMap2.remove(4); //동작하지 않음.
		
		System.out.println(hMap2);
		
		//12. remove(Object key, Object value) : key와 value가 정확하게 일치 할때 삭제.
		hMap2.remove(2,"나다라"); // 삭제
		hMap2.remove(3,"다라다"); //동작하지 않음!! key와 value가 정확하게 일치해야한다.
		System.out.println(hMap2);
		
		//13. clar() : 모두 삭제
		hMap2.clear(); //삭제
		System.out.println(hMap2);
		
		
		
		
		
		
		
		
		
		
	}

}
