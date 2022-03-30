package chap16.Ex06.EX1;

public class GenericPrinter<T extends Meterial> {		// 
				// T : 타입제한을 Meterial의 하위 클래스만 T 타입에 들어 올 수 있다.
	private T material;		// material : 참조변수, 객체, 인스턴스
	
	public T getMaterial() {	// 객체를 전송
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		// 해당 객체의 toString() method 호출
	}
	
	public void printing() {		// method만 정의
		material.doPrinting();
	}
	
	

}
