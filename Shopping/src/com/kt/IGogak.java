package com.kt;

import com.kt.entity.Product;

public interface IGogak {
	void saleProductList(Product[] product);
	void addProduct(Product product);
	void printBasket();
}