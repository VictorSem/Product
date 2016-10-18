package org.example.main;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.example.pojo.Product;
import org.example.pojoCollections.ProductCollections;



public class MainClass {
	
	private static final Logger log = Logger.getLogger(MainClass.class);
	
	public static ArrayList<Product> getAllProduct() {

		Product pr1 = new Product().setName("Икра красная \"Вкуснота \"").setBrand("Белорусская традиция").setPrice("120");
		Product pr2 = new Product().setName("Чай зеленый \"Принцесса Нури\"").setBrand("Ахмад").setPrice("15");		
		Product pr3 = new Product().setName("Чай ароматный с бергамотом.").setBrand("Беседа").setPrice("221");
		Product pr4 = new Product().setName("Lipton Yellow Label").setBrand("Lipton").setPrice("24");
		Product pr5 = new Product().setName("Magic aroma").setBrand("Lipton").setPrice("18");
		Product pr6 = new Product().setName("English Breakfast").setBrand("Lipton").setPrice("12");
		Product pr7 = new Product().setName("Royal Ceylon").setBrand("Lipton").setPrice("14");
		
		ProductCollections cP = new ProductCollections();
				
		ArrayList<Product> products = cP.getProd();
		products.add(pr1);
		products.add(pr2);
		products.add(pr3);
		products.add(pr4);
		products.add(pr5);
		products.add(pr6);
		products.add(pr7);
		
		return products;	
	}
	
	
	public static void main(String[] args) {
		
		ProductCollections cP = new ProductCollections();
		log.info("Max price is = " + cP.prodWithMaxPrice(getAllProduct()).getPrice());
		log.info("Min price is = " + cP.prodWithMinPrice(getAllProduct()).getPrice());
		log.info(cP.findByName("Milk 4", getAllProduct()));
		log.info(cP.sortByName(getAllProduct()));
	}

}
