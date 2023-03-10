package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1 과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1 과 starVar2는 문자열이 같음");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if (strVar3 == strVar4) {
			System.out.println("strVar3 과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3 과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3 과 strVar4는 문자열이 같음");
		}

		if (strVar1 == strVar4) {
			System.out.println("strVar1 과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar1 과 strVar4는 참조가 다름");
		}

		if (strVar1.equals(strVar4)) {
			System.out.println("strVar1 과 strVar4는 문자열이 같음");
		}

		if (strVar1 == strVar3) {
			System.out.println("strVar1 과 strVar3는 참조가 같음");
		} else {
			System.out.println("strVar1 과 strVar3는 참조가 다름");
		}

		if (strVar1.equals(strVar4)) {
			System.out.println("strVar1 과 strVar3는 문자열이 같음");
		}

		strVar3 = "홍길동"; // strVar3이 "홍길동" 리터럴 문자열객체를 참조
		if (strVar1 == strVar3) { // true
			System.out.println("strVar1 과 strVar3는 참조가 같음");
		} else {
			System.out.println("strVar1 과 strVar3는 참조가 다름");
		}

		if (strVar1.equals(strVar4)) {
			System.out.println("strVar1 과 strVar3는 문자열이 같음");
		}

		String[] strs = { "책", "컴퓨터" };
		String str1 = new String("책");
		String str2 = strs[0];
		String str3 = "책";

		if (str1 == str2) {
			System.out.println("str1 과 str2는 참조가 같음");
		} else {
			System.out.println("str1 과 str2는 참조가 다름");
		}
		if (str2 == str3) {
			System.out.println("str2 과 str3는 참조가 같음");
		} else {
			System.out.println("str2 과 str3는 참조가 다름");
		}
	}
}
