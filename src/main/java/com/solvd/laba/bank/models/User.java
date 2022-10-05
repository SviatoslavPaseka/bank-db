package com.solvd.laba.bank.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement
@XmlType(propOrder = {"id", "username", "email", "password"})
@JsonRootName(value = "User")
public class User {
	private Integer id;
	private String username;
	private String email;
	private String password;
	
	private List<Personal_photo> personal_photos;
	private List<Integer> account_numbers;
	
	public User() {
	}
	public User(Integer id, String username, String email, String password) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}
	@XmlAttribute
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	@XmlElement(name = "username")
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement(name = "email")
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	@XmlElement(name = "password")
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public List<Personal_photo> getPersonal_photos() {
		return personal_photos;
	}
	@XmlTransient
	public void setPersonal_photos(List<Personal_photo> personal_photos) {
		this.personal_photos = personal_photos;
	}
	
	
	@Override
	public String toString() {
		return id + " " + username + " " + email + " " + password + " " + personal_photos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
