package com.kr;

public class PartTime extends Employee {
	int time;
	int payPertime;

	
	public PartTime(int id, String name, int time, int payPertime) {
		super(id, name);
		this.time = time;
		this.payPertime = payPertime;
	}

	@Override
	public String toString() {
		return "PartTime [time=" + time + ", payPertime=" + payPertime + ", id=" + id + ", name=" + name + "]";
	}

	public int getPay() {
		return payPertime*time;
	}

}
