package codingmentor.shop.service;

import java.util.ArrayList;

import codingmentor.shop.entity.Shop;

public abstract class Service<T> {

	public ArrayList<T> getAll() {
		System.out.println("This functions is not implemented yet");
		return null;
	}

	public ArrayList<T> getAllByShop(Shop shop) {
		System.out.println("This functions is not implemented yet");
		return null;
	}

	public abstract T getById(int id);

	public abstract T save();

}
