package a.oper;

public class OperTest1 {

	public static void main(String[] args) {
		int n = 10, m = 10;
		int bn = ++n;
		int am = m++;
		System.out.println(bn); // 11
		System.out.println(am); // 10
		System.out.println();
		
		// 이항연산자 특징 3
		int a = 1000000; // 1,000,000
		int b = 2000000; // 2,000,000
		long aa = a*b; // 오버플로우
		long bb = (long)a*b; // 하나만 미리 long으로 캐스팅 해야함
		System.out.println(aa);
		System.out.println(bb);
		System.out.println();
		
		// 반올림
		float pi = 3.141592f;
		System.out.println(Math.round(pi));
		System.out.println();
		
		// 비교연산자
		double d = (float)0.1f;
		float f = (float) 0.1;
		System.out.println(d);
		System.out.println(f);
		
		if (0.1d == 0.1f) {
			System.out.println("0.1d == 0.1f");
		}else {
			System.out.println("0.1d != 0.1f");
		}
	}

}
