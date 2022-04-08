package Chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է½� �̸��� ���� �������� ����ϵ��� �����϶�. TreSet�� name �÷��� ������������ ����
// 1. Comparable<E> �� compartTo() �޼ҵ� ������ 
		//������ ��ü ������ �ʿ�
// 2. Comparator<E> �� cpmpare() ���� 
		//������ ��ü�� �������� ���� 

//�Ϸ� �ð� : 11: 20�б���, p.jangwoo@gmail.com , ����Կ��Ե� ����


class Abc {
	String name; 		// <<= �÷��� ���� �÷�.  ���� ���� ����: �����ٶ�....�� ,  
						// ȫ�浿, �̼���, ������     ===> ������, �̼���, ȫ�浿 
	int	age; 			//����
	Abc (String name, int age){
		this.name = name ; 
		this.age = age; 
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	
}
class Abc_T implements Comparable<Abc_T> {
	String name; 		// <<= �÷��� ���� �÷�.  ���� ���� ����: �����ٶ�....�� ,  
						// ȫ�浿, �̼���, ������     ===> ������, �̼���, ȫ�浿 
	int	age; 			//����
	Abc_T (String name, int age){
		this.name = name ; 
		this.age = age; 
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	@Override
	public int compareTo(Abc_T o) {
		//���1. 
		return (this.name.compareTo(o.name)); 	
		//���2.
		/*
		if (this.name.charAt(0) < o.name.charAt(0)) {
			return -1; 
		}else if (this.name.charAt(0) == o.name.charAt(0)) {
			return 0;
		}else {
			return 1;
		}
		*/
	}
}

public class EX_TreeSetMothod_3 {

	public static void main(String[] args) {
		
		//1. Comparable<E> �� ����ϴ� ���
		TreeSet<Abc_T> treeSet1 = new TreeSet(); 
		Abc_T a1 = new Abc_T("ȫ�浿", 10); 
		Abc_T a2 = new Abc_T("�̼���", 50); 
		Abc_T a3 = new Abc_T("������", 30); 
		
		treeSet1.add(a1); 
		treeSet1.add(a2); 
		treeSet1.add(a3); 
		System.out.println(treeSet1);
		System.out.println("===============================");
				
		//2. Comparator<E> �� ����ϴ� ���
		TreeSet<Abc> treeSet2 = new TreeSet(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				//���1. 
				return (o1.name.compareTo(o2.name)); 	
				//���2.
				/*
				if (this.name.charAt(0) < o.name.charAt(0)) {
					return -1; 
				}else if (this.name.charAt(0) == o.name.charAt(0)) {
					return 0;
				}else {
					return 1;
				}
				*/
			}
		}); 
		
		Abc a4 = new Abc("ȫ�浿", 10); 
		Abc a5 = new Abc("�̼���", 50); 
		Abc a6 = new Abc("������", 30); 
		
		treeSet2.add(a4); 
		treeSet2.add(a5); 
		treeSet2.add(a6); 
		System.out.println(treeSet2);
			
	}

}
