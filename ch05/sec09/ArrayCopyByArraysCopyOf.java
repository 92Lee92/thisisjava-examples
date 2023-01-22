package ch05.sec09;

import java.util.Arrays;

//Arrays.copyOf() 와 Arrays.copyOfRange() 써보기
public class ArrayCopyByArraysCopyOf {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 배열 전체를 복사
		int[] arr3 = Arrays.copyOf(arr1, 9); // arr3의 길이는 9, arr1전체를 복사한 뒤 남는 공간은 0이 저장됨 // [1, 2, 3, 4, 0, 0, 0, 0, 0 ]
		int[] arr4 = Arrays.copyOf(arr1, 2); // arr4의 길이는 2, arr1의 1번 인덱스값까지 복사됨 [1,2]
		int[] arr5 = Arrays.copyOfRange(arr1, 1, 3); // arr1의 1번 인덱스에서 2번 인덱스까지 복사됨 [2, 3]
		int[] arr6 = Arrays.copyOfRange(arr1, 2, 7); // arr6의 길이는 5, arr1의 2번 인덱스부터 복사, arr1의 범 위를 벗어난 인덱스는 0으로 채워져 복사됨.

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		System.out.println("arr1.length : " + arr1.length);
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		System.out.println("arr2.length : " + arr2.length);
		System.out.println();

		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + ",");
		}
		System.out.println();
		System.out.println("arr3.length : " + arr3.length);
		System.out.println();

		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + ",");
		}
		System.out.println();
		System.out.println("arr4.length : " + arr4.length);
		System.out.println();

		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + ",");
		}
		System.out.println();
		System.out.println("arr5.length : " + arr5.length);
		System.out.println();

		for (int i = 0; i < arr6.length; i++) {
			System.out.print(arr6[i] + ",");
		}
		System.out.println();
		System.out.println();
		System.out.println("arr6.length : " + arr6.length);
	}

}
