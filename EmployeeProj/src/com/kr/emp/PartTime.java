package com.kr.emp;

import java.text.DecimalFormat;

public class PartTime extends Employee implements IBusinessTrip {
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

	@Override
	public void goBusinessTrip(int day) {
		System.out.println(day + "일");
	}

}
