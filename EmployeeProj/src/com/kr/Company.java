package com.kr;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;

import com.kr.emp.Employee;
import com.kr.emp.IBusinessTrip;

public class Company {
	HashMap<Integer, Employee> emps = new HashMap<>();
	
//	Employee[] emps = new Employee[10];
//	int count = 0;

	// 직원 등록
	public void regEmployee(Employee emp) {
		emps.put(emp.getId() , emp);
	}

	// 모든 직원명 호출
	public void printAllEmployee() {
		for (Integer id : emps.keySet()) {
			System.out.println(emps.get(id));
		}
	}

	// 
	public String getTotalPay() {
		DecimalFormat decFormat = new DecimalFormat("###,###");

		int totalPay = 0;
		Iterator<Integer> keys = emps.keySet().iterator();
		while (keys.hasNext()) {
		    totalPay += keys.next();
		}

		return decFormat.format(totalPay);
	}

	public void regBusinessTrip(IBusinessTrip ibt, int day) {
		ibt.goBusinessTrip(day);
		System.out.println(day + "일간 출장");
	}

}
