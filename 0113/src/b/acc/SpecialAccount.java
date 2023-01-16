package b.acc;

public class SpecialAccount extends Account {
	private String grade;
	private double rate;

	// 생성자
	public SpecialAccount() {
		super();
	}

	public SpecialAccount(int num, String name, int balance, String grade) {
		super(num, name, balance);
		this.grade = grade;
		setGrade(grade);
	}

	// getter setter
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		switch (this.grade) {
		case "VIP":
			rate = 0.04;
			break;
		case "GOLD":
			rate = 0.03;
			break;
		case "SILVER":
			rate = 0.02;
			break;
		default:
			rate = 0.01;
			break;
		}
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + ", 등급 : " + grade;
	}

	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		double addInterest = (rate+1)*money;
		int m = (int)addInterest;
//		System.out.println("이자율 : " + rate);
//		System.out.println("금액 : " + addInterest);
		super.deposit(m);
	}
	
	

}
