package cgodin.qc.ca.model;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Category implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCategory;
	@NotEmpty
	@Size(min=3,max=10
	)
	private String nameCategory;
	private String  description;
	@Lob
	private byte[] pictures;
	private String namePicture;
	@OneToMany(mappedBy="category")
	private Collection<ProductForRent> products;
	
	
	public Category() {
		
	}
	public Category(String nameCategory, String description, byte[] pictures, String namePicture) {
		
		this.nameCategory = nameCategory;
		this.description = description;
		this.pictures = pictures;
		this.namePicture = namePicture;
	}
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getNameCategory() {
		return nameCategory;
	}
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getPictures() {
		return pictures;
	}
	public void setPictures(byte[] pictures) {
		this.pictures = pictures;
	}
	public String getNamePicture() {
		return namePicture;
	}
	public void setNamePicture(String namePicture) {
		this.namePicture = namePicture;
	}
	public Collection<ProductForRent> getProducts() {
		return products;
	}
	public void setProducts(Collection<ProductForRent> products) {
		this.products = products;
	}
	
}
