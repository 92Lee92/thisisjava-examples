package ch06.sec07.exam05;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자 선언
	Car(String model) {
		this(model, "silver", 250); // 다른 생성자 호출
	}

	Car(String model, String color) {
		this(model, color, 250); // 다른 생성자 호출
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
