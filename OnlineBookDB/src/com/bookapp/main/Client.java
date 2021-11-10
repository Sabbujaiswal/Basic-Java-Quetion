package com.bookapp.main;

import java.util.Scanner;

import com.bookapp.bean.Book;
import com.bookapp.dao.BookImpl;
import com.bookapp.dao.BookInter;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class Client {
	public static void main(String[] args)
			throws BookNotFoundException, CategoryNotFoundException, AuthorNotFoundException {

		BookInter bookInter = new BookImpl();
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Add Books Press 1" + "\t" + "Filter books  Press 2" + "\t" + "Update Books Press 3" + "\t" + "Delete Books Press 4");
		int searchFilter = scanner.nextInt();

		switch (searchFilter) {
		case 1:

			System.out.println("Number of books to store in DB: ");
			int numberOfBooks = scanner.nextInt();
			for (int i = 0; i < numberOfBooks; i++) {
				Book book = new Book();

				scanner.nextLine();
				System.out.println("Enter Book Title: ");
				String title = scanner.nextLine();

				book.setTitle(title);

				System.out.println("Enter Author Name: ");
				String author = scanner.nextLine();

				book.setAuthor(author);

				System.out.println("Enter Book Category: ");
				String category = scanner.nextLine();

				book.setCategory(category);

				System.out.println("Enter BookId: ");
				int bookId = scanner.nextInt();

				book.setBookid(bookId);

				System.out.println("Enter Book Price: ");
				int price = scanner.nextInt();
				System.out.println();

				book.setPrice(price);

				bookInter.addBook(book);

			}
			bookInter.getAllBooks();
			break;

		case 2:

			System.out.println("Search By Author (or) Category (or) Id");
			String decision1 = scanner.next();

			if (decision1.equalsIgnoreCase("Author")) {
				System.out.println("Enter author name to search: ");
				scanner.nextLine();
				String authorNameSearch = scanner.nextLine();
				bookInter.getBookbyAuthor(authorNameSearch);

				break;

			} else if (decision1.equalsIgnoreCase("Category")) {
				System.out.println("Enter category name to search: ");
				String categorySearch = scanner.next();
				bookInter.getBookbycategory(categorySearch);

				break;

			} else if (decision1.equalsIgnoreCase("Id")) {
				System.out.println("Enter bookId: ");
				int idSearch = scanner.nextInt();
				bookInter.getBookById(idSearch);

				break;
			} else {
				System.out.println("enter correct input:");
				System.out.println();
			}

			break;
		case 3: // Update books from DB

			System.out.println("Enter book Id to update");
			int updateId = scanner.nextInt();
			System.out.println("Enter new Price");
			int price = scanner.nextInt();
			bookInter.updateBook(updateId, price);
			bookInter.getAllBooks();
			break;
		case 4: // Delete books from DB

			System.out.println("Enter book Id to delete");
			int delId = scanner.nextInt();
			try {
				bookInter.deleteBook(delId);
			} catch (BookNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bookInter.getAllBooks();
			break;

		default:
			System.out.println("Please enter the correct input");

		}

	}
}
