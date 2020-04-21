package com.adp.adapter.pattern;

public class Broomstick implements GroceryItem {
	
	private String name;
	
	private int price;
	
	public Broomstick(String item, int price) {
		this.name = item;
		this.price = price;
	}

	@Override
	public String getItemName() {
		return name;
	}

	@Override
	public int getCostPerUnit() {
		return price;
	}

}
