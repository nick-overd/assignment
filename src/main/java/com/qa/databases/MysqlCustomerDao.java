package com.qa.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MysqlCustomerDao implements Dao <Customer>{

	private Connection connection;
	
	public void create(Customer customer) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into customers(first_name) values(' " + customer.getName() + "')");
		} catch (Exception e) {
		
		}
	}
// customer name hard coded since it's the only thing they can change
	public void update(Customer customer, String field,String newvalue) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("update customers set customer_name = '" + newvalue + "' where customer_id=" + customer.getId() + ";");
		} catch (Exception e) {
		}
		
		
	}

	public void delete(Customer customer) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("delete from customers where customer_id=" + customer.getId() + ";");
		} catch (Exception e) {
		}
		
	}
	
	
//	private Connection connection;
//	public CustomerDaoMysql() throws SQLException {
//		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:33 06/ims", Config.username,
//				Config.password);
//	}
	public ArrayList<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			this.connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/ass1", "assignment" ,"root12");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customers");
			while (resultSet.next()) {
				Long id = resultSet.getLong("customer_id");
				String firstname = resultSet.getString("customer_name");
				Customer customer = new Customer(id, firstname);
				customers.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return customers;
//	private Connection connection = DriverManager.getConnection("jdbc:mysql://35.230.159.192:3306/ims", "root" , "root");

	}

	}




