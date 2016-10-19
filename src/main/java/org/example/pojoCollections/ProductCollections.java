package org.example.pojoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.log4j.Logger;
import org.example.pojo.Product;

public class ProductCollections {
	
	private static final Logger log = Logger.getLogger(ProductCollections.class);
	
	public static ArrayList<Product> prod = new ArrayList<>();

	public int size() {
		return prod.size();
	}

	public static ArrayList<Product>  getAllProduct() {
		if (prod.isEmpty()) {
			Product pr1 = new Product().setName("Икра красная \"Вкуснота \"").setBrand("Белорусская традиция").setPrice("120");
			Product pr2 = new Product().setName("Чай зеленый \"Принцесса Нури\"").setBrand("Ахмад").setPrice("15");		
			Product pr3 = new Product().setName("Чай ароматный с бергамотом.").setBrand("Беседа").setPrice("221");
			Product pr4 = new Product().setName("Lipton Yellow Label").setBrand("Lipton").setPrice("24");
			Product pr5 = new Product().setName("Magic aroma").setBrand("Lipton").setPrice("18");
			Product pr6 = new Product().setName("English Breakfast").setBrand("Lipton").setPrice("12");
			Product pr7 = new Product().setName("Royal Ceylon").setBrand("Lipton").setPrice("14");
		
			prod.add(pr1);
			prod.add(pr2);
			prod.add(pr3);
			prod.add(pr4);
			prod.add(pr5);
			prod.add(pr6);
			prod.add(pr7);
		
		}
		return prod;
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

	public ArrayList<Product> sortByName() {
		Collections.sort(getAllProduct(), sortByName);
		return prod;
	}

	public ArrayList<Product> sortByPrice(ArrayList<Product> prod) {
		Collections.sort(prod, sortByPrice);
		return prod;

	}

	public Product prodWithMaxPrice() {
		return Collections.max(getAllProduct(), sortByPrice );
	}

	public Product prodWithMinPrice() {
		return Collections.min(getAllProduct(), sortByPrice );
	}

	public ArrayList<Product> findByName(String productName) {

		ArrayList<Product> productWithEqualsName = new ArrayList<>();
		for (int i = 0; i < size(); i++) {
			if (prod.get(i).getName().equalsIgnoreCase(productName)) {
				productWithEqualsName.add(getAllProduct().get(i));
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
