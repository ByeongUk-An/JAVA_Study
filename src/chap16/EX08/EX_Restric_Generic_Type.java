package Chap16.EX08;

// 제너릭 클래스를 생성 해서 , 타입 제한 (Apple, Strawberry, Banana) , Pancil를 타입으로 접근할 수 없도록 설정 
   //완료 시간 : 12:00 , p.jangwoo@gmail.com 

abstract class Fluit {
	public abstract void print () ;  //추상 메소드 
}
class Apple extends Fluit {
	String name; 
	int	price ; 
	Apple (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "이고 가격은 " + price ; 
	}
	@Override
	public void print() {
		System.out.println(name + " - 출력");
		
	}
}
class Strawberry extends Fluit{
	String name; 
	int	price ; 
	Strawberry (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "이고 가격은 " + price ; 
	}
	@Override
	public void print() {
		System.out.println(name + " - 출력");
		
	}
}
class Banana extends Fluit{
	String name; 
	int	price ; 
	Banana (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "이고 가격은 " + price ; 
	}
	@Override
	public void print() {
		System.out.println(name + " - 출력");
		
	}
}

class Pancil {
	String name; 
	int	price ; 
	Pancil (String name, int price){
		this.name =name ; 
		this.price = price; 
	}
	@Override
	public String toString() {
		
		return name + "이고 가격은 " + price ; 
	}
} 

//제너릭 클래스 : Fluit 타입만 올수 있음.    //DTO , VO 
class GenClass <T extends Fluit>{     //DTO(Data Transfer Object) - getter, settor, 
									  //VO(Value Object) - getter  
	private T t ;						// 데이터를 받아서 전송하는 중간자 역활을 함. 
										// 계층간에 값을 받아서 전송, 중간자 역활 
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	} 
	
}

public class EX_Restric_Generic_Type {
	public static void main(String[] args) {
		
		GenClass<Fluit> a1 = new GenClass<Fluit>(); 

		a1.setT(new Apple("사과",1000));
		System.out.println(a1.getT());
		
		a1.setT(new Strawberry("딸기", 2000));
		System.out.println(a1.getT());
		
		a1.setT(new Banana("바나나", 3000));
		System.out.println(a1.getT());
		
		
		//오류 발생 (연필은 저장할 수 없음)
		//a1.setT(new Pancil("연필", 4000));
		//System.out.println(a1.getT());
		
		
	}
	

	
	
	
	
	

}
