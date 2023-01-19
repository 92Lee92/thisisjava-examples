package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		System.out.println(oldStr == newStr);

		newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);

		System.out.println(oldStr == newStr);
	}

}
