package com.kr.emp;

import java.text.DecimalFormat;

public class Company {
	Employee[] emps = new Employee[10];
	int count = 0;

	public void regEmployee(Employee employee) {
		emps[count++] = employee;
	}

	public void printAllEmployee() {
		for (int i = 0; i < count; i++) {
			System.out.println(emps[i].toString());
		}
	}

	public String getTotalPay() {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		
		int totalPay = 0;
		for (int i = 0; i < count; i++) {
			totalPay += emps[i].getPay();
		}
		return decFormat.format(totalPay);
	}

}
