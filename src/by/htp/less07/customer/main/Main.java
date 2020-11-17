package by.htp.less07.customer.main;
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer (578, "Мелехова" , "Светлана" , "Александровна" , "Притыцкого 86" , 459865 , 376895);
		Customer customer2 = new Customer (579, "Махина" , "Елена" , "Витальевна" , "Каменногорская 114" , 579641 , 945687);
		Customer customer3 = new Customer (580, "Ромахова" , "Зинаида" , "Петровна" , "Ленина 16" , 321786 , 497631);
		Customer customer4 = new Customer (581, "Пупкин" , "Василий" , "Александрович" , "Неманская 38" , 621586 , 976314);
		Customer customer5 = new Customer (582, "Кузьков" , "Павел" , "Сергеевич" , "Железнодорожников 89" , 648951 , 369775);
		Customer customer6 = new Customer (583, "Шерстнева" , "Дарья" , "Олеговна" , "Белолужская 8" , 697987 , 649876);
		
		CustomerBank bank = new CustomerBank ();
		CustomerView print = new CustomerView ();
		
		bank.add(customer1);
		bank.add(customer2);
		bank.add(customer3);
		bank.add(customer4);
		bank.add(customer5);
		bank.add(customer6);
		
		//bank.size();
		//print.printAllCustomers(bank);
		
		CustomerSearch search = new CustomerSearch ();
		CustomerBank bank1 = new CustomerBank ();
		
		//bank1 = search.sortByNumberOfCreditCard(bank, 500000, 700000);
		
		//search.sortByName(bank);
		print.printAllCustomers(bank);

	}

}
