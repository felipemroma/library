package br.edu.infnet.biblioteca.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class Author {

	@Id 
	@GeneratedValue
	private Integer author_id;
	private String author_fristname;
	private String author_surname;
	
	@ManyToOne
	private Book book;
	
	public Integer getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_fristname() {
		return author_fristname;
	}
	public void setAuthor_fristname(String author_fristname) {
		this.author_fristname = author_fristname;
	}
	public String getAuthor_surname() {
		return author_surname;
	}
	public void setAuthor_surname(String author_surname) {
		this.author_surname = author_surname;
	}
	
	
	
}
