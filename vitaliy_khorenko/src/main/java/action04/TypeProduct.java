package action04;

public enum TypeProduct {
	
	Bread, Yogurt, Milk;
	
	public static void main(String[] args) {
		
		TypeProduct [] arr = TypeProduct.values();
		
		TypeProduct const1 = arr[0];
		
		String str = const1.toString();
		
		TypeProduct const2 = TypeProduct.valueOf(str);
		
		System.out.println(const1);
		System.out.println(str);
		System.out.println(const2);
		
	}

}
