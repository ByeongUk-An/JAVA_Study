package Generic.Ch01.Two;

class KeyValue<K,V> {
	private K k;
	private V v;
	
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
	void print() {
		System.out.println(k + "의 가격은" + v + "입니다.");
	}
}

public class TwoGenericArguments {
	public static void main(String[] args) {
		KeyValue<String,Integer> keyvalue = new KeyValue<String,Integer>();
		keyvalue.setK("사과");
		keyvalue.setV(3000);
		System.out.println(keyvalue.getK());
		System.out.println(keyvalue.getV());
		keyvalue.print();
	}
}
