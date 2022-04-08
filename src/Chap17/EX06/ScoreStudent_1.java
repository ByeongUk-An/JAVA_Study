package Chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int score;     //점수를 입력 , 필드의 값 할당. (1. 객체 생성후 직접, 2. private (생성자, Setter, getter)
	
	Student() {} 
	Student (int score) {
		this.score = score; 
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in) ;    // System.in : 콘솔을 통해서 값을 받겠다. 

        boolean run = true;
        int studentNum = 0;    //while 블락밖에서 선언, 전역 변수 
        
        while(run) {			//run : true
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();		//선택 , //if 조건 문 밖에서 선언 

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                	//코드 작성 
                studentNum = scanner.nextInt(); 	// 학생수 인풋 받음.                
                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            		//코드작성
            	if (studentNum == 0 ) {		//studentNum 을 할당 받아야 for 문의 범위를 지정 할 수 있다. 
            		System.out.println("학생수를 먼저 입력 하세요. ");
            	}else {
            		//for 문을 통해서 인풋 받은 학생 수 만큼 점수을 입력. 
            		for (int i = 0 ; i < studentNum ; i++) {    // 
            			//인풋을 받아서 인푼 받은 값을 Student 객체의 score 변수에 할당. 
            			// 객체를 생성 해서 
            			Student student = new Student();  //기본 생성자를 사용해서 객체 생성, 직접 score 필드 값을 할당. 
            			System.out.print((i + 1) + "번째 학생 점수를 입력 하세요. ");
            			student.score = scanner.nextInt();   //학생 점수를 입력 받아서 필드에 값을 할당. 
            			arr.add(student);    //ArrayList에 필드에 값을 할당한 객체를 ArrayList에 저장 
            			System.out.println("입력 완료"); //입력 완료라고 출력 하고 개행 
            			 
            		}
            	}
               
            } else if(selectNo == 3) {
            		//코드작성, 점수 리스트 출력, ArrayList 각 점수가 할당된 객체가 저장 . 객체 생성후, 필드의 값을 직접출력, getter
            	if (studentNum == 0) {
            		System.out.println("학생수를 먼저 입력 하세요.");
            	}else {
            		for (int i = 0 ; i < studentNum ; i++) {  //ArrayList 객체를 가져와서 Student.score 필드의 값을 출력
            			Student student = arr.get(i);  //ArrayList의 get() 각방의 Student 객체 
            			//System.out.println(student.score);  //필드의 값을 객체로 직접 출력, 
            			System.out.println(student.getScore());    //필드의 값을 getter로 출력 .          			
            		}
            	}
             
            } else if(selectNo == 4) {
            	//코드작성
            	if (studentNum == 0 ) {
            		System.out.println("학생수를 먼저 입력 하세요. ");
            	}else {
            		int maxScore = 0 ; 	// 최대 점수를 받는 지역변수 선언   <초기값 할당> 
            		int sum = 0; 		// 합계를 저장하는 지역변수 		 <초기값 할당> 
            		//1. ArrayList의 객체를 가지고 온다. 2. Student 객체의 score 필드의 값을 가져와서 처리 
            		for( int i = 0 ; i < studentNum ; i++) {
            			Student student = arr.get(i); 
            			//최대 갑을 변수에 할당. 
            			//3항 연산자를 사용해서 최대값을 변수에 할당.
            			maxScore = (student.score > maxScore) ? student.score:maxScore;
            			sum += student.score;   //sum = sum + student.score
            		}
            		//maxScore 변수의 최종 값을 적용후, sum : 모든 score더한 값을 변수에 담아서 
                    System.out.println("최고점수 : " + maxScore);
                    System.out.println("평균점수 : " + (float) sum / studentNum);
            		          		
            	}

         
            } else if(selectNo == 5) {
            	//코드작성
            	run = false;     //run false 일때 while 문을 빠져 나옴
            	//break; 
              }
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
