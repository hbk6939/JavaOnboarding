package a.OOP;

class Product {
	static int sum;
	int serialNum;

	public Product() {
		serialNum = ++sum;
	}
}

public class StaticTest2 {
	public static void main(String[] args) {
		Product[] pros = new Product[] { new Product(), new Product(), new Product() };

		// 배열 요소로 접근
		for (int i = 0; i < pros.length; i++) {
			System.out.println(pros[i]); // 참조값 to 힙 인스턴스
			System.out.println(pros[i].serialNum);
		}

		System.out.println();

		// 향상된 for문
		for (Product product : pros) {
			System.out.println(product);
			System.out.println(product.serialNum);
		}
	}
}
