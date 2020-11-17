package by.htp.less07.customer.main;

import java.util.List;

public class CustomerView {
	
	public CustomerView () {
		
	}
	
	public void printCustomer (Customer customer) {
		
		System.out.println ("Информация о клиенте: " + customer.toString());
		
	}
	
	public void printAllCustomers (CustomerBank info) {
		
		List <Customer> customers;
		customers = info.getCustomers();
		
		for (Customer customer : customers) {
			
			System.out.println(customer.toString());
			
		}
	}

}
