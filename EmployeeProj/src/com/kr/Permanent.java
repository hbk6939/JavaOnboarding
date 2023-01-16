package com.kr;

import java.text.DecimalFormat;

import com.kr.emp.Employee;

public class Permanent extends Employee {
	private int pay;

	DecimalFormat decFormat = new DecimalFormat("###,###");

	public Permanent(int id, String name, int pay) {
		super(id, name);
		this.pay = pay;
	}
	
	public int getPay() {
		return pay;
	}

	@Override
	public String toString() {
		return super.toString() + ", 급여 : " + decFormat.format(pay) + "원";
	}



}
