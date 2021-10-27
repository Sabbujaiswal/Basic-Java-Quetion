package com.bookapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookImpl implements BookInter{

	List<Book> booklist = new ArrayList<>();
	List<Book> newList = new ArrayList<>();
	@Override
	public void addBook(Book book) {
		booklist.add(book);
	}

	@Override
	public List<Book> getAllBooks() {
		Collections.sort(booklist, (book1,book2)->{
			return book1.getTitle().compareTo(book2.getTitle());
		});
		return booklist;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		for(Book book:booklist) {
			if(book.getAuthor().equals(author)) {
				newList.add(book);
			}
			
		}
		if(newList.isEmpty()) {
			throw new AuthorNotFoundException("author not found");
		}
		return newList;
	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {
		for(Book book:booklist) {
			if(book.getAuthor().equals(category)) {
				newList.add(book);
			}
			
		}
		if(newList.isEmpty()) {
			throw new CategoryNotFoundException("category not found");
		}
		return newList;
	}
	
	

	

}
