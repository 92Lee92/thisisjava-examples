package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldStrArray = {"java", "array", "copy"};
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		//배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//배열 항목 출력
		for (int i = 0 ; i < newStrArray.length ; i ++ ) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println();
		System.out.println(oldStrArray[0] == newStrArray[0]);
		
		// 궁금한거 TEST 참조변수를 저장하는 배열의 복사
		
		ArrayCopyReferenceExample[] arrayCopyReferenceExampleArr = new ArrayCopyReferenceExample[2];
		arrayCopyReferenceExampleArr[0] = new ArrayCopyReferenceExample();
		arrayCopyReferenceExampleArr[1] = new ArrayCopyReferenceExample();
		
		arrayCopyReferenceExampleArr[0].add(2, 4);
		arrayCopyReferenceExampleArr[1].add(1, 1);
		
		System.out.println(arrayCopyReferenceExampleArr[0].result);
		System.out.println(arrayCopyReferenceExampleArr[1].result);
		
		ArrayCopyReferenceExample[] arrayCopyReferenceExampleArr2 = new ArrayCopyReferenceExample[2];
		for ( int i = 0; i < arrayCopyReferenceExampleArr.length ; i++) {
			arrayCopyReferenceExampleArr2[i] = arrayCopyReferenceExampleArr[i];
		}
		System.out.println(arrayCopyReferenceExampleArr[0].result);
		System.out.println(arrayCopyReferenceExampleArr[1].result);
		System.out.println();
		System.out.println(arrayCopyReferenceExampleArr2[0].result);
		System.out.println(arrayCopyReferenceExampleArr2[1].result);
		System.out.println();
		arrayCopyReferenceExampleArr[0].result = 3;
		arrayCopyReferenceExampleArr[1].result = 5 ;
		System.out.println(arrayCopyReferenceExampleArr[0].result);
		System.out.println(arrayCopyReferenceExampleArr[1].result);
		System.out.println();
		System.out.println(arrayCopyReferenceExampleArr2[0].result);
		System.out.println(arrayCopyReferenceExampleArr2[1].result);
	}

}
