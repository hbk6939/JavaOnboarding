package com.kt;

import java.util.Scanner;

import com.kt.entity.Computer;
import com.kt.entity.Refrigerator;
import com.kt.entity.TV;

public class ShooppingMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Gogak gg = new Gogak(10000);

		while (true) {
			menu();
			int sel = Integer.parseInt(sc.next());
			if (sel == 0)
				break;

			switch (sel) {
			case 1:

				break;
			case 2:
				gg.addProduct(new Computer());
				break;
			case 3:
				gg.addProduct(new TV());
				break;
			case 4:
				gg.addProduct(new Refrigerator());
				break;
			case 5:
				gg.printBasket();
				break;

			default:
				gg.getMoney();
				break;
			}
		}
	}

	public static void menu() {
		System.out.println("[KT 마트]");
		System.out.println("1.판매 제품 목록 및 잔액 보기");
		System.out.println("2.Computer 구매");
		System.out.println("3.TV");
		System.out.println("4.Refrigerator 구매");
		System.out.println("5.구매목록 및 잔액 보기");
		System.out.println("0.종료");
		System.out.print("선택>>");
	}
}
