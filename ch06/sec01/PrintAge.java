package ch06.sec01;

public class PrintAge {
	public static void main(String[] args) {
		Person kimJava = new Person(2019);
		int kimJavaAge = kimJava.personAge(kimJava.bornYear);
		System.out.println(kimJavaAge+ "살입니다.");
		Person kimJara = new Person(1932);
		int kimJaraAge = kimJara.personAge(kimJara.bornYear);
		System.out.println(kimJaraAge+ "살입니다.");
	}
}
class Person {
	int bornYear;
	int age;
	Person(int bornYear){
		this.bornYear = bornYear;
	}
	int personAge(int bornYear) {
		age = AgeCal.calAge(bornYear);
		return age;
	}
}
class AgeCal{
	static final int YEAR = 2023;
	static int calAge(int bornYear) {
		int age = YEAR - bornYear;
		return age;
	}
}
