package codingmentor.shop.dto;

public class User {
	public String userId;
	public String password;
	public String name;
	public int shopId;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String password, String name) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
	}

	public User(String userId, String password, String name, int shopId) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.shopId = shopId;
	}

}
