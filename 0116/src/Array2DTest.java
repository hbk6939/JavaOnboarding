public class Array2DTest {

	public static void main(String[] args) {

//		int[] arr1 = {1, 2, 3, 4};
//		int[][] arr2 = {{10, 20, 30, 40}, {1, 2, 3, 4,}, {100, 200, 300, 400}};
		
		int[][] arr3 = new int[4][5];
		arr3[0] = new int[]{10, 20, 30, 40, 0};
		arr3[1] = new int[]{1, 2, 3, 4, 0};
		arr3[2] = new int[]{100, 200, 300, 400, 0};

		System.out.println(arr3.length);
		System.out.println(arr3[3].length);
		
		int rowMaxIdx = arr3.length-1;
		int colMaxIdx = arr3[0].length-1;

		for (int i = 0; i < arr3.length-1; i++) {
			for (int j = 0; j < arr3[3].length-1; j++) {
				arr3[i][colMaxIdx] += arr3[i][j];
				arr3[rowMaxIdx][j] += arr3[i][j];
			}
		}
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[rowMaxIdx][colMaxIdx] += arr3[i][arr3[3].length-1];
		}

		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[3].length; j++) {
				System.out.printf("%-5d", arr3[i][j]);
			}
			System.out.println();
		}
		
	}

}
