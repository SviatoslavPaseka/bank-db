package com.solvd.laba.bank.configs.connectionPool;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BasicConnectionPool implements ConnectionPool {
	private static String url = getProperties().getProperty("db.url");
	private static String user = getProperties().getProperty("db.username");
	private static String password = getProperties().getProperty("db.password");

	private List<Connection> connectionPool = new ArrayList<>();
	private List<Connection> usedConnections = new ArrayList<>();
	private static int INITIAL_POOL_SIZE = Integer.parseInt(getProperties().getProperty("db.max_connections"));

	public BasicConnectionPool(String url2, String user2, String password2, List<Connection> pool) {
		this.connectionPool.addAll(pool);
	}

	public BasicConnectionPool() {
		
	}

	private static Properties getProperties() {
		Properties properties = null;

		try (InputStream inputStream = new FileInputStream("./src/main/resources/mybatis/db.properties")) {
			properties = new Properties();
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	public static BasicConnectionPool create(){

		List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
		for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
			try {
				pool.add(createConnection(url, user, password));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return new BasicConnectionPool(url, user, password, pool);
	}

	@Override
	public Connection getConnection() { 
		Connection connection = connectionPool.remove(connectionPool.size() - 1);
		usedConnections.add(connection);
		return connection;
	}

	@Override
	public boolean releaseConnection(Connection connection) {
		return false;
	}

	private static Connection createConnection(String url, String user, String password)
			throws SQLException, ClassNotFoundException {

		Class.forName(getProperties().getProperty("db.driver"));

		return DriverManager.getConnection(url, user, password);
	}

	public int getSize() {
		return connectionPool.size() + usedConnections.size();
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
}
