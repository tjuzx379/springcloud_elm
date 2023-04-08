package com.neusoft.po;

import java.util.List;

public class Orders {
    private  int orderId;
    private  int businessId;
    private  int daId;
    private  int orderState;
    private  String userId;
    private  String orderDate;
    private  double orderTotal;

    //多对一
    private Business business;
    //一对多
    private List<OrderDetailet> list;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public int getDaId() {
		return daId;
	}
	public void setDaId(int daId) {
		this.daId = daId;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public List<OrderDetailet> getList() {
		return list;
	}
	public void setList(List<OrderDetailet> list) {
		this.list = list;
	}
    
    

    
}
