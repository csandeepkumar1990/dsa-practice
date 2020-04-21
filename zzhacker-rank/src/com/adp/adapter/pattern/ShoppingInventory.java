package com.adp.adapter.pattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingInventory {
	
	private List<Product> listOfProducts = new ArrayList<>();
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
	public static void main(String[] args) {
		ShoppingInventory inventory = new ShoppingInventory();
		inventory.addProduct(new Oil("Golddrop Sunflower Oil", 110));
		GroceryItemAdapter adapter = new GroceryItemAdapter();
		adapter.setItem(new Broomstick("ITC Broom stick", 25));
		inventory.addProduct(adapter);
		inventory.displayAllProducts();
	}
	
	
	public void displayAllProducts() {
		for (Product product : listOfProducts) {
			System.out.println(product.getName() + " " + product.getPrice() );
		}
	}

}
