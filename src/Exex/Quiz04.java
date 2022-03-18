package Exex;
class E extends Object { //�ڹ��� ��� Ŭ������ Object �� �ڽ� Ŭ�����̴�.
   String name;
   E () {};      // �⺻ ������ : class �� �ٸ� �����ڰ� �����ϰ� �ܺο��� �⺻ �����ڸ� ȣ���� �� �����Ǹ� �ȵ�
   E (String name) {
      this.name = name;      // �Ű����� �̸�, �����ο��� �Ű������� �޴� ������, �ʵ��� �������� ������ ��� this(�ڽ��� ��ü) �ʼ�
   }
   //this : �ڽ��� ��ü
   @Override
	public String toString() { //��ü ��ü�� ��½� toString()�� ȣ��
		return "�̸� :" + name; // this.name ,
	}
   @Override
	public boolean equals(Object obj) { // e2.equals(e3);
	   if(this.name.equals(((E)obj).name)) {
		   return true;
	   }else {
		   return false;
	   }
	}
}

class Students {
   int studentID;
   String name;
   int kor;
   int eng;
   
   Students(int studentID, String name, int kor, int eng) {
      this.studentID = studentID;
      this.name = name;
      this.kor = kor;
      this.eng = eng;
   }
   
   @Override
   public boolean equals(Object obj) {
      if (this.studentID == ((Students)obj).studentID) {
         return true;
      } else {
         return false;
      }
   }
   
   // studentID�� ���� ��� "���� �л��̴�"��� ���
   // ��ü�� studentID �÷��� ���ؼ� ���� ��� "���� �л��̴�."��� ���
   
   // == : �⺻ Ÿ�� => boolean, byte, short, int, long, double, float, char
      // => ��(�� �ּ�)�� ��
      // => ���� Ÿ�� �� : ��ü�� �ּҸ� �� (�迭, ��ü, String(***))
         // => String : toString()�� �⺻������ �����ǵǾ�����. equals()�� �����ǵǾ�����
      // object�� toString() : ���� ��ü ��ü�� print�� ��� �ּ�(package �̸�.class �̸�@hashCode)�� ��� => toString()�� ��� overriding�ؼ� ��ü�� �ʵ尪 ��� 
      // object�� equals() : ���� == �� ����. ��ü�� �ּҸ� �� => ������ �� ��ü ���� Ư�� �ʵ��� ���� ��
}

public class Quiz04 {

   public static void main(String[] args) {
      Students student01 = new Students(20220317, "ȫ�浿", 95, 90);
      Students student02 = new Students(20220310, "����", 80, 85);
      Students student03 = new Students(20220310, "����", 91, 80);
      Students student04 = new Students(20220317, "ö��", 90, 95);
      
      // StudentID�� ���� ���, ���� �л��̴ٶ�� ���
      
      if (student01.equals(student04)) {
         System.out.println("���� �л��̴�.");
      } else {
         System.out.println("�ٸ� �л��̴�.");
      }
      
      E e1 = new E();		// �⺻ ������ ȣ�� : Heap �� �ʵ��� ���� ���� �ʱ�ȭ ��
      System.out.println(e1.name);  //null
      
      E e2 = new E("�����");
      System.out.println(e2.name);
      
      E e3 = new E("�����");
      System.out.println(e1 == e2);  //���� Ÿ�� (==) : ��ü�� �ּҸ� ��
      System.out.println(e2);
      System.out.println(e3);
      System.out.println(e2.equals(e3));  //Object�� equals() �� (==)�� ����.   => ��ü�� �ּҸ� ��
      // Object�� toString(), equals() �׳� ���°�찡 ���� �������ؼ� ����.
     
      
   }

}