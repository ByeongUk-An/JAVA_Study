package Chap10.Ex07.Ex04;

class AA {
	String name;
	AA(String name) {
		this.name = name;
	}
}

class BB {
	String name;
	BB(String name) {
		this.name = name;
	}
	@Override
	public String toString() { //��Ű����.Ŭ������@�ؽ��ڵ� : �⺻���  // name�� �ʵ尪�� ���
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == (A)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}

public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String("�ȳ�");
		String s2 = "�ȳ�";
		
		System.out.println(s1);// String Ŭ������ toString() ������ �Ǿ��ִ�.
		System.out.println(s1.equals(s2));  // String Ŭ������ equals() ������ �Ǿ��ִ�.
			// ���� ���ϵ��� ������
		
		AA aa1 = new AA("�ȳ�");
		AA aa2 = new AA("�ȳ�");
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2)); //��ü �ּҸ� ���ϱ⋚���� false
		
		BB bb1 = new BB("�ȳ�");
		BB bb2 = new BB("�ȳ�");
		
		System.out.println(bb1);
	}

}