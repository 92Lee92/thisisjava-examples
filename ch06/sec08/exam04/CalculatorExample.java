package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 생성
		Calculator myCalcu = new Calculator();
		
		// 정사각형의 넓이 구하기
		double area1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double area2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 = " + area1);
		System.out.println("직사각형의 넓이 = " + area2);
	}

}
