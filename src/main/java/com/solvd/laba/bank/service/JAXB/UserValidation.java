package com.solvd.laba.bank.service.JAXB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.solvd.laba.bank.models.User;

public class UserValidation {
	private static final Logger LOGGER = Logger.getLogger(UserValidation.class);
	public static void marshal(User user, String filePath) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(User.class);				LOGGER.info("Created context");
		Marshaller mar = context.createMarshaller();			  				LOGGER.info("Created marshaller");
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		mar.marshal(user, new FileWriter(filePath));							LOGGER.info("Marshalled object");
	}
	
	public static void marshal(List<User> users, String filePath) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(UsersHolder.class);		LOGGER.info("Created context");
		Marshaller mar = context.createMarshaller();			  				LOGGER.info("Created marshaller");
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		UsersHolder usersHolder = new UsersHolder(users);
		mar.marshal(usersHolder, new File(filePath));							LOGGER.info("Marshalled object");
	}
	
	public static User unmarshal(String filePath) throws JAXBException, IOException {
		User user = new User();
		JAXBContext context = JAXBContext.newInstance(User.class);				LOGGER.info("Created context");
		Unmarshaller um = context.createUnmarshaller();			  				LOGGER.info("Created unmarshaller");
		user =(User) um.unmarshal(new File(filePath));							LOGGER.info("Unmarshalled and assigned user value");
		return user;
	}
	
	public static List<User> unmarshalList(String filePath) throws JAXBException, IOException {
		UsersHolder usersHolder = new UsersHolder();
		JAXBContext context = JAXBContext.newInstance(UsersHolder.class);		LOGGER.info("Created context");
		Unmarshaller um = context.createUnmarshaller();			  				LOGGER.info("Created unmarshaller");
		usersHolder =(UsersHolder) um.unmarshal(new File(filePath));			LOGGER.info("Unmarshalled and assigned user value");
		return usersHolder.getUsers();
	}
}
