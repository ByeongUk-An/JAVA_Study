package Chap17.EX08treeset;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է½� �̸��� ������������ ����ϵ��� ����. TreeSet�� name �÷��� ����
// 1. Comparable<E> �� compareTo() �޼ҵ� ������
	//������ ��ü ������ �ʿ�
// 2. comparator<E> �� compare() ����
	//������ü �������� �ʰ� �͸�ü

class Abc {
	String name;  // << �÷��� ���� �÷�. ���� ���� ����; �����ٶ�....�� , 
			   // ȫ�浿, �̼���, ������  ===> ������, �̼���, ȫ�浿  �̸������� ���
	int age;	   // ����
	
	public Abc(String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	@Override
	public String toString() {
		return  name + "�� ���̴� :" + age + "�Դϴ�.";
	}
}

class Abc_T implements Comparable<Abc_T> {
	String name;
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Abc_T o) {
		return (this.name.compareTo(o.name));
	}
	
	@Override
	public String toString() {
		return name + "�� ���̴� :" + age + "�Դϴ�.";
	}
}

public class Ex_TreeSetMethod_3 {
	public static void main(String[] args) {
		TreeSet<Abc_T> ts1 = new TreeSet();
		
		Abc_T a1 = new Abc_T("ȫ�浿",30);
		Abc_T a2 = new Abc_T("�̼���",17);
		Abc_T a3 = new Abc_T("������",37);
		
		ts1.add(a1);
		ts1.add(a2);
		ts1.add(a3);
		
		System.out.println(ts1);
		System.out.println("=============");
		
		TreeSet<Abc> ts2 = new TreeSet<Abc>(new Comparator<Abc>() {
			@Override
			public int compare(Abc o1, Abc o2) {
				return (o1.name.compareTo(o2.name));
			}
		});
		
		Abc b1 = new Abc("ȫ�浿",29);
		Abc b2 = new Abc("�̼���",21);
		Abc b3 = new Abc("������",19);
		
		ts2.add(b1);
		ts2.add(b2);
		ts2.add(b3);
		
		System.out.println(ts2);
		
	}
}
