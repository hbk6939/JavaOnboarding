package com.kr.emp;

import java.text.DecimalFormat;

public class Sales extends Permanent implements IBusinessTrip {
	private int incentive;

	DecimalFormat decFormat = new DecimalFormat("###,###");

	public Sales(int id, String name, int pay, int incentive) {
		super(id, name, pay);
		this.incentive = incentive;
	}

	@Override
	public int getPay() {
		return super.getPay() + incentive;
	}

	@Override
	public String toString() {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		return super.toString() + ", 인센티브 : " + decFormat.format(incentive) + ", 총급여 : "
				+ decFormat.format(super.getPay() + incentive);
	}

	@Override
	public void goBusinessTrip(int day) {
		System.out.println(day + "일");
	}

}
