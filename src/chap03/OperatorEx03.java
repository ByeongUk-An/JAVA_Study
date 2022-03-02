package chap03;
public class OperatorEx03 {
	public static void main(String[] args) {
/*
* �� ������ (&&, ||, ^, ! ) : ��Ʈ ��Ŷ�� �߻��� (�պκ��� ���� ����� �����Ҽ� ������ �޺κ��� ������ ����)
* ��Ʈ ������ (&, |, ^,) : ��Ʈ ��Ŷ�� �߻����� ����
 * */
		
		//1. �� ������ AND (&&) : �� ���� ��� true �� ��
		
		System.out.println(true && true); //true , ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		System.out.println(true && false); //false, ��Ʈ��Ŷ�� �߻� ���� ����.
		System.out.println(false && true); //false, ��Ʈ��Ŷ�� �߻��ȴ�.
		System.out.println(true && (5<3)); //false, ��Ʈ��Ŷ�� �߻� ���� ����.
		System.out.println((5<=5) && (7>2)); //true
		System.out.println((3<2) && (8<10)); //false, ��Ʈ��Ŷ�� �߻���.
		
		//OR (||) : �� ���� �ϳ��� true �̸� ����� True
		System.out.println(true || true); //true , ��Ʈ ��Ŷ�� �߻�
		System.out.println(false || (5<3));
		System.out.println();
		
		//XOR (^) : �� ���� ������ false, �� ���� �ٸ��� true
		System.out.println(true ^ true); //false
		System.out.println(false ^ false); //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println((5<=5)^ (7>2)); //false
		
		//Not (!) : true �̸� false, false �̸� true
		System.out.println(!true); //false
		System.out.println(!false); ///true
		System.out.println(false || !(5<3)); //true
		
		//�� ��Ŷ�� ��� ���� (���������϶� �߻�, ��Ʈ�������϶��� �߻���������)
		int value2 = 3;
		System.out.println(false && ++value2 > 6); // false, ��Ʈ ��Ŷ�� �߻���.
		System.out.println(value2); //3
		
		int value3 = 3;
		System.out.println(false & ++value3 >6); //false, ��Ʈ ��Ŷ�� �߻��� �ȵ�.
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true || ++value4 >6); //true
		System.out.println(value4); //3 , ��Ʈ ��Ŷ�� �߻�
		
		int value5 = 3;
		System.out.println(true | ++value4 > 6); // true
		System.out.println(value4); //4, ��Ʈ��Ŷ�� �߻����� �ʴ´�.
		
		
		
	}
}
