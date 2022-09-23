package com.solvd.laba.bank.models;

public class Personal_photo {
	private Integer id;
	private String photo_link;
	//private Integer user_id;
	
	public Personal_photo() {
	}

	public Personal_photo(Integer id, String photo_link) {
		this.id = id;
		this.photo_link = photo_link;
//		this.user_id = user_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoto_link() {
		return photo_link;
	}

	public void setPhoto_link(String photo_link) {
		this.photo_link = photo_link;
	}

//	public Integer getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(Integer user_id) {
//		this.user_id = user_id;
//	}
}
