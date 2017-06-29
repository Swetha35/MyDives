package com.test.Dao;

import com.swetha.Dao.BookDAO;

public class TestBookDao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO book = new BookDAO();
		
		System.out.println(book.findAll());
		
		System.out.println(book.findTotalBook());
		
		
		
	
	book.delete(25);
	}
}
