package org.example.main;

import org.apache.log4j.Logger;
import org.example.pojoCollections.ProductCollections;

public class MainClass {
	
	private static final Logger log = Logger.getLogger(MainClass.class);
	
	public static void main(String[] args) {
		ProductCollections cP = new ProductCollections();
		log.info("Max price is = " + cP.prodWithMaxPrice().getPrice());
		log.info("Size is " + cP.size());
		log.info("Min price is = " + cP.prodWithMinPrice().getPrice());
		log.info(cP.findByName("Milk 4"));
		log.info(cP.sortByName());		
	}

}
