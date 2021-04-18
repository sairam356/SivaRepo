package com.corejavaPratice.abstractPratice;

public class PaymentServiceTest {
	public static void main(String[] args) {
		
		PaymentService  paymentService = new PaymentServiceImpl("HDFC");
		paymentService.getParcitpantsInfo();
		paymentService.getPaymentIds();
		paymentService.getPaymentAmounts();
		paymentService.getServiceInfo();
		System.out.println(paymentService.getServiceName());
		paymentService.getPaymentType("CreditTransfer");	
		System.out.println(paymentService.status);
		System.out.println(PaymentService.settlement_URL);
		paymentService.getDefaultPariticpantInfo();
	}  
 
}
