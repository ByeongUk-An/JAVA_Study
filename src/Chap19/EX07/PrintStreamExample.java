package Chap19.EX07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* PrintStream
 * FilterStream이다. (추가기능을 제공하는 Stream)
 * 기반 Stream이 있어야 한다.
 * 다양한 방법으로 출력할 때 사용되는 출력에 특화된 Stream
 * flush() 메소드를 호출하지 않아도 자동으로 flush 된다.
 * println(), print(), printf()
 * 파일 출력, 콘솔 출력, ...
 */


public class PrintStreamExample {
	public static void main(String[] args) {
		// 파일 출력
		// File 객체 생성
		File outFile1 = new File("JAVA\\src\\chap19\\EX07\\printstream1.txt");
		File outFile2 = new File("JAVA\\src\\chap19\\EX07\\printstream2.txt");
		
		// 1. PrintStream ( FileOutputStream(File) )
		
		try (OutputStream os1 = new FileOutputStream(outFile1);				// 기반 Stream
				PrintStream ps = new PrintStream(os1);){					// 추가기능을 제공해주는 Filter Stream
			ps.println(9.8);												// 출력 후, 라인개행
			ps.print(3 + "안녕" + 12345 + "\n");								// 출력 후, 라인개행X
			ps.printf("%d 이 호출되었습니다. \n",7);								// %d : int 값을 호출
			ps.printf("%s %f 이 호출되었습니다.","안녕",5.8);						// %s : String, %f : double 값을 호출								// %d : int 값을 호출
			//ps.flush();													// 자동으로 호출된다.
		} catch (Exception e) {
		}
		
		
		// 2. PrintStream(File)
		try (PrintStream ps = new PrintStream(outFile2)){
			ps.println(9.8);												// 출력 후, 라인개행
			ps.print(3 + "안녕" + 12345 + "\n");								// 출력 후, 라인개행X
			ps.printf("%d 이 호출되었습니다. \n",7);								// %d : int 값을 호출
			ps.printf("%s %f 이 호출되었습니다.","안녕",5.8);						// %s : String, %f : double 값을 호출								// %d : int 값을 호출
			//ps.flush();	
		} catch (FileNotFoundException e) {
		}
		
		
		
		
		// console에 출력
		// 1. PrintStream ps = new PrintStream(System.out)
		try(OutputStream os2 = System.out;
				PrintStream ps = new PrintStream(os2);) {
			ps.println(9.8);												// 출력 후, 라인개행
			ps.print(3 + "안녕" + 12345 + "\n");								// 출력 후, 라인개행X
			ps.printf("%d 이 호출되었습니다. \n",7);								// %d : int 값을 호출
			ps.printf("%s %f 이 호출되었습니다.","안녕",5.8);						// %s : String, %f : double 값을 호출								// %d : int 값을 호출
			//ps.flush();	
		} catch(Exception e) {
		}
		
		
		// 2. PrintStream ps = System.out;
		try(PrintStream ps = System.out;) {
			ps.println(9.8);												// 출력 후, 라인개행
			ps.print(3 + "안녕" + 12345 + "\n");								// 출력 후, 라인개행X
			ps.printf("%d 이 호출되었습니다. \n",7);								// %d : int 값을 호출
			ps.printf("%s %f 이 호출되었습니다.","안녕",5.8);						// %s : String, %f : double 값을 호출								// %d : int 값을 호출
			//ps.flush();	
		} catch(Exception e) {
		}
		
		
		
		
	}
}
