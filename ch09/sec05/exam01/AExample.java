package ch09.sec05.exam01;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		a.method1();
		A.method2();
		A.B b = a.new B();
		b.method();
		A.C c = new A.C();
		c.method();
		
	}

}
