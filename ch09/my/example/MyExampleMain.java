package ch09.my.example;


public class MyExampleMain {

	public static void main(String[] args) {
		MyExample.PubStatClass pubStatClass = new MyExample.PubStatClass();
		MyExample.DefStatClass defStatClass = new MyExample.DefStatClass();
//		MyExample.PriStatClass priStatClass = new MyExample.PriStatClass();	//Private 클래스를 다른 클래스에서 접근할 수 없음.
		MyExample myExample = new MyExample();
		myExample.priMethod();
		int a = 1;
		int b = 2;
		
		class LocalClass{
			LocalClass() {
				System.out.println("로컬클래스의 생성자 실행");
			}
			public void localMethod() {
				System.out.println("로컬클래스의 인스턴스메소드입니다.");
				System.out.println(a);
//				a = 4;
			}
			
			public static void localMethod2() {
				System.out.println("로컬클래스의 static메소드입니다. Java 17부터 선언 가능합니다.");
			}
			public static String localStaticField = "로컬클래스의 static필드. Java 17부터 선언 가능합니다.";
			public String localInstanceField = "로컬클래스의인스턴스필드";
		}
		System.out.println(LocalClass.localStaticField);
		LocalClass.localMethod2();
		LocalClass localClass = new LocalClass();
		localClass.localMethod();
		
		
		AnotherMyExample myInterfaceExample1 = new AnotherMyExample();
		class Example1 implements AnotherMyExample.PubStatIf {
			@Override
			public void methodIf() {
				System.out.println("예시 1번입니다.");
			}
		}
		
		myInterfaceExample1.setPubStatIf(new Example1());
		myInterfaceExample1.methodIf1();
		
		myInterfaceExample1.setPubStatIf(new AnotherMyExample.PubStatIf() {
			
			@Override
			public void methodIf() {
				System.out.println("예시 4번입니다.");
			}
		});
		myInterfaceExample1.methodIf1();
		
		
		
		class Example2 implements AnotherMyExample.PubIf {
			@Override
			public void methodIf() {
				System.out.println("예시 2번입니다.");
			}
		}
		myInterfaceExample1.setPubIf(new Example2());
		myInterfaceExample1.methodIf2();
		myInterfaceExample1.methodIf3();


		
		
		
		
		
		
		
	}

}
