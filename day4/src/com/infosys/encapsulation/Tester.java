package com.infosys.encapsulation;
class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
    
    public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
}
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
