package a.OOP;

import java.util.ArrayList;
import java.util.Iterator;

import b.acc.Account;
import b.acc.SpecialAccount;

public class Bank {
	ArrayList<Account> accs = new ArrayList<>();
//	Account[] accs = new Account[100];
//	int count = 0;

	void makeAccount(Account acc) {
		accs.add(acc);
	}

	void printAllAccount() {
		for (Account acc : accs) {
			System.out.println(acc.info());
		}
	}

	void printSpecialAccount() {
		Iterator<Account> it = accs.iterator();
		while (it.hasNext()) {
			Account acc = it.next();
			if (acc instanceof SpecialAccount) {
				System.out.println(acc.info());
			}
		}

		// for문으로 사용하면
		for (Iterator<Account> iterator = accs.iterator(); iterator.hasNext();) {
			Account account = iterator.next();
			if (account instanceof SpecialAccount) {
				System.out.println("for문 - " + account.info());
			}
		}
		
	}

	void printSpecialAccount(String grade) {
		for (Account acc : accs) {
			if (acc instanceof SpecialAccount) {
				SpecialAccount sacc = (SpecialAccount) acc;
				if (sacc.getGrade().equals(grade)) {
					System.out.println(sacc.info());
				}
			}
		}
	}

	void printAccount() {
		Iterator<Account> it = accs.iterator();
		while (it.hasNext()) {
			Account acc = it.next();
			if (!(acc instanceof SpecialAccount)) {
				System.out.println(acc.info());
			}
		}
	}
}
