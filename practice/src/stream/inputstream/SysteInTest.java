package stream.inputstream;

import java.io.IOException;

public class SysteInTest {
	public static void main(String[] args) {

		System.out.println("���ĺ� �������� ���� ���͸� ��������");
		int i=0;
		try {
			while((i=System.in.read())!='\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println((char)i);
		
		
	}

}
