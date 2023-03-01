package ch13.sec01;

public class NonGenericExample {

	public static void main(String[] args) {
		Container container1 = new Container();
		Container container2 = new Container();
		
		container1.content = "안녕하세요";
		container2.content = 8282;
		
		String content1 = (String)container2.content;
		int content2 = (int)container1.content;
	}
}
