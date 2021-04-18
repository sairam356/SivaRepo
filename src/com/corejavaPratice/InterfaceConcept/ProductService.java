package com.corejavaPratice.InterfaceConcept;

import java.util.List;

public interface ProductService {
	
	public static  int a =5;  //same
	
	public static final String  name ="Product-Service";//same
	
	public int b =6;//same
	
	/*
	 *   In interface by default  variables are  static and final 
	 */

	public static void productServiceInfo() {
		System.out.println("This is a Generic Interface");
	}

	public static String getInterfaceName() {

		System.out.println(" ProductService");

		return "ProductService";
	}

	default String testProductService() {
		System.out.println("Test is Done ");

		return " Test is DOne ";
	}
	
	default String testProductServiceImpl() {
		
		System.out.println("TestImpl is Done ");
		return " TestImpl is Done ";
	}

	public List<String> getProductType(String type);

	public List<String> getProductsByCategory(String category, String productType);

}
