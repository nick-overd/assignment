package com.qa.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlItemOrderDao implements Dao<ItemsOrders>{
	
	private Connection connection;

	public void create(ItemsOrders t) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<ItemsOrders> readAll() {
		ArrayList<ItemsOrders> itemorders = new ArrayList<ItemsOrders>();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "root" ,"root12");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from items_orders");
			while (resultSet.next()) {
				Long itorid = resultSet.getLong("it_or_id");
				Long itemid = resultSet.getLong("item_id");
				Long orderid = resultSet.getLong("order_id");
				ItemsOrders itemorder = new ItemsOrders(itorid, itemid, orderid);
				itemorders.add(itemorder);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return itemorders;
	}

	public void update(ItemsOrders itemorder, String field,String newvalue) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("update items_orders set " + field + " = " + newvalue + "' where it_or_id=" + itemorder.getItorid() + ";");
		} catch (Exception e) {
		}
	}

	public void delete(ItemsOrders itemorder) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.246.46.47:3306/assignment", "admin", "root12")){
			Statement statement = connection.createStatement();
			statement.executeUpdate("delete from items_orders where it_or_id=" + itemorder.getItorid() + ";");
		} catch (Exception e) {
		}	
	}
}
