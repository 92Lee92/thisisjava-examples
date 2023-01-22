package ch05.sec09;
// 배열 복사 결과 보려고 만듦
public class ArrayCopyIntExample {

	public static void main(String[] args) {
		int[] intArr1 = {1,2,3,4};
		int[] intArr2 = intArr1;	// 대입연산자를 이용
		
		System.out.println("intArr1[0] : " + intArr1[0] );
		System.out.println("intArr2[0] : " + intArr2[0] );
		
		intArr1[0] = 5;
		System.out.println("intArr1[0] : " + intArr1[0] );
		System.out.println("intArr2[0] : " + intArr2[0] );
		
		int[] intArr3 = {6, 7, 8, 9};
		int[] intArr4 = new int[intArr3.length];
		for (int i = 0 ; i < intArr3.length ; i++) {
			intArr4[i] = intArr3[i];
		}
		
		System.out.println("intArr3[0] : " + intArr3[0] );
		System.out.println("intArr4[0] : " + intArr4[0] );
		
		intArr3[0] = 5;
		System.out.println("intArr3[0] : " + intArr3[0] );
		System.out.println("intArr4[0] : " + intArr4[0] );
	}

}
