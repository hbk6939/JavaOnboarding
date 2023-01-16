package innerClass;

class Number {
	int m = 10;

	int method() {
		return m;
	}
}

public class AnonyClassTest { // 익명클래스
	public static void main(String[] args) {
		Number number = new Number() {
			int n = 20;

			@Override
			int method() {
				return super.method() + n;
			}
		};
		System.out.println(number.method());
	}
}
