package com.solvd.laba.bank;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.solvd.laba.bank.bankDAO.ICreditRepo;
import com.solvd.laba.bank.bankDAO.IUserRepo;
import com.solvd.laba.bank.models.Credit;
import com.solvd.laba.bank.models.User;

public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class);
	
	public static void main(String[] args) throws IOException {
		
		Reader reader = Resources.getResourceAsReader("mybatis/mybatis-configuration.xml");
		
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(reader);
		User userToCreate = new User(18, "un3", "un3@gmail.com", "0000");
		try(SqlSession session = factory.openSession()){
			IUserRepo userMapper = session.getMapper(IUserRepo.class);
//			userMapper.createUser(userToCreate);
//			session.commit();
			
			List<User> allUsers = userMapper.findAll();
			allUsers.forEach(LOGGER::info);
			System.out.println("\n");
			userMapper.updateUser(userToCreate);

			allUsers = userMapper.findAll();
			session.commit();
			allUsers.forEach(LOGGER::info);
			
			
			userMapper.deleteById(18);
			allUsers = userMapper.findAll();
			session.commit();
			allUsers.forEach(LOGGER::info);
		}
	}
}
