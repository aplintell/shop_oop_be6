package codingmentor.shop.dto;

import java.util.ArrayList;

public class Cart {
	
	public ArrayList<ItemInCart> items;
	public int total;
	
	public Cart() {
		this.items = new ArrayList<ItemInCart>();
		// TODO Auto-generated constructor stub
	}

}
