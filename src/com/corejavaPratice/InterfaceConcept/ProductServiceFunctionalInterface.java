package com.corejavaPratice.InterfaceConcept;

@FunctionalInterface
public interface ProductServiceFunctionalInterface {
 
	public  void getProductServicIntefaceImpl(int a);
	
    public static void getProductName() {
    	
    }
    
    default void getProductType() {
    	
    }
	
}
