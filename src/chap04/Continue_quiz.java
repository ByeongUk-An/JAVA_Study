package chap04;

public class Continue_quiz {

	public static void main(String[] args) {
		POS1: for (int i = 1; i <= 19; i++) {
			for (int j = 1; j <= 9; j++) {

				if (i % 2 == 0) {
					continue POS1;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
			
		}

		for (int i = 1; i <= 19; i++) {
			if(i%3==0) {
				for (int j = 1; j <= 9; j++) {
						System.out.println(i + "*" + j + "=" + (i * j));
				}
			}else {
				
				continue;
			}
			System.out.println("=========================");
		}
	}
}
