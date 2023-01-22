package ch05.sec09;

public class ArrayCopyRefVarArr {
	public static void main(String[] args) {
		RefVar[] refVar1 = new RefVar[] { new RefVar(1), new RefVar(2) };
		RefVar[] refVar2 = new RefVar[2];
		for (int i = 0 ; i < refVar1.length ; i ++) {
			refVar2[i] = refVar1[i];
		}
		
		for ( int i = 0 ; i < refVar1.length; i++) {
			System.out.print("refVar1[" +i+ "].result : "+refVar1[i].result +", " );
		}
		System.out.println();
		for ( int i = 0 ; i < refVar2.length; i++) {
			System.out.print("refVar2[" +i+ "].result : "+refVar1[i].result +", " );
		}
		
		System.out.println();
		System.out.println("refVar1[0]에 새 객체 저장 ");
		
		refVar1[0] = new RefVar(6);
		
		for ( int i = 0 ; i < refVar1.length; i++) {
			System.out.print("refVar1[" +i+ "].result : "+refVar1[i].result +", " );
		}
		System.out.println();
		for ( int i = 0 ; i < refVar2.length; i++) {
			System.out.print("refVar2[" +i + "].result : "+refVar2[i].result +", " );
		}
		System.out.println();
		System.out.println("refVar1[1]의 필드를 바꿈");
		
		refVar1[1].result = 99;
		
		for ( int i = 0 ; i < refVar1.length; i++) {
			System.out.print("refVar1[" +i+ "].result : "+refVar1[i].result +", " );
		}
		System.out.println();
		for ( int i = 0 ; i < refVar2.length; i++) {
			System.out.print("refVar2[" +i + "].result : "+refVar2[i].result +", " );
		}
		
	}

}
