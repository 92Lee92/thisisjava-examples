package ch05.sec05;

public class CharAtExample2 {

	public static void main(String[] args) {
		char[] charArr = {'\u0000','\ud83d','\ude04'};
		String str = new String(charArr);
		System.out.println(str);
		System.out.println(str.length());
		String smile = "\ud83d\ude04";
		System.out.println(smile);
		System.out.println((long)smile.charAt(0));
		String brokenSmile = "\ud83d";
		System.out.println(brokenSmile);
		System.out.println((long)brokenSmile.charAt(0));
	}

}
