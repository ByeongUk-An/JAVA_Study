package Exex;

public class Ex10 {
	public static void main(String[] args) {

		for (int i = 3; i < 100; i++) {
			int unit = i % 10;
			int ten = i / 10;
			if (i < 10) {
				if (i % 3 == 0) {
					System.out.println(i + "¦");
				}
					
			} else {
				if ((ten % 3 == 0) && (i % 10 == 0)) {
					System.out.println(i + "¦");
				} else if ((unit % 3 == 0) && (ten % 3 == 0)) {
					System.out.println(i + " ¦¦");
				}

				else if ((unit % 3 == 0) || (ten % 3 == 0))
					if (i % 10 != 0) {
						System.out.println(i + "¦");
					}

			}

		}
	}

}
