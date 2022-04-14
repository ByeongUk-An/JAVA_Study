package Chap19.EX07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* InputStream : 기반 스트림
 * 		int 5555-> 문자 5555 -> 문자 5555 -> int 5555
 * 
 * DataInputStream
 * 		다양한 포맷의 데이터를 빠르게 전송할 때 사용
 * 		특정 데이터 타입을 유지한채 내보내거나 가져올 수 있다.
 * 			int -> int, double -> double
 * 		추가 기능을 제공하는 Stream
 * 		기반 Stream이 반드시 존재해야 한다.
 * 		단독으로 사용할 수 없다.
 */

public class DataInput_DataOutputStream {

	public static void main(String[] args) {
		// 파일 생성
		File dataFile = new File("JAVA\\src\\chap19\\EX07\\file1.data");		// 확장자 : data, binary data로 저장됨
		
		// 데이터 쓰기 (DataOutputStream)
		try (OutputStream os = new FileOutputStream(dataFile);					// 기반 Stream
				DataOutputStream dos = new DataOutputStream(os)){				// 추가 기능을 제공하는 Steram
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		} catch (Exception e) {													// Exception : 모든 예외의 최상위 클래스
		}
		
		
		// 데이터 읽기 (DataInputStream)
		try (InputStream is = new FileInputStream(dataFile);					// 기반 Stream
				DataInputStream dis = new DataInputStream(is)){				// 추가 기능을 제공하는 Steram
		System.out.println(dis.readInt());	
		System.out.println(dis.readDouble());	
		System.out.println(dis.readChar());	
		System.out.println(dis.readUTF());	
		} catch (Exception e) {													// Exception : 모든 예외의 최상위 클래스
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
