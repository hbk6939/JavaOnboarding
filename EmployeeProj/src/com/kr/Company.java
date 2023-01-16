package com.kr;

import java.text.DecimalFormat;

import com.kr.emp.Employee;
import com.kr.emp.IBusinessTrip;
import com.kr.emp.Permanent;

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

	public void regBusinessTrip(IBusinessTrip ibt, int day) {
		ibt.goBusinessTrip(day);
		System.out.println(day + "일간 출장");
	}

}
