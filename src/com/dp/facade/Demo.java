package com.dp.facade;

public class Demo {
	
	/*
	 * Facade Pattern (Structural Pattern):
	 * 	Simplified interface to a library or complex set of classes.
	 * 
	 * Pros:
	 * 1. Code is isolated from system complexity.
	 * 2. Code is clean.
	 * 
	 * Cons:
	 * 1. Facade class can become a common object to all classes in app.
	 */

	public static void main(String[] args) {
		
		User user = new User("Haja", "hajamohideenece@gmail.com", 876768767);
		
//		Ticket tkt = new Ticket();
//		Payment pay = new Payment();
//		Notification noti = new Notification();
//		
//		if(tkt.isTicketAvailable("ps1")) {
//			tkt.createTicket(user, "ps1", 2);
//			pay.makePayment();
//			noti.sendEmail();
//			noti.sendSMS();
//		}
		
		BookingFacade bf = new BookingFacade();
		bf.createBooking(user);
	}
	
	/*
	 * Examples:
	 * 1. Can be used for API's
	 */

}
