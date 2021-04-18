package com.corejavaPratice.abstractPratice;

import java.util.List;

public abstract class PaymentService {

	public String bankInfo;
	
	public  final String  status ="COMPLETED";
	
	public  static  String settlement_URL = "http://loclahost/settlemtResult";

	public PaymentService() {
		System.out.println("THis is abstract class Constructor");
	}

	public PaymentService(String bankInfo) {
		this.bankInfo = bankInfo;
	}

	public abstract List<String> getPaymentIds();

	abstract List<String> getPaymentAmounts();

	// private abstract List<String> getPaymentDates();
	/*
	 * 
	 *   private abstract  methods are not allowed
	 */

	protected abstract List<String> getParcitpantsInfo();
	
	
	//public abstract static List<String>  getDefaultParticipantsList();
	/*
	 * 
	 *  absttract  static methods are not allowed
	 */

	public String getPaymentType(String paymentType) {

		System.out.println(" Payment TYpe  :" + paymentType+" For payemnet service Bank"+bankInfo);
		return paymentType;

	}

	private String getPayInfo() {

		return "AccountNUmber :123";

	}

	String getServiceName() {

		return " This is PaymentService";
	}

	protected void getServiceInfo() {

		System.out.println(" Plz  provide your bussiness logic");
	}
	
	public static void getDefaultPariticpantInfo() {
		
		System.out.println(" SChemeOperator ");
	}
}
