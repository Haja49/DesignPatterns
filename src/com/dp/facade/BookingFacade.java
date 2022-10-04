package com.dp.facade;

public class BookingFacade {

	public void createBooking(User user) {
		Ticket tkt = new Ticket();
		Payment pay = new Payment();
		Notification noti = new Notification();
		
		if(tkt.isTicketAvailable("ps1")) {
			tkt.createTicket(user, "ps1", 2);
			pay.makePayment();
			noti.sendEmail();
			noti.sendSMS();
		}
	}
}
