package ch09.my.example;

public class MyExample {

	MyExample() {
		System.out.println("MyExample 생성자 실행");
		System.out.println("==============================================================");
		PubClass pubClass = new PubClass();
		pubClass.method();
		System.out.println("MyExample 생성 뒤 PriStatClass생성 이렇게 쓰려면 static일 필요 없음");
		PriStatClass priStatClass = new PriStatClass();
		priStatClass.method();
	}

	public static void main(String[] args) {
		System.out.println("MyExample클래스의 main메소드 실행");
		PriStatClass priStatClass = new PriStatClass();
		priStatClass.method();
	}

	PriClass priClass = new PriClass();

	public void method1() {
		System.out.println("MyExample의 인스턴스 메소드 method1()실행.");
		System.out.println("==============================================================");
	}

	public void method2() {
		System.out.println("MyExample의 인스턴스 메소드 method2(): 안쪽 클래스에서 사용할 인스턴스 메소드. 정적 멤버 클래스에서는 사용할 수 없다.");
	}

	public static void method3() {
		System.out.println("MyExample의 static 메소드 method3(): 안쪽 클래스에서 사용할 static 메소드. 모든 멤버 클래스에서 사용할 수 있다.");
		System.out.println(
				"===============================================================================================");
	}

	public void priMethod() {
		PriClass priClass = new PriClass();
		priClass.method();
	}

	public class PubClass {
		PubClass() {
			System.out.println("PubClass 생성자 실행");
			System.out.println("==============================================================");
		}

		public void method() {
			System.out.println("public 클래스인 PubClass의 메소드");

			MyExample.this.new DefClass();
			MyExample.this.method1();
			System.out.println("PubClass안의 메소드에서 MyExample의 method2와 method3 호출");
			method2();
			method3();
		}
	}

	class DefClass {
		DefClass() {
			System.out.println("DefClass 생성자 실행");
			System.out.println("==============================================================");
		}

		public void method() {
			System.out.println("default 클래스인 DefClass의 메소드");

			MyExample.this.new DefClass();
			System.out.println("DefClass안의 메소드에서 MyExample의 method2와 method3 호출");
			method2();
			method3();
		}
	}

	private class PriClass {
		PriClass() {
			System.out.println("PriClass 생성자 실행");
			System.out.println("==============================================================");
		}

		public void method() {
			System.out.println("Private 클래스인 PriClass의 메소드");
			System.out.println("PriClass에서 MyExample의 method2와 method3 호출");
			method2();
			method3();
		}
	}

	public static class PubStatClass {
		PubStatClass() {
			System.out.println("PubStatClass 생성자 실행");
			System.out.println("==============================================================");
		}

		public void method() {
			System.out.println("public static 클래스인 PubStatClass의 메소드");
			System.out.println("PubStatClass에서 MyExample의 method2와 method3 호출");
			System.out.println("인스턴스 메소드인 method2()는 호출 안됨");
//			method2();
			method3();
		}
	}

	static class DefStatClass {
		DefStatClass() {
			System.out.println("DefStatClass의 생성자 실행");
			System.out.println("==============================================================");
		}

		public void method() {
			System.out.println("default static 클래스인 DefStatClass의 메소드");
			System.out.println("DefStatClass에서 MyExample의 method2와 method3 호출");
			System.out.println("인스턴스 메소드인 method2()는 호출 안됨");
//			method2();
			method3();
		}
	}

	private static class PriStatClass {
		PriStatClass() {
			System.out.println("PriStatClass의 생성자 실행. MyExample 클래스 내부에서만 접근할 수 있다.");
			System.out.println("==============================================================");
		}

		public void method() {
			System.out.println("private static innerclass인 PriStatClass의 메소드입니다.");
			System.out.println("PriStatClass에서 MyExample의 method2와 method3 호출");
			System.out.println("인스턴스 메소드인 method2()는 호출 안됨");

//			method2();
			method3();
		}

	}

}

class AnotherMyExample {

	// 필드
	private PubStatIf pubStatIf;
	private PubIf pubIf;
	private DefIf defIf = new DefIf() {
		@Override 
		public void methodIf() {
			System.out.println("예시 3번입니다.");
		}
	};
	

	// 메소드
	public void setPubStatIf(PubStatIf pubStatIf) {
		this.pubStatIf = pubStatIf;
	}

	public void setPubIf(PubIf pubIf) {
		this.pubIf = pubIf;
	}

	public void methodIf1() {
		this.pubStatIf.methodIf();
	}
	public void methodIf2() {
		this.pubIf.methodIf();
	}
	
	public void methodIf3() {
		defIf.methodIf();
	}
	
	// 정적 멤버 인터페이스
	public static interface PubStatIf {
		// 추상 메소드
		public void methodIf();
	}
	// 정적 멤버 인터페이스
	public interface PubIf {
		// 추상 메소드
		public void methodIf();
	}


	interface DefIf {
		public void methodIf();

	}

	private interface PriIf {

		public void methodIf();
	}

	static interface DefStatIf {

		public void methodIf();
	}

	private static interface PriStatIf {

		public void methodIf();
	}
}