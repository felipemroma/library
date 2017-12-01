package br.edu.infnet.biblioteca.persistence;

public interface Dao<T> {

	void salvar(T entity);

	void atualizar(T entity);

	T getById(Integer id);

}