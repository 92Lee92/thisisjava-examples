package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		String hobby = "";
		if (hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
		String emptyStr = "";
		if (hobby == emptyStr) {
			System.out.println("hobby 변수와 emptyStr 변수는 같은 빈 문자열 객체를 참조");
		} else {
			System.out.println("hobby 변수와 emptyStr 변수는 다른 빈 문자열 객체를 참조");
		}
	}

}
