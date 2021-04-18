package com.corejavaPratice.abstractPratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaymentServiceImpl extends PaymentService {
	
	public PaymentServiceImpl(String bankInfo) {
		 super(bankInfo);
	}
	@Override
	public List<String> getPaymentIds() {
		List<String> paymentIds = Arrays.asList("P1", "P2", "P3");
		System.out.println(paymentIds);
		return paymentIds;
	}

	@Override
	List<String> getPaymentAmounts() {

		List<String> payemntAmounts = Arrays.asList("100.26", "123.56", "800");
		System.out.println(payemntAmounts);
		return payemntAmounts;
	}

	@Override
	protected List<String> getParcitpantsInfo() {
		 List<String> participantsInfo = new ArrayList<String>();
		
		String participants[] = {"DABASEX","TEDTVBT","ABHRDL"};
		
		for(int i =0;i<participants.length-1;i++) {
			participantsInfo.add(participants[i]);
		}
		System.out.println(participantsInfo);
		
		return participantsInfo;
	}
	
	
	String getServiceName() {
		
		

		return " This is PaymentServiceImpl";
	}

}
