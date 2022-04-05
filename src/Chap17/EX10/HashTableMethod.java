package Chap17.EX10;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//Map<K,V> : K <= Key, V <= Value �������� �����͸� ����.
	//Key�� �ߺ� �� �� ����. <== Set���� ����.		index�� �ƴϴ�. index�� 0���� �Ҵ�, JVM�� �Ҵ��Ѵ�.
	//Value�� �ߺ��� ���� ������ �ִ�.

	//HashTable : ����� �����ϰ� ���.
	//HashTable : ��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 �����ϴ�.
					//��� �޼ҵ�� HashTable �� ����

public class HashTableMethod {

	public static void main(String[] args) {
		
		Map<Integer,String> hTable1 = new Hashtable<> ();
		
		//1. put(K key, V value) : ���� ������.
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");
		//hTable1.put(3, "������");  //Ű�� �ߺ��ؼ� ���� �� �� ����. ����Ű�� ���� ������� ���� ���� ������ �ȴ�.
		
		System.out.println(hTable1);
		
		//2. puaAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���.
		Map<Integer, String> hTable2 = new Hashtable();
		hTable2.putAll(hTable1);
		System.out.println(hTable2);
		
		//3. replace(K key, V value) : key�� ����� value�� ���� ����
		hTable2.replace(1, "��������");
		hTable2.replace(4, "�����"); //key 4�� �������� �ʴµ� ������ ���� �ʰ� �۵��� ���� �ʴ´�.
		System.out.println(hTable2);
		
		//4. replace(K key, V oldvalue, V newvalue) : oldvalue�� newvalue�� ����
		hTable2.replace(1, "��������", "�����");
		hTable2.replace(2, "��������", "�����"); //���۾ȵ�.. <== key��value�� ��Ȯ�� ��ġ�ؾ� ������.
		System.out.println(hTable2);
		
		//5. get(Object key) : Map�� ���� �����Ë�. Key�� �־���� Key�� �Ҵ�� Value�� ���.
		System.out.println(hTable2.get(1)); //���� 1 index�� �ƴ϶� key�̴�.
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		//6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true false
		System.out.println(hTable2.containsKey(2));//true
		System.out.println(hTable2.containsKey(7));//false
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true false
		System.out.println(hTable2.containsValue("�����"));
		
		//8. Set<K> keySet() : Ű�� ����
		Set<Integer> keySet = hTable2.keySet();  //hTable2�� ����� keySet�� ����
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� ��Ʈ
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		//10. size(); �� ����
		System.out.println(hTable2.size());
		
		//11. remove(Object key) // Ű�� �־ value�� ����.
		hTable2.remove(1); // 1������
		hTable2.remove(4); //�������� ����.
		
		System.out.println(hTable2);
		
		//12. remove(Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ �Ҷ� ����.
		hTable2.remove(2,"���ٶ�"); // ����
		hTable2.remove(3,"�ٶ��"); //�������� ����!! key�� value�� ��Ȯ�ϰ� ��ġ�ؾ��Ѵ�.
		System.out.println(hTable2);
		
		//13. clar() : ��� ����
		hTable2.clear(); //����
		System.out.println(hTable2);
		
		
		
		
		
		
		
		
		
		
	}

}
