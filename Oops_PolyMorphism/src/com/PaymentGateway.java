package com;

import java.util.Scanner;

public class PaymentGateway {


	void paymentmethod(int amout) {
		System.out.println("payment successfully done with COD");
	}
	void paymentmethod(int cardnumber,String name) {
		System.out.println("payment successfully done with Card");
	}
	void paymentmethod(String UPIid , long phonenumber) {
		System.out.println("payment successfully done with UPI");
	}
	void paymentmethod(long Accnumber , String Accholdername) {
		System.out.println("payment successfully done with Netbanking");
	}
	void paymentmethod(int amount , int otp) {
		System.out.println("payment successfully done with Wallet");
	}
	
	public static void main(String[] args) {
	     
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter your payment option :");
		String selectpayoption = sc.next();		
		PaymentGateway pay = new PaymentGateway();
		
    switch(selectpayoption) {
    case "tab1":
    	pay.paymentmethod(1000);
    	break;
    
    case "tab2" :
    	pay.paymentmethod(112233,"anjali");
    	break;
    
    case "tab3" :
    	pay.paymentmethod("987654321@axl",987654321);
    	break;
    	
    case "tab4" :
    	pay.paymentmethod(1100002233, "CNRB006121");
    	
	case "tab5" :
		pay.paymentmethod(500, 2405);
        break;

}
}
}