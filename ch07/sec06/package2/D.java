package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
	// 생성자 선언
	public D() {
		// A() 생성자 호출
		super();	// 호출 가능
	}

	// 메소드 선언
	public void method1() {
		// A 필드값 변경
		this.field = "value";	// 조상의 필드에 접근 가능
		// A 메소드 호출
		this.method();			// 조상의 메소드 호출 가능
	}

	// 메소드 선언
	public void method2() {
//		A a = new A();			// 직접 객체를 생성해서 사용할 수 없다.
//		a.field = "value";		// 직접 객체를 생성해서 사용할 수 없다.
//		a.method();				// 직접 객체를 생성해서 사용할 수 없다.
	}
}
