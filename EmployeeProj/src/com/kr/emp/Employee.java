package com.kr.emp;

public abstract class Employee {
	private int id;
	private String name;

	public Employee() {
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract int getPay();

	@Override
	public String toString() {
		return "사번 : " + id + ", 이름 : " + name;
	}

	public Integer getId() {
		return id;
	}
}
