package a.OOP;

import b.acc.Account;

public class ClassTest1 {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "홍길동", 100000);
//		acc1.num = 1001;
//		acc1.name = "홍길동";
//		acc1.balance = 100000;
		acc1.deposit(10000);

		System.out.println(acc1.info());

		Account acc2 = new Account(1002, "고길동", 200000);
//		acc2.num = 1002;
//		acc2.name = "고길동";
//		acc2.balance = 200000;
		acc2.withdraw(20000);

		System.out.println(acc2.info());
	}

}
