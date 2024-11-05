package com.vignesh.Main;

import com.vignesh.Entity.Employee;

public class TestLombok {
	
	public static void main(String[] args) {
		
		/*
		
		Customer customer1 = new Customer();
		customer1.setCid(15);
		customer1.setCname("Lang");
		customer1.setCaddress("San Fransico");
		customer1.setBillamt(1499.99);
		System.out.println(customer1);
		
		Customer customer2 = new Customer();
		customer2.setCid(54);
		customer2.setCname("Bruce");
		customer2.setCaddress("Ohio");
		customer2.setBillamt(2999.99);
		System.out.println(customer2);
		
		Customer customer3 = new Customer();
		customer3.setCid(15);
		customer3.setCname("Lang");
		customer3.setCaddress("San Fransico");
		customer3.setBillamt(1499.99);
		System.out.println(customer3);
		
		System.out.println();
		
		System.out.println(System.identityHashCode(customer1));
		System.out.println(System.identityHashCode(customer2));
		System.out.println(System.identityHashCode(customer3));
		
		System.out.println();
		
		System.out.println(customer1.hashCode());
		System.out.println(customer2.hashCode());
		System.out.println(customer3.hashCode());
		
		*/
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee(53, "mark", 37, "Newyork", 9000.00f);
		Employee employee3 = new Employee("Georgia");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		
	}

}
