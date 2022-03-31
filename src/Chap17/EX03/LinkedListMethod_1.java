package Chap17.EX03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

//LinkedList : ArrayList �� ���� �ϰ� ���.
	//LinkedList �� ��� �޼��尡 ����ȭ ó���� �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 ���ǵ��� �Ǿ��ִ�.
		
//�̱� ������ ȯ�� : ArrayList
//��Ƽ ������ ȯ�� : LinkedList

public class LinkedListMethod_1 {

	public static void main(String[] args) {
		// List�� �޼ҵ� : 13�� ������ �޼ҵ�,
		// 1. ArrayList
		// 2. LinkedList
		// 3. LinkedList

		List<Integer> linked1 = new LinkedList<Integer>();

		// 1. add(E element) : ������ ���� ���� �߰��ϱ�.
		linked1.add(3);
		linked1.add(6);
		linked1.add(9);
		System.out.println(linked1); // �����
		System.out.println(linked1.size()); // ���� ����

		// 2. add (int index, E element)
		linked1.add(1, 19); // ���ȣ 1���� 19�� �߰�, ���� 1�� �ε����� �ڷ� �з�����.
		System.out.println(linked1);

		// 3. addAll (�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer> linked2 = new LinkedList<Integer>();
		linked2.add(3);
		linked2.add(2);
		linked2.add(4);
		linked2.add(4);

		linked2.addAll(linked2); // aList1�� ���� �� ���� �����ؼ� aList2�� ���濡 �ٿ��ִ´�.
		System.out.println(linked2);

		// 4. addAll(int index, �� �ٸ� ��ü)
		List<Integer> linked3 = new LinkedList();
		linked3.add(1);
		linked3.add(2);

		linked3.addAll(1, linked3); // �ڽ��� ���� �߰� �ٸ� ��ü�� �߰�
		System.out.println(linked3);

		// 5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		linked3.set(1, 5); // 1�� ���ȣ�� ���� 5�� ����
		linked3.set(3, 6);
		// aList3.set(4, 7); //���� �߻�, IndxeOutOfBoundsException
		System.out.println(linked3);
		// 6. remove(int index) : Ư�� ���ȣ�� ���� ����
		linked3.remove(1); // ���ȣ 1�� �濡 �ִ� ���� ����
		System.out.println(linked3);

		// 7. remove(Object o) : ���� ����
		linked3.remove(new Integer(6)); // ������ ������ �� ����. Integer�� ǥ�õ� ���� ����ǥ�ð� �ƴ϶� ���� �� ������ �����ǰų� ����� �� ������ �˸�
		System.out.println(linked3);

		// 8. clear() : ��� ����
		linked3.clear();
		System.out.println(linked3);
		System.out.println("============");

		// 9. isEmpty() : ���� ��� ������ True, ������� ������ False
		System.out.println(linked3.isEmpty());

		// 10. size() : ���� ����, ���� ����
		System.out.println(linked3.size());
		linked3.add(1);
		linked3.add(2);
		linked3.add(3);
		System.out.println(linked3.size());
		System.out.println("================");

		// 11. get(int index) : �� ��ȣ�� ���� ���
		System.out.println(linked3.get(0));
		System.out.println(linked3.get(1));
		System.out.println(linked3.get(2));
		
		System.out.println("==========================");
		
		System.out.println(linked3);  //List �ϋ� ��ü�� ��� �ϸ� ��ü�� ���� �����.
		
		//12. toArray() : List (����Ʈ) ----> Array (�迭)�� ��ȯ
		Object[] object = linked3.toArray();
		System.out.println(object);  //�⺻������ toArray()�޼ҵ�� Object Ÿ������ ������ �ȴ�.
			//�ٿ� ĳ������ �ʿ��ϴ�.
		System.out.println(Arrays.toString(object));	//�迭�϶��� Arrays.toString() ���.
		
		System.out.println("=========================");
		
		//13-1 toArray(T[] t)  ====> t[] : Integer�� �ٷ� ĳ����
		Integer[] integer1 = linked3.toArray(new Integer[0]); 
			//0�� �ǹ� : ����Ʈ�� ����� ������ ������� ����Ʈ�� ����� ���� ������ �´�.
		System.out.println(Arrays.toString(integer1));
		
		//13-2 toArray(T[] t)  ====> t[] : Integer�� �ٷ� ĳ����
		Integer[] integer2 = linked3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
