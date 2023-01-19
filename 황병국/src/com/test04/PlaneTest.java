package com.test04;

import java.util.ArrayList;
import java.util.List;

public class PlaneTest {

	public static void main(String[] args) {
		// Airplane과 Cargoplane 객체생성
		List<Plane> planes = new ArrayList<>();
		planes.add(new Airplane("L777", 1000));
		planes.add(new Cargoplane("C50", 1000));

		// 생성된 객체의 정보 출력
		System.out.println("Plane fuelSize\n--------------------");
		for (Plane plane : planes) {
			System.out.println(plane);
		}

		// Airplane과 Cargoplane 객체에 100씩 운항
		System.out.println("100 운항");
		for (Plane plane : planes) {
			plane.flight(100);
		}

		// 운항후 객체의 변경된 정보 출력
		System.out.println("\nPlane fuelSize\n--------------------");
		for (Plane plane : planes) {
			System.out.println(plane);
		}

		// Airplane과 Cargoplane 객체에 200씩 주유
		System.out.println("200 주유");
		for (Plane plane : planes) {
			plane.refuel(200);
		}

		// 주유후 객체의 변경된 정보 출력
		System.out.println("\nPlane fuelSize\n--------------------");
		for (Plane plane : planes) {
			System.out.println(plane);
		}
	}

}
