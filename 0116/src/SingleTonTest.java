class Only {
	int n = 10;
	static Only only;

	private Only() {
	}
	public static Only getOnlyRef() {
		// 첫 접근이면 null이라 인스턴스 생성 -> 나중에는 null이 아니라 있는거 반환
		if (only == null)
			only = new Only();
		return only;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}

}

public class SingleTonTest {
	private SingleTonTest() {
	}
	SingleTonTest(int n) {
	}
	public static void main(String[] args) {
		Only o1 = Only.getOnlyRef(); // 인스턴스 없기에 즉, o1=null이라 only = new Only();
		System.out.printf("o1.getN() :%d\n", o1.getN());
		o1.setN(20);
		System.out.printf("o1.setN(20) -> o1.getN() :%d\n", o1.getN());

		Only o2 = Only.getOnlyRef(); // 인스턴스가 있기에 o2는 예전에 생성된 인스턴스 o1과 같다.
		System.out.printf("o2.getN() :%d [ o1 == o2 ]\n\n", o2.getN());

		SingleTonTest s1 = new SingleTonTest();
		SingleTonTest s2 = new SingleTonTest(20);
		System.out.printf("s1 : %s\n", s1);
		System.out.printf("s2 : %s", s2);
	}
}
