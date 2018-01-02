package ca.cgodin.qc.dao;

import java.util.*;


import cgodin.qc.ca.model.Category;
import cgodin.qc.ca.model.Customer;

import cgodin.qc.ca.model.ProductForRent;
import cgodin.qc.ca.model.RentOrder;
import cgodin.qc.ca.model.Role;
import cgodin.qc.ca.model.User;

public interface IRentalDao {

	public int addCategory(Category c );
	public List<Category> getAllCategory();
	public Category getCategoryById(int idCat);
	public void deleteCategoryByid(int idCat);
	public void updateCategory(Category c);
	public int addProduct(ProductForRent p, int idCat);
	public List<ProductForRent> getallProduct();
	public List<ProductForRent> getProductsByCategory(int catId);
    public List<ProductForRent> getPopularProduct();
	public ProductForRent  getProductById(int IdProduct);
	public void deleteProduct(int IdProduit);
	public void updateProduct(ProductForRent p);
	public void addUser(User u);
	public void setRoleforUser(Role r,int UserId);
	

}
