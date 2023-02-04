package ch09.sec04.exam01;

public class A {
	// 생성자
	A() {
		// 로컬 클래스 선언
		class B{
			B(){
				System.out.println("A 생성자 안에있는 로컬클래스 B의 생성자 실행");
			}
		}
		
		// 로컬 객체 생성
		B b = new B();
	}
	
	// 메소드
	void method() {
		// 로컬 클래스 선언	// 이름 같아도 문제 없다
		class B {
			B(){
				System.out.println("A의 메소드 안에 있는 로컬클래스 B의 생성자 실행");
			}
		}
		
		// 로컬 객체 생성]
		B b = new B();
	}
	
}
