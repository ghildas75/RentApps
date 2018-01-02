package cgodin.qc.ca.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ProductForRent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProduct;
	@NotEmpty
	@Size(min=4,max=30)
	private String  nameProduct;
	private String description;
	private double pricePerDay;
	private double price;
	private boolean isPopular;
	private int quantityStock;
	private String picture;
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;
	/*private String dateAdd;*/
	/*public String getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(String dateAdd) {
		this.dateAdd = dateAdd;
	}*/

	public boolean getIsPopular() {
		return isPopular;
	}

	public void setIsPopular(boolean isPopular) {
		this.isPopular = isPopular;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	

	
	public ProductForRent() {
	
	}

	public ProductForRent(String nameProduct, String description, double pricePerDay,double price, int quantityStock, String picture,
			boolean isPopular) {
		super();
		this.nameProduct = nameProduct;
		this.description = description;
		this.pricePerDay = pricePerDay;
		this.price=price;
		this.quantityStock = quantityStock;
		this.picture = picture;
		this.isPopular = isPopular;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}



	

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
