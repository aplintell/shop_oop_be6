package codingmentor.shop;

import java.util.Scanner;

import codingmentor.shop.dto.Shop;
import codingmentor.shop.dto.User;
import codingmentor.shop.service.ShopService;
import codingmentor.shop.service.UserService;

public class ShopMain {

	static UserService userService = new UserService();
	static ShopService shopService = new ShopService();
	static Scanner scanner = new Scanner(System.in);
	static User user; 
	static Shop shop;

	public static void main(String[] args) {
		user = login();
		shop = shopService.getShopById(user.shopId);
		System.out.println("Hello " + user.name);
	}

	public static User login() {
		System.out.println("Please input userId: ");
		String userId = scanner.nextLine();
		System.out.println("Please input password: ");
		String password = scanner.nextLine();
		return userService.login(userId, password);
	}

}
