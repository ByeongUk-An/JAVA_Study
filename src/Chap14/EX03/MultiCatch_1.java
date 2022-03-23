package Chap14.EX03;

import java.text.NumberFormat;

//여러개의 Exception이 동시에 발생될경우 처리

public class MultiCatch_1 {

	public static void main(String[] args) {
		// 1. 단일 Exception 처리 => try catch 처리
	      
	      // ArithmeticException
	      try {
	         System.out.println(10 / 0);
	      } catch(ArithmeticException e) {
	         // catch 블록의 아무 내용이 없어도 예외처리 진행됨
	         System.out.println("정상 출력 (ArithmeticException)");
	      }
	      
	      
	      // NumberFormatException
	      try {
	         int num = Integer.parseInt("10A");
	      } catch (NumberFormatException e) {
	         // catch 블록의 아무 내용이 없어도 예외처리 진행됨
	         System.out.println("정상 출력 (NumberFormatException)");
	      }
	      
	      System.out.println("--------------------------------");
	      
	      // 2. 다중 Exception(MultiException) 처리
	      try {
	         System.out.println(10 / 0);
	         int num2 = Integer.parseInt("10A");
	      } catch (ArithmeticException e) {
	         System.out.println("ArithmeticException");
	      } catch (NumberFormatException e) {
	         System.out.println("NumberFormatException123");
	      }
	      
	      
	      
	      
	      // 3. 다중 Exception 처리2
	   try {
		   System.out.println(10/0);
		   int num3 = Integer.parseInt("10A");
	   }catch(ArithmeticException e) { 
		   System.out.println("다중 예외 처리");
	   }catch(NumberFormatException e) {
		   System.out.println();
	   }
	   
	   //4. 여러개의 exception을 통합 해서 적용.
	   try {
		   System.out.println(10/0);
		   int num3 = Integer.parseInt("10A");
	   }catch(ArithmeticException | NumberFormatException e) { 
		   //여러개의 exception을 통합
		   System.out.println("다중 예외 처리");
	   }   
	      System.out.println("프로그램 종료");
	}

}
