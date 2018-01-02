package cgodin.qc.ca.metier;

import java.util.List;

import ca.cgodin.qc.dao.IRentalDao;
import cgodin.qc.ca.model.*;


public class UserImpl  implements IPublicUser{
private IRentalDao rd;
	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return rd.getAllCategory();
	}

	@Override
	public Category getCategoryById(int idCat) {
		// TODO Auto-generated method stub
		return rd.getCategoryById(idCat);
	}

	@Override
	public List<ProductForRent> getallProduct() {
		// TODO Auto-generated method stub
		return rd.getallProduct();
	}

	@Override
	public List<ProductForRent> getProductsByCategory(int catId) {
		// TODO Auto-generated method stub
		return rd.getProductsByCategory(catId);
	}

	

	@Override
	public List<ProductForRent> getPopularProduct() {
		// TODO Auto-generated method stub
		return rd.getPopularProduct();
	}

	@Override
	public ProductForRent getProductById(int IdProduct) {
		// TODO Auto-generated method stub
		return rd.getProductById(IdProduct);
	}

	

}
