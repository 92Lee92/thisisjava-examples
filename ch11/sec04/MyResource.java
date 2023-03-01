package ch11.sec04;

public class MyResource implements AutoCloseable {
	private String name;
	public MyResource(String name ) {
		this.name = name;
		System.out.println("MyResource" + name + "열기");
	}
	public
}
