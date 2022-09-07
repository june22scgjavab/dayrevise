package com.infosys.encapsulation4;

public class Tester {
	public static void main(String args[]) {
		Customer customer = new Customer();
		customer.setCustomerId("C101");
		customer.setCustomerName("Stephen Abram");
        customer.setContactNumber(7856341287L);
        customer.setAddress("D089, St. Louis Street, Springfield, 62729");
      customer.getCustomerId(); // No output displayed
      // String id=customer.getCustomerId();
      // System.out.println(id);
             System.out.println(customer.getCustomerId()+"\t"+customer.getCustomerName()+"\t"+customer.getContactNumber()+"\t"+customer.getAddress());
	}
}
