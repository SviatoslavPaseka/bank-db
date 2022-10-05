package com.solvd.laba.bank.bankDAO;

import java.util.List;

import com.solvd.laba.bank.models.User;

public interface IUserRepo {
	User findById(Integer id);
	void createUser(User user);
	List<User> findAll();
	void updateUser(User user);
	void deleteById(Integer id);
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAllUserWithPhoto();
}
