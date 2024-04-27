package codingmentor.shop.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import codingmentor.shop.entity.Product;
import codingmentor.shop.entity.Shop;

public class ProductService extends Service<Product> {

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> getAllByShop(Shop shop) {
		ArrayList<Product> datas = null;
		try {
			datas = new ArrayList<Product>();
			File myObj = new File("resource/shop-" + shop.id + "/products.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitDatas = data.split(",");
				datas.add(new Product(Integer.parseInt(splitDatas[0]), splitDatas[1], Integer.parseInt(splitDatas[2])));
			}
			myReader.close();
			return datas;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return datas;
	}

}
