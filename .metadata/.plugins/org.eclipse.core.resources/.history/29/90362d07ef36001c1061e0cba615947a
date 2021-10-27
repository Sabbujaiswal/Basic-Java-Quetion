package com.bookapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookImpl implements BookInter{

	List<Book> bookList = new ArrayList<>();
	@Override
	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public List<Book> getAllBooks() {
		Collections.sort(bookList, (book1,book2)->{
			return book1.getTitle().compareTo(book2.getTitle());
		});
		return bookList;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
