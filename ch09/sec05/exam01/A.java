package ch09.sec05.exam01;

public class A {
	// A의 인스턴스 필드와 메소드
	int field1;

	void method1() {
		System.out.println("field1: " + field1);
	}

	// A의 정적 필드와 메소드
	static int field2;

	static void method2() {
	}

	// 인스턴스 멤버 클래스
	class B {
		void method() {
			// A의 인스턴스 필드와 메소드 사용
			field1 = 10; 	// (o)
			method1(); 		// (o)
			// A의 정적 필드와 메소드 사용
			field2 = 10;	// (o)
			method2(); 		// (o)
			
			System.out.println();
			System.out.println("field1: " + field1);
			System.out.println("field2: " + field2);
		}	
	}
	
	// 정적 멤버 클래스
	static class C {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			//field1 = 10;	// (x)
			//method1();	// (x)
			//A의 정적 필드와 메소드 사용
			field2 = 10;	// (o)
			method2();		// (o)
			System.out.println();
			System.out.println("정적 멤버 클래스에서 바깥 클래스의 인스턴스 멤버는 사용하지 못한다. ");
			System.out.println("field2: " + field2);
		}
	}
	
}
