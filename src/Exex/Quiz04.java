package Exex;
class E extends Object { //자바의 모든 클래스는 Object 의 자식 클래스이다.
   String name;
   E () {};      // 기본 생성자 : class 내 다른 생성자가 존재하고 외부에서 기본 생성자를 호출할 때 생략되면 안됨
   E (String name) {
      this.name = name;      // 매개변수 이름, 구현부에서 매개변수를 받는 변수명, 필드의 변수명이 동일한 경우 this(자신의 객체) 필수
   }
   //this : 자식의 객체
   @Override
	public String toString() { //객체 자체를 출력시 toString()가 호출
		return "이름 :" + name; // this.name ,
	}
   @Override
	public boolean equals(Object obj) { // e2.equals(e3);
	   if(this.name.equals(((E)obj).name)) {
		   return true;
	   }else {
		   return false;
	   }
	}
}

class Students {
   int studentID;
   String name;
   int kor;
   int eng;
   
   Students(int studentID, String name, int kor, int eng) {
      this.studentID = studentID;
      this.name = name;
      this.kor = kor;
      this.eng = eng;
   }
   
   @Override
   public boolean equals(Object obj) {
      if (this.studentID == ((Students)obj).studentID) {
         return true;
      } else {
         return false;
      }
   }
   
   // studentID가 같은 경우 "같은 학생이다"라고 출력
   // 객체의 studentID 컬럼을 비교해서 같을 경우 "같은 학생이다."라고 출력
   
   // == : 기본 타입 => boolean, byte, short, int, long, double, float, char
      // => 값(값 주소)을 비교
      // => 참조 타입 비교 : 객체의 주소를 비교 (배열, 객체, String(***))
         // => String : toString()이 기본적으로 재정의되어있음. equals()도 재정의되어있음
      // object의 toString() : 원래 객체 자체를 print할 경우 주소(package 이름.class 이름@hashCode)를 출력 => toString()할 경우 overriding해서 객체의 필드값 출력 
      // object의 equals() : 원래 == 와 같음. 객체의 주소를 비교 => 재정의 후 객체 내의 특정 필드의 값을 비교
}

public class Quiz04 {

   public static void main(String[] args) {
      Students student01 = new Students(20220317, "홍길동", 95, 90);
      Students student02 = new Students(20220310, "영희", 80, 85);
      Students student03 = new Students(20220310, "민지", 91, 80);
      Students student04 = new Students(20220317, "철수", 90, 95);
      
      // StudentID가 같은 경우, 같은 학생이다라고 출력
      
      if (student01.equals(student04)) {
         System.out.println("같은 학생이다.");
      } else {
         System.out.println("다른 학생이다.");
      }
      
      E e1 = new E();		// 기본 생성자 호출 : Heap 의 필드의 값은 강제 초기화 됨
      System.out.println(e1.name);  //null
      
      E e2 = new E("고양이");
      System.out.println(e2.name);
      
      E e3 = new E("고양이");
      System.out.println(e1 == e2);  //참조 타입 (==) : 객체의 주소를 비교
      System.out.println(e2);
      System.out.println(e3);
      System.out.println(e2.equals(e3));  //Object의 equals() 는 (==)와 같다.   => 객체의 주소를 비교
      // Object의 toString(), equals() 그냥 쓰는경우가 없고 재정의해서 쓴다.
     
      
   }

}