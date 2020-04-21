package com.adp.adapter.pattern;

public class GroceryItemAdapter implements Product {

	private GroceryItem item;
	
	@Override
	public String getName() {
		return item.getItemName();
	}

	@Override
	public int getPrice() {
		return item.getCostPerUnit();
	}

	public GroceryItem getItem() {
		return item;
	}

	public void setItem(GroceryItem item) {
		this.item = item;
	}
	
}
