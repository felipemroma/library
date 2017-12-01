package br.edu.infnet.biblioteca.persistence;

import br.edu.infnet.biblioteca.modelo.Category;

public class CategoryDao extends JpaDao<Category> {

	public CategoryDao() {
		super(Category.class);
	}

}
