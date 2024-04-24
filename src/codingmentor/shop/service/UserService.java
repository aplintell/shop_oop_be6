package codingmentor.shop.service;

import codingmentor.shop.dto.User;

public class UserService {
	
	public User login(String userId, String password) {
		return new User(userId, password, "Dung", 1);
	}

}
