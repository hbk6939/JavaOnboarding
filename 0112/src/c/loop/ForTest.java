package c.loop;

public class ForTest {

	public static void main(String[] args) {
		int dan = 0;
		for (dan = 2; dan < 10; dan++) {
			for (int i = 2; i < 10; i++) {
//				System.out.printf("%dx%d = %-6d", dan, i, dan*i);
				System.out.print(dan + "x" + i + "=" + String.format("%-6d",dan*i) );
			}
			System.out.println();
		}
		
		
		
//		dan=3;
//		int i = 2;
//		while (i < 10) {
//			System.out.printf("%dx%d ", dan, i++);
//		}
		
	}
}
