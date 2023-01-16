package a.OOP;

import b.acc.Account;
import b.acc.SpecialAccount;

public class AccountTest {
	public static void main(String[] args) {
		SpecialAccount sacc = new SpecialAccount(100, "홍길동", 10000, "VIP");

		System.out.println(sacc.info());
		sacc.deposit(1000);
		System.out.println(sacc.info());

		// upcasting : 자식객체를 부모타입의 래퍼런스 변수에 담을 수 있다
		Account acc = new SpecialAccount(101, "고길동", 20000, "GOLD");
		System.out.println("\n" + acc.info());
		SpecialAccount ssacc = (SpecialAccount)acc;
		
		// 다형성
		// upcasting 후 오버라이딩 한 메소드 호출시 자식 메소드 호출
		System.out.println("\nupcasting 후 오버라이딩\n" + acc.info());
		System.out.println("\n" + ssacc.info());

	}
}
