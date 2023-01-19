package com.test04;

public class Cargoplane extends Plane {

	public Cargoplane() {
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		int dist = distance * 5;
		setFuelSize(getFuelSize() - dist);
	}

}
