package a.OOP;

class Calculator {
	int val1;
	int val2;

	public Calculator() {
	}

	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	// method overloading
	int add() {
		return val1 + val2;
	}

	int add(int data1, int data2) {
		return data1 + data2;
	}

	int add(int d1, int d2, int d3) {
		return d1 + d2 + d3;
	}

	double add(Double d1, int d2, int d3) {
		return d1 + d2 + d3;
	}
}

public class MethodTest1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.val1 = 10;
		cal.val2 = 20;
		System.out.println("cal.add() : " + cal.add());
		System.out.println("cal.add(20, 30) : " + cal.add(20, 30));
		System.out.println("cal.add(20, 30, 40) : " + cal.add(20, 30, 40));
		System.out.println("cal.add(20.1, 30, 40) : " + cal.add(20.1, 30, 40));
	}
}
