package Chap17.EX06Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set<E> : �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
// - HashSet : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.
// - LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½� ������� ���.
// - TreeSet : ����ɶ� ���� ������ �Ǿ ����. ascending (���� ���� ���ĵǾ� ����) 0 -> 9, a->z �� -> ��
// ���� : descending (�������� ����) : 9 -> 0, z -> a, �� -> ��

public class HashSetMethod {

	public static void main(String[] args) {

		Set<String> hSet1 = new HashSet(); // Set�� Interface �̹Ƿ� Ÿ�����θ� ����
		// 1. add(E element) : Set�� ���� �߰�, �ٱ��Ͽ� ����ִ´ٴ� ����(���ȣ�� ����)
		hSet1.add("��"); // "��"�� �ߺ� ���� �ȵ�.
		hSet1.add("��");
		hSet1.add("��");
		hSet1.add("��");
		System.out.println(hSet1);
		System.out.println(hSet1.toString()); // toString �޼ҵ尡 ������ �Ǿ� �ִ�.

		// 2. addAll (�ٸ� set ��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� : �ߺ��� ���� ����
		Set<String> hSet2 = new HashSet();
		hSet2.add("��");
		hSet2.add("��");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);

		// 3. remove (Object o) : ������ ����, (List�� ��� ���ȣ�� ����)
		hSet2.remove("��");
		System.out.println(hSet2);

		// 4. clear() : ��� ����
		hSet2.clear();
		System.out.println(hSet2);

		// 5. isEmpty : ���� ��������� true, ������� ������ false
		System.out.println(hSet2.isEmpty());

		// 6. contains(Object o) : ���� Set�� �����ϸ� True, ���� ������ false
		Set<String> hSet3 = new HashSet<String>();
		hSet3.add("��");
		hSet3.add("��");
		hSet3.add("��");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("��")); // true
		System.out.println(hSet3.contains("��")); // false

		// 7. size() : Set�� ���Ե� ���� ����
		System.out.println(hSet3.size());

		// 8. iterator() : Set �� index�� ������ �ʴ´�. for���� ���ȣ�� ���� ���, enhanced for���� ��� ����,
		// ��ȸ��, Set�� ������ ��ȸ�ϸ鼭 ���.
		// hasNext() : Set�� ���� �����ϸ� true, �������������� false
		// next() : ���� ����ϰ� ���������� �̵�
		System.out.println("===========iterator()�� ����� ���.==============");

		Iterator<String> iterator = hSet3.iterator();
		// Ŭ����<E> ������ü = Set��ü.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();

		System.out.println("============Enhancd for���� ����ؼ� ���==============");

		for (String k : hSet3) {
			System.out.print(k);
		}
		System.out.println();

		// 9. toArray() : Set�� ������ �迭�� ������. Object Ÿ������ ����, �ٿ� ĳ������ �ʿ���.
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
		
		//10. toArray(T[] t) : �ٷ� �ٿ� ĳ������ ���� ���
		String[] strArray1 = hSet3.toArray(new String[0]); // 0 : ���� ũ�⸦ ���� �մϴ�.
														   // ���� ũ�Ⱑ �������� ���� ��� �����Ϸ��� ����ũ�⸸ŭ �������ش�.
		System.out.println(Arrays.toString(strArray1));
		
		//11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� Null�� ��� �� �� �ִ�.
		String[] strArray2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));
		
		
		Set<Integer> intSet1 = new HashSet();
		
		intSet1.add(30);
		intSet1.add(100);
		intSet1.add(32);
		intSet1.add(3123);
		
		
		Iterator<Integer> iterator1 = intSet1.iterator();
		// Ŭ����<E> ������ü = Set��ü.iterator();
		System.out.println("================ iterator ==================");
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}
		System.out.println();

		System.out.println("============Enhancd for���� ����ؼ� ���==============");

		for (Integer k : intSet1 ) {
			System.out.print(k + " ");
		}
		System.out.println();

	
	}

}
