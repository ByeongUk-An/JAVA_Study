package Chap13.EX10.EX2;
class Abc {  
	Def d;
	
	Abc() {};
	Abc(Def d) {
		this.d = d;
	}
	
	public void setDef(Def d) {
		this.d = d;
	}
	
	interface Def {
		void run ();
		void fly();
	}
	

	
	
	void ghi() {
		d.run();
		d.fly();
	}
}

public class Innerinterface_1_2 {

	public static void main(String[] args) {
		//1.객체 생성후 필드에 직접 값을 할당 (d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def) new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d1달려라");
			}
			
			@Override
			public void fly() {
				System.out.println("d1 날아라");
			}
		};
		d1.ghi();
		//2.생성자를 통해서 값 할당	(d2)
		Abc d2 = new Abc(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d2 달려라");
			}
			
			@Override
			public void fly() {
				System.out.println("d2 날아라");
			}
		});
		d2.ghi();
		//3.setter를 통해서 값할당	(d3)
		Abc d3 = new Abc();
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d3 달려라");
			}
			
			@Override
			public void fly() {
				System.out.println("d3 날아라");
			}
		});
		d3.ghi();
	}

}
