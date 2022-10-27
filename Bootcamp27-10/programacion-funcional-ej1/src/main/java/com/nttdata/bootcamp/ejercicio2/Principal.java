package com.nttdata.bootcamp.ejercicio2;

import java.math.BigDecimal;
import java.util.List;

public class Principal {

	enum Tax {
		SUPERREDUCED(4), REDUCED(10), NORMAL(21);

		public int percent;

		private Tax(int percent) {
			this.percent = percent;
		}

		public int getPercent() {
			return percent;
		}
	}

	static class Product {

		public String name;
		public BigDecimal price;
		public Tax tax;

		Product(String name, BigDecimal price, Tax tax) {
			this.name = name;
			this.price = price;
			this.tax = tax;
		}
	}

	public static void main(String[] args) {
		List<Product> shopping = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		Double totales = shopping.stream()
				.mapToDouble(total -> total.price.doubleValue() + (total.tax.percent * total.price.doubleValue() / 100))
				.sum();
		System.out.println(totales);
	}

}
