package com.corejavaPratice.InterfaceConcept;

import java.util.List;

public class ClothesServiceImpl  {

	public static void main(String[] args) {

		ProductServiceFunctionalInterface productInterface = (a) -> System.out
				.println("getProductServicIntefaceImpl is called" + a);

		productInterface.getProductServicIntefaceImpl(1);
	}
	
	

}
