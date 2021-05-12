package ders4_odev3.abstracts;


import java.util.ArrayList;

import ders4_odev3.entities.Product;

public class BaseProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + " : eklenmi�tir.");
	}
	
	@Override
	public void addBulk(Product[] products) {
		for (Product product : products) {
			this.add(product);
		}
	}
	
	@Override
	public void update(Product product) {
		System.out.println(product.getName() + " : g�ncellenmi�tir.");
	}
	
	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + " : silinmi�tir.");
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
