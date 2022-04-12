package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream : �߻� Ŭ����  <== FIleInputStream�� ������ Ŭ����
//OutPutStream : �߻� Ŭ���� <== FileOutputStream�� ������ Ŭ����

//FileInputStream : byte()���� ������ �б�
//FileOutputStream : byte() ���� ������ ����.

//Windoes �ܼ�, �޸��� Enter�� ������ : \r\n

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		
		// 1. �Է� ���� ���� 
		File outFile = new File("Chap19/EX05/FileOutput1.txt");
		
		// 2. 1���� bytes �� ����
		OutputStream os1 = new FileOutputStream(outFile);
			//FileOutputStream�� �������� �ʴ� ������ ������ ����� ������ ������.
			//FileInputStream�� ��ο� ������ �����ؾߵȴ�. �������������� ���ܹ߻�
		
		
		os1.write('J');		//write : IOException
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');  // 13 ����  <== ���� ����
		os1.write('\n');  // 10 ����
			
			//�߿� : write() �޼���� ���ۿ�(RAM)�� ����, ���۰� ������ ���Ͽ� ����
			// flush() : ����(RAM)�� ����� ������ ���Ͽ� ������ ���� �� �� ���.
		
		os1.flush(); // ���۰� �� ���� �ʴ��� ������ ���Ͽ� ���⸦ �Ѵ�. , <== ��������
		os1.close(); // close() ȣ��� flush()�� �۵��� �ȴ�.
		
		
		//3. n-byte ���� ���� (byte[]�� offset ���� length  ���� byte ������ ����)
		
		
		OutputStream os2 = new FileOutputStream(outFile);  //�����.   // (outFile) �̷������� ������ �⺻������  "," �ڿ� false�� �´�.
			//FileOutputStream(File o, Boolean append) append = true : �̾��, append = false : �����(�⺻��)
			
		byte[] byteArray1 = "Hello".getBytes();   // Hello�� String�ε� �̰��� byte�� ��ȯ ����� �Ѵ�.(String --> byte �� ��ȯ) : getBytes()
		
		os2.write(byteArray1);
		os2.write('\n'); 	// \r�� ���� ����, \n�� �־ Windoes ���� Enter ó������.
		
		os2.flush();
		os2.close();
		
		//4. n-byte ���� ���� (byte[] �� offset ���� length ���� byte �����;���)
	
		OutputStream os3 = new FileOutputStream(outFile, true);  //�̾��.
		
		byte[] byteArray2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArray2,10,8); //write �϶��� 3byte �ڿ��� 8�о ����.
									// ���� : read()�� length�� �а� offset�� ����
		
		os3.flush();
		os3.close();
		
		
	}

}
