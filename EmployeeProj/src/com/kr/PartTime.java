package com.kr;

import java.text.DecimalFormat;

import com.kr.emp.Employee;

public class PartTime extends Employee {
	private int time;
	private int payPertime;

	public PartTime(int id, String name, int time, int payPertime) {
		super(id, name);
		this.time = time;
		this.payPertime = payPertime;
	}
	
	public int getPay() {
		return payPertime * time;
	}

	@Override
	public String toString() {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		return super.toString() + ", 급여 : " + decFormat.format(payPertime * time) + "원";
	}

}
