package org.example.pojoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.log4j.Logger;
import org.example.pojo.Product;

public class ProductCollections {
	
	private static final Logger log = Logger.getLogger(ProductCollections.class);
	
	private ArrayList<Product> prod = new ArrayList<>();

	public int size() {
		return prod.size();
	}

	public void printAll(ArrayList<Product> prod) {
		for (int i = 0; i < size(); i++) {
			log.info(prod.get(i));
		}
	}

	@Override
	public String toString() {
		for (int i = 0; i < size(); i++) {
			log.info(prod.get(i));
		}
		return "";
	}

	public ArrayList<Product> getProd() {
		return prod;
	}

	public void setProd(ArrayList<Product> prod) {
		this.prod = prod;
	}

	public ArrayList<Product> sortByName(ArrayList<Product> prod) {
		Collections.sort(prod, sortByName);
		return prod;
	}

	public ArrayList<Product> sortByPrice(ArrayList<Product> prod) {
		Collections.sort(prod, sortByPrice);
		return prod;

	}

	public Product prodWithMaxPrice(ArrayList<Product> prod) {
		return Collections.max(prod, sortByPrice );
	}

	public Product prodWithMinPrice(ArrayList<Product> prod) {
		return Collections.min(prod, sortByPrice );
	}

	public ArrayList<Product> findByName(String productName, ArrayList<Product> prod) {

		ArrayList<Product> productWithEqualsName = new ArrayList<>();
		for (int i = 0; i < size(); i++) {
			if (prod.get(i).getName().equalsIgnoreCase(productName)) {
				productWithEqualsName.add(prod.get(i));
			}
		}

		if (productWithEqualsName.isEmpty()) {
			log.info("Didnt find elemets with product name \"" + productName + "\".");
		}
		return productWithEqualsName;
	}

	private  Comparator<Product> sortByName = new Comparator<Product>() {

		@Override
		public int compare(Product p1, Product p2) {
			return p1.getName().compareTo(p2.getName());
		}
	};

	private  Comparator<Product> sortByPrice = new Comparator<Product>() {

		@Override
		public int compare(Product p1, Product p2) {
			return Integer.parseInt(p1.getPrice()) - Integer.parseInt(p2.getPrice());
		}
	};
}
