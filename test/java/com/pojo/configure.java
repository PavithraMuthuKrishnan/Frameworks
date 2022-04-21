package com.pojo;

import org.baseclasscreation.BaseClass;

public class configure extends BaseClass{
	
	public static void main(String[] args){
		
		browserConfiguration();
		openUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		implicitlyWait(30);

		
		
		Login l= new Login();
		insertText(l.getTxtEmail(),"Pavi");
		refreshPage();
		insertText(l.getTxtEmail(), "pavithra1997");
		insertText(l.getTxtPass(), "123456789");
		buttonClick(l.btnLogin());
		
		
		SearchHotel s = new SearchHotel();
		
		ddnByVisibleText(s.getLocation(), "Los Angeles");
		ddnByVisibleText(s.getHotels(), "Hotel Cornice");
		insertText(s.getCheckindate(), "6/4/22");
		insertText(s.getCheckoutdate(), "10/4/22");
		insertText(s.getRoomtypes(), "2-Two");
		insertText(s.getNumberofrooms(), "1-one");
		insertText(s.getAdultsperroom(), "2");
		insertText(s.getChildrenperroom(), "0");
		buttonClick(s.getSearch1());
		
		
		SelectHotel h = new SelectHotel();
		buttonClick(h.getSelect());
		buttonClick(h.getBtncontinue());
		
		
		
		BookHotel b = new BookHotel();
		insertText(b.getFname(), "Pavithra");
		insertText(b.getLname(), "MuthuKrishnan");
		insertText(b.getAddress(), "Trichy");
		insertText(b.getCardnumber(), "1234567890123456");
		insertText(b.getCardtype(), "VISA");
		insertText(b.getExpirymonth(),"August" );
		insertText(b.getExpiryyear(), "2025");
		insertText(b.getCvvnumber(), "7686");
		buttonClick(b.getBtnbooknow());
		
		
		BookingConfirmation c = new BookingConfirmation();
		buttonClick(c.getLogout());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	

}
