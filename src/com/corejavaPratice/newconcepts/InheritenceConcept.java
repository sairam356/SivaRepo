package com.corejavaPratice.newconcepts;

public class InheritenceConcept {
   
	
	public static void main(String[] args) {
		HDFCBankKondapur b = new HDFCBankKondapur();
		b.setEliglbeForClearing(true);
		boolean  bool = b.isEliglbeForClearing();
		
		if(bool) {
			
			System.out.println("Yes it is Eligble For Clearing ");
		}else {
			System.out.println("No Eligble ");
		}
		
		b.printBankName();

	}
}
