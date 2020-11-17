package by.htp.less07.customer.main;
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
public class Customer {
	
	private int id;
	private String familyName;
	private String name;
	private String patronymic;
	private String adress;
	private int numberOfCreditCard;
	private int numberOfBankAccount;
	
	public Customer () {
		
	}
	
	public Customer (int id, String familyName, String name, String patronymic, String adress, int numberOfCreditCard, int numberOfBankAccount) {
		
		this.id = id;
		this.familyName = familyName;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.numberOfCreditCard = numberOfCreditCard;
		this.numberOfBankAccount = numberOfBankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumberOfCreditCard() {
		return numberOfCreditCard;
	}

	public void setNumberOfCreditCard(int numberOfCreditCard) {
		this.numberOfCreditCard = numberOfCreditCard;
	}

	public int getNumberOfBankAccount() {
		return numberOfBankAccount;
	}

	public void setNumberOfBankAccount(int numberOfBankAccount) {
		this.numberOfBankAccount = numberOfBankAccount;
	}

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((familyName == null) ? 0 : familyName.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfBankAccount;
		result = prime * result + numberOfCreditCard;
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (familyName == null) {
			if (other.familyName != null)
				return false;
		} else if (!familyName.equals(other.familyName))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfBankAccount != other.numberOfBankAccount)
			return false;
		if (numberOfCreditCard != other.numberOfCreditCard)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Customer id=" + id + " " + familyName + " " + name + " " + patronymic
				+ "  aдрес: " + adress + " Номер карты: " + numberOfCreditCard + " Номер счета: "
				+ numberOfBankAccount ;
	}


	
      
}
