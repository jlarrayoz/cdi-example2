package uy.org.cdi.example;

import java.util.Date;

public class Book {

	  private String title;
	  private Float price;
	  private String description;
	  private String isbn;
	  private Date instanciationDate;

	  public Book() {
	  }

	  public Book(String title, Float price, String description) {
	    this.title = title;
	    this.price = price;
	    this.description = description;
	  }

	  public String getTitle() {
	    return title;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }

	  public Float getPrice() {
	    return price;
	  }

	  public void setPrice(Float price) {
	    this.price = price;
	  }

	  public String getDescription() {
	    return description;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  public String getIsbn() {
	    return isbn;
	  }

	  public void setIsbn(String isbn) {
	    this.isbn = isbn;
	  }

	  public void setInstanciationDate(Date instanciationDate) {
	    this.instanciationDate = instanciationDate;
	  }

	  public Date getInstanciationDate() {
	    return instanciationDate;
	  }


	  @Override
	  public String toString() {
	    final StringBuilder sb = new StringBuilder();
	    sb.append("Book01");
	    sb.append(", title='").append(title).append('\'');
	    sb.append(", price=").append(price);
	    sb.append(", description='").append(description).append('\'');
	    sb.append(", isbn='").append(isbn).append('\'');
	    sb.append('}');
	    return sb.toString();
	  }
	}
