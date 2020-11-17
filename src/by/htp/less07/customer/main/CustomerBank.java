package by.htp.less07.customer.main;
import java.util.List;
import java.util.ArrayList;

public class CustomerBank {
	
	private List <Customer> customers;
	
	public CustomerBank () {
		
		customers = new ArrayList <Customer> ();
		
	}
	
	public List <Customer> getCustomers () {
		
		return customers;
	}
	
	public Customer getCustomers (int index) {
		if(index >= customers.size ()) {
			return null;
		}
		
		return customers.get (index);
	}
	
	public void add (Customer customer) {
		customers.add (customer);
	}
	
	public int size () {
		return customers.size();
	}

	public void remove (int i) {
		customers.remove (i);

	}
	
	public void remove (Customer customer) {
		customers.remove (customer);
	}

	public void add (int i, Customer customer) {
		customers.add (i, customer);
		
	}

}
