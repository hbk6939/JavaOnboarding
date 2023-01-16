package d.array;

import java.util.Arrays;

public class a_array {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		int idx1 = (int) (Math.random() * 45);
		int idx2 = (int) (Math.random() * 45);
		
		for (int i = 0; i < 100; i++) {
			if (idx1 != idx2) {
				int temp = ball[idx1];
				ball[idx1] = ball[idx2];
				ball[idx2] = temp;
			}
		}
		
		System.out.println(Arrays.toString(ball));
		
	}

}
