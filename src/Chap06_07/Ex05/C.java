package Chap06_07.Ex05;

public class C {
	private String company = "HYUNDAI"; // 회사명 => private로 인해 외부에서 변경 불가
	String model; // 모델 => 접근 제어자 : default
	protected String color; // 색깔
	public int maxspeed; // 최대 속력

	

	

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
