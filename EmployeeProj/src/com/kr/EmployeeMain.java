package com.kr;

import com.kr.emp.PartTime;
import com.kr.emp.Permanent;
import com.kr.emp.Sales;

public class EmployeeMain {

	public static void main(String[] args) {
		Company com = new Company();

		Permanent emp1 = new Permanent(101, "홍길동", 100000);
		Sales emp2 = new Sales(102, "김길동", 800000, 50000);
		PartTime emp3 = new PartTime(103, "고길동", 1000, 160);
		
		com.regEmployee(emp1);
		com.regEmployee(emp2);
		com.regEmployee(emp3);

//		com.regBusinessTrip(emp1, 2); // Permanent는 IBusinessTrip을 implements 안했기에 오류
		com.regBusinessTrip(emp2, 3); 
		com.regBusinessTrip(emp3, 4);

		com.printAllEmployee();

		System.out.println("총 급여 : " + com.getTotalPay() + "원");
	}

}