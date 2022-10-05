package com.solvd.laba.bank.service.JAXB;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.solvd.laba.bank.models.User;

@XmlRootElement(name = "list-users")
public class UsersHolder {
	
	private List<User> users = new ArrayList<User>();

	public UsersHolder() {
	}

	public UsersHolder(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}
	@XmlElement(name = "user", type = User.class)
	public void setUsers(List<User> users) {
		this.users = users;
	}
}