package Chap17.EX11;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Map<> : Key�� �ߺ����� �ʴ´�. <== Set���� �����ȴ�.
//HashMap vs LinkedHashMap
	//HashMap<K,V> : �Է°� ����� �ٸ��� �ִ�. ����� �����ϰ� ���
	//LinkedHashMap<K,V> : Key�� ��ũ �Ǿ� �ִ�. �F�� ���� ���� ���� ������ ������.
		//�Է� ������� ����� �˴ϴ�.

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer,String> lhMap1 = new LinkedHashMap<> ();
		
		//1. put(K key, V value) : ���� ������.
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "������");
		lhMap1.put(3, "�ٶ�");
		//lhMap.put(3, "������");  //Ű�� �ߺ��ؼ� ���� �� �� ����. ����Ű�� ���� ������� ���� ���� ������ �ȴ�.
		
		System.out.println(lhMap1);
		
		//2. puaAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> lhMap2 = new LinkedHashMap();
		lhMap2.putAll(lhMap2);
		System.out.println(lhMap2);
		
		//3. replace(K key, V value) : key�� ����� value�� ���� ����
		lhMap2.replace(1, "��������");
		lhMap2.replace(4, "�����"); //key 4�� �������� �ʴµ� ������ ���� �ʰ� �۵��� ���� �ʴ´�.
		System.out.println(lhMap2);
		
		//4. replace(K key, V oldvalue, V newvalue) : oldvalue�� newvalue�� ����
		lhMap2.replace(1, "��������", "�����");
		lhMap2.replace(2, "��������", "�����"); //���۾ȵ�.. <== key��value�� ��Ȯ�� ��ġ�ؾ� ������.
		System.out.println(lhMap2);
		
		//5. get(Object key) : Map�� ���� �����Ë�. Key�� �־���� Key�� �Ҵ�� Value�� ���.
		System.out.println(lhMap2.get(1)); //���� 1 index�� �ƴ϶� key�̴�.
		System.out.println(lhMap2.get(2));
		System.out.println(lhMap2.get(3));
		
		//6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true false
		System.out.println(lhMap2.containsKey(2));//true
		System.out.println(lhMap2.containsKey(7));//false
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true false
		System.out.println(lhMap2.containsValue("�����"));
		
		//8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = lhMap2.keySet();  //lhMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� ��Ʈ
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); �� ����
		System.out.println(lhMap2.size());
		
		//11. remove(Object key) // Ű�� �־ value�� ����.
		lhMap2.remove(1); // 1������
		lhMap2.remove(4); //�������� ����.
		
		System.out.println(lhMap2);
		
		//12. remove(Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ �Ҷ� ����.
		lhMap2.remove(2,"���ٶ�"); // ����
		lhMap2.remove(3,"�ٶ��"); //�������� ����!! key�� value�� ��Ȯ�ϰ� ��ġ�ؾ��Ѵ�.
		System.out.println(lhMap2);
		
		//13. clar() : ��� ����
		lhMap2.clear(); //����
		System.out.println(lhMap2);
		
		
		
		
		
		
		
		
		
		
	}

}
