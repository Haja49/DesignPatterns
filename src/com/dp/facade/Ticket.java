package com.dp.facade;

public class Ticket {

	public boolean isTicketAvailable(String movieName) {
		return true;
	}
	
	public void createTicket(User user, String movieName, int noOfTickets) {
		System.out.println("Tickets booked successfully");
	}
}
