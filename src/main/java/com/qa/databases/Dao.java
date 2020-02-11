package com.qa.databases;

import java.util.ArrayList;
//import java.util.List;

public interface Dao<T> {
	
	//c
	public void create(T t);
	
	//r
	public ArrayList <T> readAll();
	
	//v
	public void update(T t, String field, String newvalue);
	
	//d
	public void delete(T t);
	
	
	
	

}
