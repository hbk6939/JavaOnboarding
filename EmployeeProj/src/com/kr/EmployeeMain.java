package com.kr;

import com.kr.emp.Company;

public class EmployeeMain {

	public static void main(String[] args) {
		Company com = new Company();
		com.regEmployee(new Permanent(101, "홍길동", 40000000));
		com.regEmployee(new PartTime(102, "김길동", 2400, 12000));
		com.regEmployee(new PartTime(103, "고길동", 2400, 9600));
		com.regEmployee(new Sales(104, "박길동", 34000000, 3600000));
		com.printAllEmployee();

		System.out.println("총 급여 : " + com.getTotalPay() + "원");
	}

}