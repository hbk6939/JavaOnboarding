package com.test05;

import java.util.HashMap;

public class Company {
	public static void main(String[] args) {

		HashMap<Integer, Employee> emps = new HashMap<>();
		
		Secretary e1 = new Secretary("홍길동", 1, "Secretary", 800);
		Sales e2 = new Sales("이순신", 2, "Sales", 1200);

		// 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다.
		// HashMap에 저장시 키 값은 각 객체의 Number로 한다.
		emps.put(e1.getNumber(), e1);
		emps.put(e2.getNumber(), e2);

		// 모든 객체의 기본 정보를 출력한다. ( for문 이용 , keySet() 이용 )
		System.out.println("  name       department     salary\n------------------------------------------");
		for (Integer key : emps.keySet()) {
			System.out.println(emps.get(key));
		}

		// 모든 객체의 인센티브 100씩 지급한다.
		for (Integer key : emps.keySet()) {
			Bonus b =  (Bonus) emps.get(key);
			b.incentive(100);
		}
		System.out.println("\n인센티브100지급\n");

		// 모든 객체의 정보와 세금을 출력한다. ( for문 이용 )
		System.out.println("  name       department     salary    tax\n------------------------------------------");
		for (Integer key : emps.keySet()) {
			System.out.println(emps.get(key) + "   " + String.format("%.2f", emps.get(key).tax()) );
		}
	}

}
