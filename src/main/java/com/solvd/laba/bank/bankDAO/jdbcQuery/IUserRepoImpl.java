package com.solvd.laba.bank.bankDAO.jdbcQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.solvd.laba.bank.bankDAO.IUserRepo;
import com.solvd.laba.bank.configs.connectionPool.BasicConnectionPool;
import com.solvd.laba.bank.models.User;

public class IUserRepoImpl implements IUserRepo{
	private static final Logger LOGGER = Logger.getLogger(IUserRepoImpl.class);
	private BasicConnectionPool connectionPool = BasicConnectionPool.create();
	
	@Override
	public User findById(Integer id) {
		
		String sql = "select * from users where id = " + id.toString();
		try(Connection conn = connectionPool.getConnection();Statement statement = conn.createStatement()) {
			ResultSet rSet = statement.executeQuery(sql);
			rSet.next();
				return new User(rSet.getInt(1), 
									rSet.getString(2), 
									rSet.getString(3), 
									rSet.getString(4));
			
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		return null;
	}

	@Override
	public void createUser(User user) {
		String sql = "insert into bank_dev.users "
				+ "(`username`, `email`, `password`) "
				+ "values ('" + user.getUsername() 
				+ "', '" + user.getEmail() 
				+ "', '" + user.getPassword() + "')" ;
		try(Connection conn = connectionPool.getConnection();Statement statement = conn.createStatement()) {
			statement.execute(sql);
			
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		
	}

	@Override
	public List<User> findAll() {
		List<User> userList = new ArrayList<>();
		String sql = "select * from bank_dev.users";
		try(Connection conn = connectionPool.getConnection();Statement statement = conn.createStatement()) {
			ResultSet rSet = statement.executeQuery(sql);
			while(rSet.next()) {
				userList.add(new User(rSet.getInt(1), 
									rSet.getString(2), 
									rSet.getString(3), 
									rSet.getString(4)));
			}
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		return userList;
	}

	@Override
	public void updateUser(User user) {
		String sql = "update bank_dev.users set "
				+ "`username` = '" + user.getUsername() 
				+ "', `email` = '" + user.getEmail() 
				+ "', `password` = '" + user.getPassword() 
				+ "' where `id` = " + user.getId();
		try(Connection conn = connectionPool.getConnection();Statement statement = conn.createStatement()) {
			statement.execute(sql);
			
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		String sql = "delete from bank_dev.users\r\n"
				+ "	where id = " + id;
		try(Connection conn = connectionPool.getConnection();Statement statement = conn.createStatement()) {
			statement.execute(sql);
			
		} catch (SQLException e) {
			LOGGER.error(e);
		}
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUserWithPhoto() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
