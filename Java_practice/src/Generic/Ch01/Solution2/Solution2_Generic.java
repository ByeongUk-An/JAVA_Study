package Generic.Ch01.Solution2;

class Apple{}
class Banana{}

class Goods<T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Solution2_Generic {
	public static void main(String[] args) {
		//1. Goods�� �̿��� Apple ��ü�� �߰��ϰų� ��������
		Goods<Apple> goods1 = new Goods<Apple>();  //Goods�� Ÿ���� Apple �� �־��ִ°��̴�. ���� ��ü�� �־��ذ� �ƴϴ�.
		goods1.setT(new Apple());
		Apple apple = goods1.getT();	// Object�� �޸� ���׸�(Generic)�� �ٿ�ĳ������ �ʿ����
		
		
		
		//2. Goods�� �̿��� Banana ��ü�� �߰��ϰų� ��������
		Goods<Banana> goods2 = new Goods<Banana>();
		goods2.setT(new Banana());
		Banana banana = goods2.getT();
		
		//3. �߸��� Ÿ�� ����
//		Goods<Apple> goods3 = new Goods<Apple>();
		//goods3.setT(new Banana());  //Ÿ���� Apple�θ� �ü��ְ� �س��Ҵµ� Banana��ü�� ���鼭 �����߻�
		//Apple apple2 = goods3.getT(); //���������� �߻����� ������ �������ϸ鼭 ���࿹�ܰ� ����ȴ�.
	}

}
