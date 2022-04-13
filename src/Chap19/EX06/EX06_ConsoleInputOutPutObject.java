package Chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ֿܼ��� �ѱ��� ��ǲ ���� ���� input.txt �� ���� ��, Characterset : Default
// input.txt ���Ͽ��� ���� �о �ֿܼ� ���.
// ��Ʈ : /
	//1. System.in : �ֿܼ��� ��ǲ
	//2. FileOutputSream : ��ǲ ���� ���� ���Ͽ� ����
	//3. FIleInputStream : ����� ������ ������ �о�´�.
	//4. System.out : �ֿܼ� ���


public class EX06_ConsoleInputOutPutObject {
	public static void main(String[] args) throws IOException {
		
		//1. �ֿܼ��� �ѱ��� ��ǲ �޴´�. (System.in) <== �ܼ��� �Է¹����� byte[] �迭�� �����ؼ� ó���ؾ� �ѱ��� ó�� �� �� �ִ�.
		InputStream is = System.in;  // new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ���� �޴´�.
		
		System.out.println("�ѱ��� �Է��ϼ��� >>>");
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1); // byteArray1�� byte�� \r\n�� ������ ���� ����ȴ�.
		//System.out.println(count1);       // count1�� �迭�� ���� ���� ����.
		//int data = is.read(); // �ѱ��� ó������ ���Ѵ�. , data���� 1byte read�� ���� ����.
		
		//2. ��ǲ ���� �ѱۿ� ���Ͽ� �����Ѵ�. (FileOutputStream)
		File f1 = new File("Chap19\\EX06\\input.txt");
		OutputStream fos = new FileOutputStream(f1,false);  //false ����� true �̾��
		
		fos.write(byteArray1); // ����(RAM)���� �������� �ִ�.
		fos.flush(); // flush�� ����ؾ����� ����(RAM)�� ������ ������ ���Ͽ� ��������.
		
		
		//3. ����� ���Ͽ��� ���� �о� �´�. (FIleInputStream)
		InputStream fis = new FileInputStream(f1);  //read() : �ѱ��� ó�� ���Ѵ�. 
								// read(bytge[]) : �ѱ� ó��.
		byte[] byteArray2 = new byte[100];
		
		int count2 = fis.read(byteArray2); //read(byte[]) : �ѱ�ó��
		//int data2 = fis.read(); -> read() : 1byte�� ó���Ͽ� �ѱ��� �������Ѵ�.
		
		System.out.println();
		System.out.println("���Ͽ��� ���� ������ �ֿܼ� ��� �մϴ�. >>>>");
		System.out.println();
		
		
		//4. �о�� �迭�� �ֿܼ� ��� �Ѵ�. (System.out)
		OutputStream os = System.out;  //�ֿܼ� ��� : byte[]
		
		os.write(byteArray2);
		os.flush();
		
		is.close();
		fos.close();
		fis.close();
		os.close();
		
	}

}
