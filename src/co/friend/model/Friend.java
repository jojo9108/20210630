package co.friend.model;

public class Friend {

	// 구분, 이름, 연락처

	private String category;
	private String name;
	private String tel;

	public Friend() {

	}

	public Friend(String category, String name, String tel) {
		this.category = category;
		this.name = name;
		this.tel = tel;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public void showDetail() {
		System.out.println("==========================");
		String.format("구분 : %s 이름 : %s 전화 : %s" ,category, name, tel);
		System.out.println("==========================");
		
	}
	@Override
	public String toString() {
		return "Friend [category = " + category + ", name = " + name + ", tel = " + tel + "]";
	}

}
