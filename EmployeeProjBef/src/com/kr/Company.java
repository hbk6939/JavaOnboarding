package com.kr;

public class Company {
	Employee[] emps = new Employee[10];
	int count = 0;

	public void reEmployee(Employee employee) {
		emps[count++] = employee;
	}

	public void printAllEmployee() {
		for (int i = 0; i < count; i++) {
			System.out.println(emps[i].toString());
		}
	}

	public String getTotalPay() {
		return "";
	}

}
