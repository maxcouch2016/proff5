//Задача 1. Написать программу:
//Enum TypeProduct{Bread, Yogurt, Milk}
//class Product{name, TypeProduct type, int numberParty}
//ProductShop{Map<Product, String> shop(Product, NameOfContructor)}
//Добавить в Карту по паре продуктов каждого типа.
//Сделать:
//1) Вывести список фирм в алфавитном порядке
//2) Вывести список фирм в обратном порядке
//3) Вывести уникальные наименования товаров по типу продуктов

package action04;

import java.util.ArrayList;
import java.util.Collections;
//import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;

import org.apache.log4j.chainsaw.Main;
import org.apache.log4j.pattern.LineSeparatorPatternConverter;
//import org.hibernate.mapping.Set;
import org.springframework.util.SystemPropertyUtils;

import antlr.collections.List;
 
public class ProductShop {
	Map<Product, String> contructors = new HashMap<Product, String>();
	
	public static void main(String[] args) {
		ProductShop shop = new ProductShop();
		shop.printContructor();
		shop.printReverseContructor();
		shop.printNameProductByType(TypeProduct.Yogurt);
 	}
	public ProductShop() {
		contructors.put(new Product("Bread White", TypeProduct.Bread, 10), "Firma 3");
		contructors.put(new Product("Super Yogurt", TypeProduct.Yogurt, 10), "Firma 3");

		contructors.put(new Product("Bread Grey", TypeProduct.Bread, 12), "Firma 3");
		contructors.put(new Product("Yogurt for Java Developers", TypeProduct.Yogurt, 12), "Firma 3");

		contructors.put(new Product("Milk with Shokolate", TypeProduct.Milk, 14), "Firma 1");
		contructors.put(new Product("Simple Yogurt", TypeProduct.Yogurt, 14), "Firma 1");
		contructors.put(new Product("Bread Grey", TypeProduct.Bread, 16), "Firma 1");
		contructors.put(new Product("Yogurt for Java Developers", TypeProduct.Yogurt, 16), "Firma 1");
		contructors.put(new Product("Milk with Shokolate", TypeProduct.Milk, 14), "Firma 1");
		contructors.put(new Product("Simple Yogurt", TypeProduct.Yogurt, 14), "Firma 1");
		contructors.put(new Product("Bread Grey", TypeProduct.Bread, 16), "Firma 1");
		contructors.put(new Product("Bread Grey", TypeProduct.Bread, 18), "Firma 1");

		contructors.put(new Product("Bread White", TypeProduct.Bread, 20), "Firma 2");
		contructors.put(new Product("Super Yogurt", TypeProduct.Yogurt, 20), "Firma 2");
		contructors.put(new Product("Bread Grey", TypeProduct.Bread, 20), "Firma 2");
		contructors.put(new Product("Yogurt for Java Developers", TypeProduct.Yogurt, 20), "Firma 2");
		
		contructors.put(new Product("Yogurt for Java Developers", TypeProduct.Yogurt, 20), "Firma 2");
		System.out.println(contructors.size());
		System.out.println(contructors.get(1));
		//System.out.println(contructors.values());
	}

	public void printContructor() {
		Set<String> set1 = new TreeSet<String>(contructors.values()); 
		System.out.println(set1);
		}
		
	public void printReverseContructor()  {
		ArrayList <String> list = new ArrayList<String>(contructors.values());
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

	public void printNameProductByType(TypeProduct type) {
	
//		Set<String> products = new HashSet<String>();
//		for(Map.Entry<Product, String> entry:set1){
//			Product product = entry.getKey();
//			if(product.getType() == type)products.add(product.getName());
		}
		//System.out.println(products);
	}
	
	
	
	
	


class Product {
	private String name;
	public String getName() {
		return name;
	}

	public TypeProduct getType() {
		return type;
	}

	public int getParty() {
		return party;
	}

	private TypeProduct type;
	private int party;

	public Product(String name, TypeProduct type, int party) {
		this.name = name;
		this.type = type;
		this.party = party;
	}
	
	
}
