package action04.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import action04.TypeProduct;

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
	}

	public void printContructor() {
		List<String> listFirm = new ArrayList<>();
		for (Map.Entry<Product,String> entry : contructors.entrySet()) {
		    listFirm.add(entry.getValue());
		}		
		Collections.sort(listFirm);
		System.out.println(listFirm);	
	}

	public void printReverseContructor() {
		List<String> listFirm = new ArrayList<>();
		for (Map.Entry<Product,String> entry : contructors.entrySet()) {
		    listFirm.add(entry.getValue());
		}		
		Comparator<String> comp = Collections.reverseOrder();
		Collections.sort(listFirm, comp);
		System.out.println(listFirm);
	}

	public void printNameProductByType(TypeProduct type) {
		
	}	
}

class Product {
	private String name;
	private TypeProduct type;
	private int party;

	public Product(String name, TypeProduct type, int party) {
		this.name = name;
		this.type = type;
		this.party = party;
	}
	
	
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}