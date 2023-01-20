package ch04.verify;

import java.util.Scanner;

public class Q7_2 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1. 예금 2. 출금 3. 잔고 확인 4. 종료");
			System.out.println("------------------------------");
			System.out.println("선택>");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: 
				System.out.println("예금액>");
				balance += scanner.nextInt();
				break;
			
			case 2: 
				System.out.println("출금액>");
				balance -= scanner.nextInt();
				break;
			
			case 3: 
				System.out.println("잔고 확인");
				System.out.println("잔고는 " + balance + "원입니다.");
				break;
			
			case 4: 
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			
			default: 
				System.out.println("1~4 중에 선택하세요.");
				break;
			
			}
		}
	}

}
