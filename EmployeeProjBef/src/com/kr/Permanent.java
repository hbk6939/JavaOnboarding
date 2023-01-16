package com.kr;

public class Permanent extends Employee {
	int pay;

	
	public Permanent(int id, String name, int pay) {
		super(id, name);
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Permanent [pay=" + pay + ", id=" + id + ", name=" + name + "]";
	}

	public int getPay() {
		return pay;
	}

}
