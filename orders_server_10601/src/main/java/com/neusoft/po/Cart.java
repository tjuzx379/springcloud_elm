package com.neusoft.po;

public class Cart {

	private int cartId;
	private int foodId;
	private int businessId;
	private String userId;
	private int quantity;
	
	 //多对一：所属食品
	 private Food food;
	 public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	//多对一：所属商家
	 private Business business;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getBusinessId() {
		return businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
