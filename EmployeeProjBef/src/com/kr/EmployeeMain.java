package com.kr;

public class EmployeeMain {

	public static void main(String[] args) {
		Company com = new Company();
		com.reEmployee(new Permanent(101, "홍길동", 100000));
		com.reEmployee(new PartTime(102, "김길동", 80000, 50000));
		com.reEmployee(new PartTime(103, "고길동", 1000, 160));
		com.printAllEmployee();
		
		System.out.println("총 급여 : " + com.getTotalPay());
	}

}
