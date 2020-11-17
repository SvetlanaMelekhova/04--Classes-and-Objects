package by.htp.less07.customer.main;

/*Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerSearch {

	private CustomerBank bank = new CustomerBank();

	public CustomerSearch() {

	}
	
	public List<Customer> sortByName(CustomerBank bank) {
		List<Customer> customers;
		customers = bank.getCustomers();
        
        Collections.sort(customers, new Comparator<Customer>() {
            public int compare(Customer o1, Customer o2) {
                return o1.getFamilyName().compareToIgnoreCase(o2.getFamilyName());
            }
        });
        return customers;
	}

	public CustomerBank sortByNumberOfCreditCard(CustomerBank bank, int minValue, int maxValue) {

		List<Customer> customers;
		customers = bank.getCustomers();

		for (Customer customer : customers) {
			if (customer.getNumberOfCreditCard() > minValue && customer.getNumberOfCreditCard() < maxValue) {
				this.bank.add(customer);
			}
		}

		return this.bank;

	}

}
