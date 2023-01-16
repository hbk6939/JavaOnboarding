
public class Stucent extends Person {
	int num;
	String major;

	public Stucent() {
	}

	public Stucent(int age, String name, int num, String major) {
		super(age, name);
		this.num = num;
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + ", 학번" + num + ", 전공 : " + major;
	}
}

