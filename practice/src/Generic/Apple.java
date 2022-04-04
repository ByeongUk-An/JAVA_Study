package Generic;

class Fruit<V,K> {
	private V v;
	private K k;
	
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public void print() {
		System.out.println(v + "�� ������" + k + "�� �Դϴ�.");
	}
}

public class Apple {
	public static void main(String[] args) {
	Fruit<String,Integer> fr = new Fruit<String,Integer>();
	
	fr.setV("���");
	fr.setK(3000);
	fr.print();
	
	
	}

}
