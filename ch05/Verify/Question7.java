package ch05.Verify;

public class Question7 {

	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2 } ;
		int max = Integer.MIN_VALUE;
		for ( int i = 0 ; i < array.length; i ++ ) {
			if (array[i] >= max ) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
