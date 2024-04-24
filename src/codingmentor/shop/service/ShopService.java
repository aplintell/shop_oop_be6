package codingmentor.shop.service;

import codingmentor.shop.dto.Shop;

public class ShopService {
	
	public Shop getShopById(int id) {
		return new Shop(id, "ShopA");
	}

}
