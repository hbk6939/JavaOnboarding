package tryCatch;

public class TryCatchTest {
	public static void main(String[] args) {
		int[] arr1 = {5, 4, 10, 20, 30};
		int[] arr2 = {1, 2, 0, 5};

		for (int i = 0; i < arr1.length; i++) {
			// for문 안에 예외처리
			try {
				System.out.println(arr1[i] / arr2[i]);
			} catch (ArithmeticException ae) {
				System.out.println(0);
			} catch (ArrayIndexOutOfBoundsException arre) {
				System.out.println(0);
			}
		}
		System.out.println();
		
		// for 문 밖 예외처리
		try {
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i] / arr2[i]);
			}	
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (ArrayIndexOutOfBoundsException arre) {
			System.out.println(arre);
		}
		

	}

}
