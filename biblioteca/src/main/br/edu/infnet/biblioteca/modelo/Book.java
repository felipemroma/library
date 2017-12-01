package br.edu.infnet.biblioteca.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {

	@Id @GeneratedValue
	private int isbn;
	private String book_title;
	private Date date_of_publication;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="book")
	private List<Author> author;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public Date getDate_of_publication() {
		return date_of_publication;
	}

	public void setDate_of_publication(Date date_of_publication) {
		this.date_of_publication = date_of_publication;
	}

	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	} 
	

}
