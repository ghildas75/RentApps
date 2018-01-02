package cgodin.qc.ca.metier;

import java.util.List;

import cgodin.qc.ca.model.*;



public interface IPublicUser {

	public List<Category> getAllCategory();
	public Category getCategoryById(int idCat);
	public List<ProductForRent> getallProduct();
	public List<ProductForRent> getProductsByCategory(int catId);
	public List<ProductForRent> getPopularProduct();
	public ProductForRent  getProductById(int IdProduct);

}
