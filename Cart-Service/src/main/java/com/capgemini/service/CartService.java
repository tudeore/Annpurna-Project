package com.capgemini.service;

import com.capgemini.entity.Product;

public interface CartService {

	public void getCartById(Integer userId);
	
	public void RemoveFromCart();
	
	public void addToCart(Product product);
	
	public void updateCart();
	
}
