package com.solvd.laba.bank.configs.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MyBatisFactory {
	private final static Logger LOGGER = Logger.getLogger(MyBatisFactory.class);
	
	private String configFilePath = "mybatis/mybatis-configuration.xml";
	private SqlSessionFactoryBuilder builder;
	private SqlSessionFactory factory;
	public MyBatisFactory() {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(configFilePath);
			builder = new SqlSessionFactoryBuilder();
			factory = builder.build(reader);
			LOGGER.info("Created MyBatisFactory object with noarguments constructor");
		} catch (IOException e) {
			LOGGER.error(e);
		} 
		
	}
	public SqlSessionFactoryBuilder getBuilder() {
		return builder;
	}
	public SqlSessionFactory getFactory() {
		return factory;
	}
}
