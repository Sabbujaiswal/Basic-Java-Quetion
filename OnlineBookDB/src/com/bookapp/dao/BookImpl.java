package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookImpl implements BookInter {
	String readQuery = "select * from books";
	String insertQuery = "insert into books values(?,?,?,?,?)";
	String updateQuery = "update book set price =? where bookid = ?";
	String deleteQuery = "delete from books where bookId = ?";
	String searchByAuthor = "select * from books where authorName=?";
	String searchById = "select * from books where bookId=?";
	String searchByCategory = "select * from books where category=?";

	@Override
	public void addBook(Book book) {
		Connection connection = ModelDAO.openConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insertQuery);
			st.setString(1, book.getTitle());
			st.setString(2, book.getAuthor());
			st.setString(3, book.getCategory());
			st.setInt(4, book.getBookid());
			st.setInt(5, book.getPrice());
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean deleteBook(int bookid) throws BookNotFoundException {
		Connection connection = ModelDAO.openConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(deleteQuery);
			st.setInt(1, bookid);
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book getBookById(int bookid) throws BookNotFoundException {
		Connection connection = ModelDAO.openConnection();
		PreparedStatement st = null;
		System.out.println();
		try {
			st = connection.prepareStatement(searchById);
			st.setInt(1, bookid);
			ResultSet result = st.executeQuery();
			if (result != null) {
				while (result.next()) {
					String title = result.getString(1);
					String author = result.getString(2);
					String category = result.getString(3);
					int id = result.getInt(4);
					int price = result.getInt(5);
					System.out.println(title + "\t" + "| " + author + "\t" + "| " + category + "\t" + "| " + id + "\t"
							+ "| " + price);
				}
				result.close();
			} else {
				throw new BookNotFoundException("Book not Found please check the input");
			}

		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateBook(int bookid, int price) {
		Connection connection = ModelDAO.openConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(updateQuery);
			st.setInt(1, price);
			st.setInt(2, bookid);
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> getAllBooks() {
		Connection connection = ModelDAO.openConnection();
		PreparedStatement st = null;
		System.out.println();

		try {
			st = connection.prepareStatement(readQuery);
			ResultSet result = st.executeQuery();

			while (result.next()) {
				String title = result.getString(1);
				String author = result.getString(2);
				String category = result.getString(3);
				int id = result.getInt(4);
				int price = result.getInt(5);
				System.out.println(
						title + "\t" + "| " + author + "\t" + "| " + category + "\t" + "| " + id + "\t" + "| " + price);
			}
			result.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		Connection connection = ModelDAO.openConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(searchByAuthor);
			st.setString(1, author);
			ResultSet result = st.executeQuery();
			if (result != null) {
				while (result.next()) {
					String title = result.getString(1);
					String auth = result.getString(2);
					String category = result.getString(3);
					int id = result.getInt(4);
					int price = result.getInt(5);
					System.out.println(title + "\t" + auth + "\t" + category + "\t" + id + "\t" + price);
				}

			}
			result.close();
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {

		Connection connection = ModelDAO.openConnection();
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(searchByCategory);
			st.setString(1, category);
			ResultSet result = st.executeQuery();
			if (result != null) {
				while (result.next()) {
					String title = result.getString(1);
					String auth = result.getString(2);
					String cat = result.getString(3);
					int id = result.getInt(4);
					int price = result.getInt(5);
					System.out.println(title + "\t" + auth + "\t" + cat + "\t" + id + "\t" + price);
				}

			}
			result.close();
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;

	}

}
