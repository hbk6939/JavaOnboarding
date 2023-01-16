package com.kr;

public class Sales extends Permanent {
	int incentive;
	
	
	public Sales(int id, String name, int pay, int incentive) {
		super(id, name, pay);
		this.incentive = incentive;
	}

	@Override
	public int getPay() {
		return super.getPay();
	}
	
}
