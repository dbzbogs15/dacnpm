package com.bookexchange.service;

import java.util.List;

import com.bookexchange.model.Book;

public interface IBookService {
	public List<Book> books();

	public Book getBookInformation(int id);
//	Th�i
	
	public List<Book> findBookByUser(String email);
	public void addBook(Book book);
	public int maxID();

}
