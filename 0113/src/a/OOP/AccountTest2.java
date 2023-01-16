package a.OOP;

import b.acc.Account;
import b.acc.SpecialAccount;

public class AccountTest2 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.makeAccount(new Account(101, "홍길동", 10000));
		bank.makeAccount(new SpecialAccount(102, "고길동", 300000, "VIP"));
		bank.makeAccount(new SpecialAccount(103, "김길동", 200000, "GOLD"));

		System.out.println(" printAllAccount()");
		bank.printAllAccount();
		
		System.out.println("\n printSpecialAccount()");
		bank.printSpecialAccount();
		
		System.out.println("\n printAccount()");
		bank.printAccount();
		
		System.out.println("\n printSpecialAccount(\"VIP\")");
		bank.printSpecialAccount("VIP");
		
		System.out.println("\n printSpecialAccount(\"GOLD\")");
		bank.printSpecialAccount("GOLD");
	}

}
