package by.htp.less07.book.main;


public class Book {
	private int id;
	private String title;
	private String autor;
	private String publishingHouse;
	private int yearOfPublishing;
	private int numberOfPages;
	private int price;
	private String bindingType;
	
	public Book () {
		
	}

	public Book(int id, String title, String autor, String publishingHouse, int yearOfPublishing, int numberOfPages,
			int price, String bindingType) {
		this.id = id;
		this.title = title;
		this.autor = autor;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public void setId (int id) {
		this.id = id;
	}

	public int getId () {
		return id;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public String setTitle () {
		return title;
	}
	
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
	public String getAutor () {
		return autor;
	}
	
	public void setPublishingHouse (String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	public String getPublishingHouse () {
		return publishingHouse;
	}
	
	public void setYearOfPublishing (int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	} 
	
	public int getYearOfPublishing () {
		return yearOfPublishing;
	}
	
	public void setNumberOfPages (int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public int getNumberOfPages () {
		return numberOfPages;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public int getPrice () {
		return price;
	}
	
	public void setBindingType (String bindingType) {
		this.bindingType = bindingType;
	}
	
	public String getBindingType () {
		return bindingType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfPages;
		result = prime * result + price;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfPublishing;
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
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (price != other.price)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}
	
	@Override
	public String toString () {
		return id+" "+title+" "+autor+" "+publishingHouse+" "+yearOfPublishing+" "+numberOfPages+" "+price+" "+bindingType;
	}


}
