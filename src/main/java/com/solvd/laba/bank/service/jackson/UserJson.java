package com.solvd.laba.bank.service.jackson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.laba.bank.models.User;

public class UserJson {
	private static final Logger LOGGER = Logger.getLogger(UserJson.class);
	public static void marshal(User user, String filePath) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(filePath), user);
		} catch (IOException e) {
			LOGGER.error(e);
		}
	}
	public static void marshal(List<User> users, String filePath) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(filePath), users);
		} catch (IOException e) {
			LOGGER.error(e);
		}
	}
	public static User unmarshal(String filePath) {
		ObjectMapper mapper = new ObjectMapper();
		User currentUser = null;
		try {
			currentUser = mapper.readValue(new File(filePath), User.class);
		} catch (IOException e) {
			LOGGER.error(e);
		}
		return currentUser;
	}
	public static List<User> unmarshalList(String filePath){
		ObjectMapper mapper = new ObjectMapper();
		List<User> listUsers = new ArrayList<>();
		try {
			listUsers = mapper.readValue(new File(filePath), 
										mapper.getTypeFactory().constructCollectionType(List.class, User.class));
		} catch (IOException e) {
			LOGGER.error(e);
		}
		return listUsers;
	}
}
