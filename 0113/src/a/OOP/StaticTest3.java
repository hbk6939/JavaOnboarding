package a.OOP;

class MyClass3 {
	static int[] narr = new int[10];
	static {
		for (int i : narr) {
			i = (int)(Math.random()*100)+1;
		}
	}
}

public class StaticTest3 {
	public static void main(String[] args) {
		System.out.println(MyClass3.narr.toString());
	}
}
