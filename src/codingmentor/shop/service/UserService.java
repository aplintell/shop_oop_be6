package codingmentor.shop.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import codingmentor.shop.entity.Shop;
import codingmentor.shop.entity.User;

public class UserService extends Service<User> {

	public User getUserByUserIdAndPassword(String userId, String password) {
		ArrayList<User> users = this.getAll();
		for (User user : users) {
			if (user.userId.equals(userId) && user.password.equals(password)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public ArrayList<User> getAll() {
		ArrayList<User> users = null;
		try {
			users = new ArrayList<User>();
			File myObj = new File("resource/users.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitDatas = data.split(",");
				users.add(new User(splitDatas[0], splitDatas[1], splitDatas[2], Integer.parseInt(splitDatas[3])));
			}
			myReader.close();
			return users;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save() {
		// TODO Auto-generated method stub
		return null;
	}

}
