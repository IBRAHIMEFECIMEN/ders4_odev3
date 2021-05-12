package ders4_odev3.concretes;

import java.util.ArrayList;

import ders4_odev3.abstracts.CategoryService;
import ders4_odev3.entities.Category;

public class CategoryManager implements CategoryService {

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " : eklenmi�tir.");
		
	}
	
	@Override
	public void addBulk(Category[] categories) {
		for (Category category : categories) {
			this.add(category);
		}		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getName() + " : g�ncellenmi�tir.");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName() + " : silinmi�tir.");
		
	}

	@Override
	public ArrayList<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
