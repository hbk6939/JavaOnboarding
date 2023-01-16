package a.OOP;

class MyClass2 {
//	final int num = 20; // 인스턴스 상수는 이런식으로 하지 않고 생성자에서 초기화
	final int num;

	public MyClass2(int num) {
		this.num = num;
	}
	
	void func() {
//		this.num = num; // num은 상수라 변경 X
	}
}

public class FinalTest {
	public static void main(String[] args) {

	}
}
