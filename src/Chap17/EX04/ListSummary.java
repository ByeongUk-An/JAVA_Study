package Chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {

		// 1. ArrayList

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("다");
		arrayList.add("마");
		arrayList.add("바");
		arrayList.add("사");
		System.out.println(arrayList);

		// 2. Vector

		List<String> vector = new Vector<String>();
		vector.add("다");
		vector.add("마");
		vector.add("바");
		vector.add("사");
		System.out.println(vector);

		// 3. LinkedList

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("다");
		linkedList.add("마");
		linkedList.add("바");
		linkedList.add("사");
		System.out.println(linkedList);

	}

}
