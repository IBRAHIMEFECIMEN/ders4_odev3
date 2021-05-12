package ders4_odev3.abstracts;

import java.util.ArrayList;

public interface CrudService<T> {
	void add(T entity);
	void addBulk(T[] entity);
	void update(T entity);
	void delete(T entity);
	ArrayList<T> getAll();
	
}
