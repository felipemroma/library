
package br.edu.infnet.biblioteca.persistence;

import br.edu.infnet.biblioteca.modelo.Author;


public class AuthorDao extends JpaDao<Author> {

	public AuthorDao() {
		super(Author.class);
	}
	 

}
