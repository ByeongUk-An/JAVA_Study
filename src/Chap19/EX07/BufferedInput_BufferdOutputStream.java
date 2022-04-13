package Chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//�߰� ����� �����ϴ� ��Ʈ��, ��ݽ�Ʈ���� �����ؾ��Ѵ�. �ܵ����� ����� �� ����.
//BufferdInputStream : InputStream �� ���͸� �����ؼ� (�б�) ������ ���� ������ �ϴ� ��Ʈ��. 
	// , �ܵ����� ��� �� �� ����. ��ݽ�Ʈ���� �߰������ ����
//BufferdOutputStream : OutputStream �� ���͸� �����ؼ� (����) ������ ���� ������ �ϴ� ��Ʈ��.
	// , �ܵ����� ��� �� �� ����. ��ݽ�Ʈ���� �߰������ ����

public class BufferedInput_BufferdOutputStream {
	public static void main(String[] args) {
		//�������� ����, Buffered �� ������� �ʰ� ó���ϴ� ���
		
		File orgfile = new File("Chap19\\EX07\\mycat_origin.jpg"); //���� ����.
		File copyfile1 = new File("Chap19\\EX07\\mycat_copy1.jpg"); //Buffered�� ������� �ʰ� ó���ϴ°��
		File copyfile2 = new File("Chap19\\EX07\\mycat_copy2.jpg"); //Buffered�� ����ϴ� ���
		
		//���� ������ �ϱ����� ���� ����.
		long start,end,time1,time2; //time1 : Buffered�� ������� �ʴ°�� , time2 : Buffered�� ����� ���
		
		//1. Buffered �� ������� �ʰ� ó���ϴ� ��� (BufferedInputStream, BufferOutStream)
		start = System.nanoTime();  //���� �ð�
		
		try(InputStream is = new FileInputStream(orgfile);		//Auto close()
			OutputStream os = new FileOutputStream(copyfile1);	//Auto close()
				) {
			//������ ���� �ڵ� ����.
			int data;
			while((data = is.read()) != -1) { //is ���� 1byte�о       ,-1�� ������ ����. 
				os.write(data);				  // os�� 1byte ���� 
			}
		} catch (IOException e1) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream" + time1); //���۸� ������� �ʰ� ����. copy1.jpg
		
		
		//2. Buffered�� ����ϸ鼭 ó���ϴ� ��� (BufferdInputStream)
		start = System.nanoTime();
		
		try (InputStream is = new FileInputStream(orgfile); 
			 BufferedInputStream bis = new  BufferedInputStream(is);
			 OutputStream os = new FileOutputStream(copyfile2);
			 BufferedOutputStream bos = new BufferedOutputStream(os);  //Auto close()
				) {
			//������ �ڵ� ����
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (IOException e) {}
		
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With BufferedXXXStream : " + time2);
		
		// Buffered ����� ��� (time2), Buffered ������� �ʴ� ��� (time1)
		System.out.println("�ӵ� ���� �� �� :"+time1 / time2);
	}

}
