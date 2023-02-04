package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
//		Car myCar = new Car();	// 기본 생성자 호출 못함
		
		// Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);

	}

}
