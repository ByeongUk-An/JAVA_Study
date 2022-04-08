package Chap16.EX06.EX1;

public class Printer_Test {

	public static void main(String[] args) {

		GenericPrinter <Powder> powderPrinter = new GenericPrinter (); 
		powderPrinter.setMaterial(new Powder());	
		Powder powder = powderPrinter.getMaterial();    // 객체를 가져와서 powder 에할당. 
		System.out.println(powderPrinter);
		System.out.println(powder);
		powder.doPrinting();
		System.out.println("===================================" ); 
		
		GenericPrinter <Plastic> plasticPrinter = new GenericPrinter(); 
		plasticPrinter.setMaterial(new Plastic()); 
		Plastic plastic = plasticPrinter.getMaterial(); 
		System.out.println(plasticPrinter); 
		System.out.println(plastic);
		plastic.doPrinting();
		plasticPrinter.printing();
		System.out.println("====================================");
		
		//Water는 Meterial 의 자식이 아니므로 타입에 저장 할 수 없다. 
		/*
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>(); 
		waterPrinter.setMaterial(new Water());
		Water water = waterPrinter.getMaterial(); 
		System.out.println(waterPrinter);
		System.out.println(water);
		water.doPinting();
		*/
		
		
	}

}
