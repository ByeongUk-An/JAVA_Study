package Chap06_07.EX01;


class Aaa {
	String name;	//�ʵ� : ��üȭ ���Ѿ� ��� ����, Ŭ���� ������� ����
	int age;		//�ʵ��� ������ Heap ������ ����, Heap ������ ������ ������ ���� �ʱ�ȭ
	String email;	//�ʵ�� ���� �ǰ� ���� �Ҵ��� ���� �ʴ� ��� : 
	double weight;				// �������� : Null, int : 0, double : 0.0, boolean : false
	boolean man;
	public String getName() {  	//�޼ҵ�
		return name;
	}
	public void setName(String na) {  //��ǲ�Ǵ� ����, �޴� �����̸�, �޸� �̸��� ��� ������ ���� this�� ������Ѵ�.
		name = na;				// �޸� �̸��� this : �ڽ��� Ŭ������ ����
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
}



public class CreateObject_02 {
	public static void main(String[] args) {
		Aaa aaa = new Aaa();  //��ü ���� (aaa)
		
		//�ʵ��� �ʱ� ���� ��� (Heap ������ ���� �ʱ�ȭ)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		System.out.println("======================");
		
		//������ ���� ���� ���� [Heap] , ���Ȼ� �޸𸮿� ���� ���� �Ҵ������ʴ´�. ĸ��ȭ
		aaa.name = "������";
		aaa.age = 25;
		aaa.weight = 48;
		aaa.man = true;
		aaa.email = "wjddms@naver.com";
		
		//������ �� ���
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		
		//setter �޼ҵ带 ���ؼ� ���� ���� , �޸𸮿� ���� ������ ��� �� �� �ִ�.
			//���������ϴ� ���� (1�� ~ 12��)
		aaa.setName("�Ⱥ���");
		aaa.setAge(30);
		aaa.setEmail("quddnr2@naver.com");
		aaa.setMan(true);
		aaa.setWeight(101.9);
		
		//getter �޼ҵ带 ���ؼ� �޸��� ���� ���
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.isMan());  //boolean Ÿ���� get���� �����ϴ°� �ƴ϶� is�� �����ϴ°� �����̴�.
		System.out.println(aaa.getWeight());
		
		//�ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���.
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
		
	}

}
