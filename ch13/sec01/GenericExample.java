package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		// Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>(); // 변수를 선언할 때와 동일한 타입으로 호출하고 싶다면 생성자 호출 시에는 타입을 명시하지 않아도 된다.
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);

		// Box<Integer> box2 = new Box<String>();
		Box<Integer> box2 = new Box<>(); // 변수를 선언할 때와 동일한 타입으로 호출하고 싶다면 생성자 호출 시에는 타입을 명시하지 않아도 된다.
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}

}
