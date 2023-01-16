package e.OOP;

class Test {
	void tfunc1() {
		System.out.println("tfunc1 인스턴스 매서드");
	}
	static void tfunc2() {
		System.out.println("tfunc2 클래스 매서드");
	}
}

public class StaticTest {
	public static void func1() {
		System.out.println("func1 클래스 매서드");
	} // 클래스 매서드

	public void func2() {
		System.out.println("func2 인스턴스 매서드");
	} // 인스턴스 매서드

	public static void main(String[] args) {
		func1(); // 클래스 매서드 호출
		StaticTest st = new StaticTest();
		st.func2();
		
		Test t = new Test();
		Test.tfunc2();
		t.tfunc1();
	}

}
