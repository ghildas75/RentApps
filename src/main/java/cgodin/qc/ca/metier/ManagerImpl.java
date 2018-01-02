package cgodin.qc.ca.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ca.cgodin.qc.dao.IRentalDao;
import cgodin.qc.ca.model.*;
@Transactional
public class ManagerImpl  implements IManager{
private IRentalDao dao;
	/*public IRentalDao getDao() {
	return dao;
}
*/
public void setDao(IRentalDao dao) {
	this.dao = dao;
}

@Override
public List<Category> getAllCategory() {
	// TODO Auto-generated method stub
	return dao.getAllCategory();
}

@Override
public Category getCategoryById(int idCat) {
	// TODO Auto-generated method stub
	return dao.getCategoryById(idCat);
}

@Override
public List<ProductForRent> getallProduct() {
	// TODO Auto-generated method stub
	return dao.getallProduct();
}

@Override
public List<ProductForRent> getProductsByCategory(int catId) {
	// TODO Auto-generated method stub
	return dao.getProductsByCategory(catId);
}



@Override
public List<ProductForRent> getPopularProduct() {
	// TODO Auto-generated method stub
	return dao.getPopularProduct();
}

@Override
public ProductForRent getProductById(int IdProduct) {
	// TODO Auto-generated method stub
	return dao.getProductById(IdProduct);
}



@Override
public int addCategory(Category c) {
	// TODO Auto-generated method stub
	return dao.addCategory(c);
}

@Override
public void deleteCategoryByid(int idCat) {
	// TODO Auto-generated method stub
	dao.deleteCategoryByid(idCat);
}

@Override
public void updateCategory(Category c) {
	// TODO Auto-generated method stub
	dao.updateCategory(c);
}

@Override
public int addProduct(ProductForRent p, int idCat) {
	// TODO Auto-generated method stub
	return dao.addProduct(p, idCat);
}

@Override
public void deleteProduct(int IdProduit) {
	// TODO Auto-generated method stub
 dao.deleteProduct(IdProduit);
}

@Override
public void updateProduct(ProductForRent p) {
	// TODO Auto-generated method stub
	dao.updateProduct(p);
}

@Override
public void addUser(User u) {
	// TODO Auto-generated method stub
	dao.addUser(u);
}

@Override
public void setRoleforUser(Role r, int UserId) {
	// TODO Auto-generated method stub
	dao.setRoleforUser(r, UserId);
}
	

}
