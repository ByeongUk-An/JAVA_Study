package Chap06_07.Ex05;

public class C {
	private String company = "HYUNDAI"; // ȸ��� => private�� ���� �ܺο��� ���� �Ұ�
	String model; // �� => ���� ������ : default
	protected String color; // ����
	public int maxspeed; // �ִ� �ӷ�

	

	

	public String getModel() {
		return model;
	}





	public void setModel(String model) {
		this.model = model;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public void print() {
		System.out.println("Company : " + company + "\n" + "Model : " + model + "\n" + "Color : " + color + "\n"
				+ "Maxspeed" + maxspeed);
	}

}
