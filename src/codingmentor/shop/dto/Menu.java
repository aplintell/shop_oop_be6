package codingmentor.shop.dto;

import java.util.ArrayList;

import codingmentor.shop.entity.Product;
import codingmentor.shop.entity.Shop;
import codingmentor.shop.service.ProductService;

public class Menu {

	public ArrayList<String> menuOptions = new ArrayList<String>();
	public ArrayList<Product> productsOptions = new ArrayList<Product>();
	public ArrayList<String> shippingOptions;

	public Menu(Shop shop) {
		this.menuOptions.add("View Cart");

		if (shop.hasUserRank) {
			this.menuOptions.add("View Rank");
		}

		ProductService productService = new ProductService();
		this.productsOptions = productService.getAllByShop(shop);

		if (shop.hasShippingMethods) {
			this.shippingOptions = new ArrayList<String>();
			this.shippingOptions.add("Saving");
			this.shippingOptions.add("Fast");
			this.shippingOptions.add("Basic");
		}
	}

}
