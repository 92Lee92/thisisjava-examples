package ch05.Verify;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			int choice = scanner.nextInt();
			System.out.println("선택>" + choice);
			switch (choice) {
			case 1:
				int number = scanner.nextInt();
				System.out.println("학생수>" + number);
				scores = new int[number];
				break;
			case 2:
				if (scores != null) {
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]>");
						int score = scanner.nextInt();
						scores[i] = score;
					}
					break;
				}
				System.out.println("1번을 입력해서 학생 수를 입력해주세요");
				break;
			case 3:
				if (scores != null) {
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "] :" + scores[i]);
					}
					break;
				}
				System.out.println("1번을 입력해서 학생 수를 입력해주세요");
				break;
			case 4:
				if (scores != null) {
					int sum = 0;
					int max = 0;
					for (int i = 0; i < scores.length; i++) {
						sum += scores[i];
						if (scores[i] >= max) {
							max = scores[i];
						}
					}
					double avg = (double) sum / scores.length;
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
					break;
				}
				System.out.println("1번을 입력해서 학생 수를 입력해주세요");
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("1번을 입력해서 학생 수를 입력해주세요");
				break;
			}

		}
	}

}
