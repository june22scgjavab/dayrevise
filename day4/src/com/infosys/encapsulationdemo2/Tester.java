package com.infosys.encapsulationdemo2;
// We dont have any challenges related to the access
// because the methods and variables are public.
public class Tester {
	public static void main(String args[]) {
		Customer customer = new Customer();
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";
		customer.displayCustomerDetails();
	}
}
