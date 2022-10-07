package com.solvd.laba.bank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.solvd.laba.bank.bankDAO.IUserRepo;
import com.solvd.laba.bank.bankDAO.jdbcQuery.IUserRepoImpl;
import com.solvd.laba.bank.configs.mybatis.MyBatisFactory;
import com.solvd.laba.bank.models.User;
import com.solvd.laba.bank.service.JAXB.UserValidation;
import com.solvd.laba.bank.service.jackson.UserJson;

public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {
		////------------------mybatis-------------------------------------
//		MyBatisFactory mbf = new MyBatisFactory();
//		User user = new User();
//		List<User> allUsers = new ArrayList<>();
//		try (SqlSession session = mbf.getFactory().openSession()) {
//			IUserRepo userRepo = session.getMapper(IUserRepo.class);
//			user = userRepo.findById(1);
//			allUsers.addAll(userRepo.findAllUserWithPhoto());
//		} 
//		
//	////-------------------------jackson----------------------------------
//		UserJson.marshal(allUsers, "./src/main/resources/jackson/result.json");
//		UserJson.marshal(allUsers, "./src/main/resources/jackson/result.json");
//		User someUser = UserJson.unmarshal("./src/main/resources/jackson/result.json");
//		LOGGER.info(someUser);
//		UserJson.unmarshalList("./src/main/resources/jackson/result.json").forEach(LOGGER::info);
//	
//	////--------------------------JAXB------------------------------------
//			try {
//				UserValidation.marshal(user, "./src/main/resources/JAXB/single_users.xml");
//				UserValidation.marshal(allUsers, "./src/main/resources/JAXB/all_users.xml");
//			} catch (IOException | JAXBException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			User userFromXml;
//			try {
//				userFromXml = UserValidation.unmarshal("./src/main/resources/JAXB/single_users.xml");
//				LOGGER.info(userFromXml);
//				UserValidation.unmarshalList("./src/main/resources/JAXB/all_users.xml")
//				  .forEach(LOGGER::info);
//			} catch (JAXBException | IOException e) {
//				LOGGER.error(e);
//			}
		
		/////-----------------------JDBC-------------------------------------
//		IUserRepoImpl repo = new IUserRepoImpl();
//		User user1 = repo.findById(1);
//		LOGGER.info(user1 + "\n");
//		repo.createUser(new User(1, "someUSER", "smu@vore", "7355"));
//		
//		repo.findAll().forEach(LOGGER::info);
//		repo.updateUser(new User(user1.getId(), user1.getUsername(), "xxx.gmail.com", "1234"));
////		LOGGER.info(repo.findById(1));
//		repo.deleteById(21);
////		repo.findAll().forEach(LOGGER::info);
		LOGGER.info("END");
	}
}
