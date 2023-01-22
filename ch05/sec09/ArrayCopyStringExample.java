package ch05.sec09;

public class ArrayCopyStringExample {

	public static void main(String[] args) {
		String[] str1 = { "포도", "딸기", "자바" };
		String[] str2 = new String[3];
		for (int i = 0; i < str1.length; i++) {
			str2[i] = str1[i];
		}
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i] + ",");
		}
		System.out.println();
		System.out.println("str1[0]의 값 바꿈");
		str1[0] = "고구마";
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i] + ", ");
		}

	}

}
