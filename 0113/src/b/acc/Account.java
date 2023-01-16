package b.acc;

public class Account {
	private int num;
	private String name;
	private int balance;

	public Account() {
	}

	public Account(int num, String name, int balance) { // 생성자
		this.num = num;
		this.name = name;
		this.balance = balance;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 고객 정보
	public String info() {
		return "번호 : " + num + ", 이름 : " + name + ", 잔액 : " + balance;
	}

	// 입급
	public void deposit(int money) {
		balance += money;
	}

	// 출금
	public void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
		}
	}
}