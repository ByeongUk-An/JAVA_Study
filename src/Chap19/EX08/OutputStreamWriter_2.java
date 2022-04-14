package Chap19.EX08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 	Reader / Writer : �߻� Ŭ����, char �� ó��, ����(o), �̹���(x), MP3(x)....
 	FileReader / FileWriter : �ϼ��� Ŭ����, Default charset �� ���.
 	InputStreamReader / OutputStreamWriter : ������ ���ڵ�(MS949,UTF-8) �����ؼ� �б�, ���⵵ ���ڵ�(MS949, UTF-8) ���� ����.
 	
 	���� : System.in : �ֿܼ��� �Է�, System.out : �ֿܼ� ���  <== �ѹ� close() �Ǹ� ���� �Ұ�.
 		System.in, System.out <== byte �б�, byte ����.
 */

public class OutputStreamWriter_2 {
	public static void main(String[] args) {

		//1. �ܼ� ��� ( Application Default : MS949 ==> MS949 )
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"MS949");
			osw.write("OutputStreamWriter ���� ���� �Դϴ�. \n".toCharArray());
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); // String
			osw.write('\n');
			osw.write("Good Bye !!!! \n\n");  //write�� ����(RAM)���� ��������.
			osw.flush();  //���ۿ� ����� ���� �ֿܼ� ���
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("===============================");
		
		//2. �ܼ� ��� ( Application Default : MS949 ===> UTF-8 )
		
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out,"UTF-8");
			osw.write("OutputStreamWriter ���� ���� �Դϴ�. \n".toCharArray());
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); // String
			osw.write('\n');
			osw.write("Good Bye !!!! \n\n");  //write�� ����(RAM)���� ��������.
			osw.flush();  //���ۿ� ����� ���� �ֿܼ� ���
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
