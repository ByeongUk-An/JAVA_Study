package chap16.Ex06.EX1;

public class GenericPrinter<T extends Meterial> {		// 
				// T : Ÿ�������� Meterial�� ���� Ŭ������ T Ÿ�Կ� ��� �� �� �ִ�.
	private T material;		// material : ��������, ��ü, �ν��Ͻ�
	
	public T getMaterial() {	// ��ü�� ����
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		// �ش� ��ü�� toString() method ȣ��
	}
	
	public void printing() {		// method�� ����
		material.doPrinting();
	}
	
	

}
