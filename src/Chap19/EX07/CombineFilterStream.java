package Chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* 하나의 기반 Stream에 Filter Stream을 여러 개 조합해서 사용가능하다.
 * 제일 마지막에 처리하는 Stream의 메소드 사용여부에 따라 순서를 정할 수 있다.
 */


/* 기반 Stream 1개 : FileOutputStream
 * Filter Stream 2개 : BufferedOutputStream (Buffer 사용, 빠르게처리), DataOutputStream (다양한 포멧 방식으로 처리)
 */

public class CombineFilterStream {

	public static void main(String[] args) {
		// 1. 파일 생성
		File dataFile = new File("JAVA\\src\\chap19\\EX07\\file2.data");
		
		// 2. 데이터 쓰기
		try (OutputStream os = new FileOutputStream(dataFile);							// 기반Stream
				BufferedOutputStream bos = new BufferedOutputStream(os);				// 추가기능 Stream
				DataOutputStream dos = new DataOutputStream(bos)){						// 추가기능 Stream
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		} catch (Exception e) {
		}
		
		// 3. 데이터 읽기
		
		try (InputStream io = new FileInputStream(dataFile);							// 기반Stream
				BufferedInputStream bis = new BufferedInputStream(io);					// 추가기능 Stream
				DataInputStream dis = new DataInputStream(bis)){						// 추가기능 Stream
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
