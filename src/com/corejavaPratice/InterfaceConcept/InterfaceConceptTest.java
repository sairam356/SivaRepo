package com.corejavaPratice.InterfaceConcept;

public class InterfaceConceptTest {
	public static void main(String[] args) {
         
		 ProductService  productService = new SoapServiceImpl();
		 
		 productService.getProductsByCategory("Saop", "Test");
		 productService.getProductType("Soap");//abstract
		 productService.testProductService();//default
		 ProductService.productServiceInfo();//static 
		 ProductService.getInterfaceName();
		 
		 System.out.println(ProductService.name);
	}
}
