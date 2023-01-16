package c.loop;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// 사용자 입력을 받을 때 do while문
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int data;
		
		do {
			data = sc.nextInt();
			sum += data;
		} while (data != 0);
		
		System.out.println(sum);
		sc.close();
	}
}
