package com.kr.vo;

public class Account {
	private String id;
	private String name;
	private int money;

	public Account(String id, String name, int money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
