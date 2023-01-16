package inerClass;

class Temp {
	int num = 10;
	static int sNum = 20;
	class Temp2 {
		int numT2 = num;
		int sNum2 = sNum;
	}
	static class Temp3 {
		// int numT3 = num; // static class에서 outer class 변수 사용 못함
		int sNum2 = sNum;
	}
	void method1() {
		// Temp2 class 생성
		Temp2 temp2 = new Temp2(); // Temp가 차피 생성되어야 하기에 바로 불러옴
		// Temp3 class 생성
		Temp3 temp3 = new Temp3();
	}
	static void method2() {
		// Temp2 class 생성
		Temp temp = new Temp(); // static이기에 먼저 불러와야
		Temp2 temp2 = temp.new Temp2();
		// Temp3 class 생성
		Temp3 temp3 = new Temp3();
	}
	void method3(int n) {
		int iv = 0;
		final int N = n; // 지역변수는 사라지기에 상수화
		class Temp4 {
			int numT4 = iv;
			int cNumT4 = N;
			void tMethod() {
				System.out.println(N);
			}
		}
	}
}

public class InnerClassTest1 {

	public static void main(String[] args) {
		// Temp2 class 생성
		Temp temp = new Temp();
		Temp.Temp2 temp2 = temp.new Temp2();

		// Temp3 class 생성
	}

}
