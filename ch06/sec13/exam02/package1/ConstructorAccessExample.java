package ch06.sec13.exam02.package1;

import ch06.sec13.exam02.package2.C;

public class ConstructorAccessExample {

	public static void main(String[] args) {
		A a1 = new A(true);
		B b1 = new B();
		C c1 = new C();

		A aA1 = a1.a1;
		System.out.println(aA1);	//main에서 StackOverFlowError
//		A bA1A1 = b1.a1.a1;
//		System.out.println(bA1A1.toString());
//		
		
	}

}
