package action04;

import java.util.Arrays;

public enum TypeProduct {
	Bread, Yogurt, Milk;
	
	public static void main(String[] args) {
		TypeProduct[] arr = TypeProduct.values();
		TypeProduct const1 = arr[0]; // Bread
		String str = const1.toString(); // Bread
		TypeProduct const2 = TypeProduct.valueOf(str);
		System.out.println(Arrays.toString(arr));
		
		
	}
}

