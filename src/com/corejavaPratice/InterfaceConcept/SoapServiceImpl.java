package com.corejavaPratice.InterfaceConcept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SoapServiceImpl implements ProductService{

	public SoapServiceImpl() {
		System.out.println(" In Soap Service Impl");
		
	}

	@Override
	public List<String> getProductType(String type) {
		 System.out.println(" Get ProductType");
		 
		   List<String> productTypes = Arrays.asList("Glicerine","Milk SOft");
				   
		return productTypes;
	}

	@Override
	public List<String> getProductsByCategory(String category, String productType) {
		 System.out.println(" getProductsByCategory");
		 
		   List<String> productTypes = Arrays.asList("tEST2","Test SOft");
		   
		  Collections.sort(productTypes);
		return productTypes;
	}

}
