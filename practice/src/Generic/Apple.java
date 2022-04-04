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
		System.out.println(v + "의 가격은" + k + "원 입니다.");
	}
}

public class Apple {
	public static void main(String[] args) {
	Fruit<String,Integer> fr = new Fruit<String,Integer>();
	
	fr.setV("사과");
	fr.setK(3000);
	fr.print();
	
	
	}

}
