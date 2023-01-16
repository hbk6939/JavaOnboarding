class Base {
	private int pv = 1;
	protected int rv = 2;
	int dv = 2;
	public int bv = 4;
	void func() {
		pv = 10;
		rv = 20;
		dv = 30;
		bv = 40;
	}
}

class Derived extends Base {
	void method() {
		// pv=10; // 부모의 private 변수 접근 불가능
		rv = 20;
		dv = 30;
		bv = 40;
	}
}

public class AccessTest1 {
	public static void main(String[] args) {
		Base b = new Base();
		Derived d = new Derived();
		// d.pv = 100; // private 변수 접근 불가능
		// b.pv = 100; // private 변수 접근 불가능
		d.rv = 200; // protected는 같은 패키지 && 자식 클래스만 사용 가능
		d.dv = 300; // default는 같은 패키지 에서만
		d.bv = 400; // public은 어디서나
	}
}
