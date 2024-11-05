package com.vignesh.Main;

import com.vignesh.Entity.Customer;

public class TestLombok {
	
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCid(15);
		customer1.setCname("Lang");
		customer1.setCaddress("San Fransico");
		customer1.setBillamt(1499.99);
		Customer customer2 = new Customer();
		customer2.setCid(15);
		customer2.setCname("Lang");
		customer2.setCaddress("San Fransico");
		customer2.setBillamt(1499.99);
		System.out.println(customer2);
	}

}
