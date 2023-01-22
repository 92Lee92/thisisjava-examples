package ch05.sec09;

//Object.clone()을 이용한 배열의 복사를 보려고 만듦
public class ArrayCopyByObejctClone {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1.clone();
		
		for(int i = 0 ; i<arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		for(int i = 0 ; i<arr2.length; i++) {
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		
		for (int i = 0 ; i<arr1.length ; i++ ) {
			arr1[i] = arr1[i] + 1;
		}
		for(int i = 0 ; i<arr1.length; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		for(int i = 0 ; i<arr2.length; i++) {
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		
		int[] arr3 = new int[6];
		arr3 = arr1.clone();
		for(int i = 0 ; i<arr3.length; i++) {
			System.out.print(arr3[i] + ",");
		}
		System.out.println();
		System.out.println(arr3.length);
		
		
	}

}
