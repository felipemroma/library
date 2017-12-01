package br.edu.infnet.biblioteca.persistence;

import br.edu.infnet.biblioteca.modelo.Book;

public class BookDao extends JpaDao<Book> {

	public BookDao() {
		super(Book.class);
	}
	
}
