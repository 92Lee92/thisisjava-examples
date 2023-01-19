package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}

		String[] ssns = { "93120233111111", "5112021111111", "4012024000000" };
		char[] sexes = new char[3];
		for (int i = 0; i < ssns.length; i++) {
			sexes[i] = ssns[i].charAt(6);
		}
		for (char a : sexes) {
			switch (a) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
			}
		}
	}

}
