package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs LinkedList
// ArrayList : ���� ���ؼ� index ���� ������ �ִ�. �˻� �ӵ��� ������.
		//���� : �߰����� ���� �߰�/���� �� ���ϰ� ������ ���� �ɸ���.
// LinkedList : ������ ���� �յ��� ������� ������ �ִ�. �˻��ÿ� index ��ȣ�� �Ҵ�ȴ�. �˻��� ArrayList�� ���ؼ� ������.
		//���� : �߰��� ���� �߰�/���� �� ���ϰ� �ɸ��� �ʴ´�.


public class ArrayList_LinkedList {
	public static void main(String[] args) {
		
		//1. �����͸� �߰��ð� ��.
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();
		long startTime = 0, endTime = 0;
		
		//1-1 Array List���� ������ �߰��ð�
		startTime = System.nanoTime();	//System.nanoTime() : 
		for(int i = 0; i < 100000; i++) {
			aList.add(0,i);	// 0 ��° �濡 ��� �ؼ� 10����° ���� , ��� �ڷ� �и��鼭 ���� �߰��ȴ�.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �߰� �ð� " + (endTime-startTime) + "ns");
		//441271300ns
		
		//1-2 LinkedList���� ������ �߰� �ð� : ArrayList ���� ������.
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			linkedlist.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ �߰� �ð� " + (endTime-startTime) + "ns");
		//5940100ns : 250�� ���� ������.
		
		System.out.println("========================");
		
		//2. �˻��� ��. : Array List�� LinkedList���� ������.
		//2-1 ArrayList �˻� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� �˻� �ð� " + (endTime-startTime) + "ns"); //1750500ns
		
		System.out.println("========================");
		
		
		//2-1 LinkedList �˻� �ð�
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� �˻� �ð� " + (endTime-startTime) + "ns"); //4584093700ns
		
		//3. ������ ������ ���� �ð� ��. : LinkedList �� �ξ� ������.
		//3-1 ArrayList
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� �˻� �ð� " + (endTime-startTime) + "ns"); //3373700ns
		//3-2 LinkedList
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			linkedlist.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� �˻� �ð� " + (endTime-startTime) + "ns"); 
		
	}

}
