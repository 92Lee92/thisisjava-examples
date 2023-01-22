package ch05.sec09;
//Systems.arraycopy 써보려고 만듦
public class ArrayCopyBySystemArraycopy {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = new int[6];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for (int i = 0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i] + ",");
		}
		System.out.println();
		for (int i = 0 ; i<arr2.length ; i++) {
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		System.out.println("arr1.length : " + arr1.length + ", arr2.length : " + arr2.length);
	}

}
