package com.kr;

import java.text.DecimalFormat;
import com.kr.emp.Employee;

public class Sales extends Permanent {
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
		return super.toString() + ", 인센티브 : " + incentive;
	}

}
