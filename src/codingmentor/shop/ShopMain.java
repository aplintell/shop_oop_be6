package codingmentor.shop;

import java.util.ArrayList;
import java.util.Scanner;

import codingmentor.shop.dto.Cart;
import codingmentor.shop.dto.ItemInCart;
import codingmentor.shop.dto.Menu;
import codingmentor.shop.entity.Product;
import codingmentor.shop.entity.Shop;
import codingmentor.shop.entity.User;
import codingmentor.shop.service.ShopService;
import codingmentor.shop.service.UserService;

public class ShopMain {

	static UserService userService = new UserService();
	static ShopService shopService = new ShopService();
	static Scanner scanner = new Scanner(System.in);
	static User user;
	static Shop shop;
	static Menu menu;
	static Cart cart;

	public static void main(String[] args) {
		user = dologin();
		shop = shopService.getById(user.shopId);

		menu = new Menu(shop);

		cart = new Cart();
		System.out.println("Shop " + shop.name + ", Welcome " + user.name);

		int userSelection = showMainMenuAndGetSelection();

		if (userSelection == 1) {
			// show CART
		} else if (userSelection == menu.menuOptions.size()) {
			// show RANK
		} else {
			int productIndex = userSelection - menu.menuOptions.size();
			Product product = menu.productsOptions.get(productIndex);
			ItemInCart item = new ItemInCart(product, 1);
			cart.items.add(item);
		}

	}

	public static User dologin() {
		User user = null;
		do {
			System.out.println("Please input userId: ");
			String userId = scanner.nextLine();
			System.out.println("Please input password: ");
			String password = scanner.nextLine();
			user = userService.getUserByUserIdAndPassword(userId, password);
			if (user == null) {
				System.out.println("Login Failed. Please Input Again");
			}
		} while (user == null);

		return user;
	}

	public static int showMainMenuAndGetSelection() {
		System.out.println("==============================");
		System.out.println("Main Menu");
		int i = 1;
		for (String menuOption : menu.menuOptions) {
			System.out.println(i + ". " + menuOption);
			i++;
		}

		for (Product product : menu.productsOptions) {
			System.out.println(i + ". " + product.name + ": " + product.price + "AUD");
			i++;
		}
		System.out.println("==============================");

		System.out.println("Please select an option !!!");
		return scanner.nextInt();
	}
}
