package ch04.verify;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String choice = "";
		int balance = 0;
		while (!choice.equals("4")) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			choice = scanner.nextLine();
			System.out.println("선택>" + choice);
			switch (choice) {
			case "1":
				String deposit = scanner.nextLine();
				balance += Integer.parseInt(deposit);
				System.out.println("예금액>" + deposit);
				System.out.println();
				continue;
			case "2":
				String withdraw = scanner.nextLine();
				balance -= Integer.parseInt(withdraw);
				System.out.println("출금액>" + withdraw);
				System.out.println();
				continue;
			case "3":
				System.out.println("잔고>" + balance);
				System.out.println();
				continue;
			default:
				System.out.println();
				System.out.println("프로그램 종료");
			}
		}
	}

}
