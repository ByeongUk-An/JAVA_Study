package sec01_basicsyneax.Ex03_ConsoleOutput;
public class ConsolOutput {

	public static void main(String[] args) {
		 // 1. System.out.println()
	      System.out.println("�ȳ��ϼ���");
	      System.out.println("�ȳ�" + "�ϼ���");
	      System.out.println(2 + 4);
	      System.out.println(4.6);
	      System.out.println("����" + 1);
	      System.out.println("����" + 1 + 2);
	      System.out.println(1 + 2 + "����");
	      System.out.println();
	      int a = 5;
	      String b = "�ϼ���";
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println("�ȳ�" + b);
	      System.out.println(a + "�ȳ�" + b);
	      System.out.println();
	      // 2. System.out.print()
	      System.out.print("�ݰ�");
	      System.out.print("���ϴ�");
	      System.out.print("7");
	      System.out.print("\n");
	      System.out.print("\n");
	      // 3. System.out.printf()
	      System.out.printf("%d\n", 20);
	      System.out.printf("%o\n", 20);
	      System.out.printf("%x\n", 10);
	      System.out.printf("%s\n", "���ڿ� ���");
	      System.out.printf("%f\n", 3.14);
	      System.out.printf("%4.7f\n", 4567.5487453548915);
	      System.out.printf("%d�� %4.7f\n", 10, 6575.57515176854656);
	}
}

