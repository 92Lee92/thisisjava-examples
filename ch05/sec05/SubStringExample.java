package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880515-1234567";

		String firstNum = ssn.substring(0, 6);
		String lastNum = ssn.substring(7);

		System.out.println(firstNum);
		System.out.println(lastNum);
	}

}
