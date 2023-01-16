package com.kt;

import com.kt.entity.Computer;
import com.kt.entity.Product;
import com.kt.entity.Refrigerator;
import com.kt.entity.TV;

public class Gogak {
	private int money;
	private Product[] basket = new Product[5];
	private int count;
	private static int totalPrice = 0;
	private static int tvCnt = 0, comCnt = 0, refCnt = 0;

	public Gogak(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	// 1) 상품추가
	public void addProduct(Product product) {
		// 돈 부족
		if (money < product.getPrice()) {
			System.out.println("잔액이 부족하여 " + product.getName() + "구매불가\n");
			return;
		}

		// 바구니가 꽉 찻을 경우 -> 큰바구니 교환
		if (basket.length <= count) {
			Product[] newBasket = new Product[basket.length * 2];
			System.arraycopy(basket, 0, newBasket, 0, basket.length);
			basket = newBasket;
		}

		basket[count++] = product;
		money -= product.getPrice();
	
		System.out.println(product.getName() + "가격 : " + product.getPrice());
		System.out.println("잔액 : " + money);
		System.out.println();
	}

	// 2) 판매 제품 목록 및 잔액
	public void printBasket() {
		// 구매 목록과 잔액을 출력
		// Cpmputer : 1개
		// TV : 2개
		// 잔액 : 5000원
		for (int i = 0; i < count; i++) {
			if (basket[i] instanceof TV) {
				tvCnt++;
			} else if (basket[i] instanceof Computer) {
				comCnt++;
			} else if (basket[i] instanceof Refrigerator) {
				refCnt++;
			}
			totalPrice += basket[i].getPrice();
		}
		
		System.out.println("\n[구매내역 및 잔액]");
		if (comCnt > 0)
			System.out.printf("Computer : %d개\n", comCnt);
		if (tvCnt > 0)
			System.out.printf("TV : %d개\n", tvCnt);
		if (refCnt > 0)
			System.out.printf("Refrigerator : %d개\n", refCnt);
		
		System.out.printf("사용금액 : %d\n", totalPrice);
		System.out.printf("잔액 : %d\n\n", money);
	}

	// 3) 구매내역

}
