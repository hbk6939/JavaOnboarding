package com.test04;

public class Airplane extends Plane {

	public Airplane() {
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		int dist = distance * 3;
		setFuelSize(getFuelSize() - dist);
	}

}
