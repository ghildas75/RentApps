package ca.cgodin.qc.dao;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import cgodin.qc.ca.model.Category;
import cgodin.qc.ca.model.*;




public class RentalDaoImpl implements IRentalDao{
     @PersistenceContext
     private EntityManager em;
	@Override
	public int addCategory(Category c) {
		// TODO Auto-generated method stub
		em.persist(c);
		return c.getIdCategory();
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		Query sql=em.createQuery("select c from Category c");
		return sql.getResultList();
	}

	@Override
	public Category getCategoryById(int idCat) {
		// TODO Auto-generated method stub
		
		return em.find(Category.class, idCat);
	}

	@Override
	public void deleteCategoryByid(int idCat) {
		// TODO Auto-generated method stub
		Category c=em.find(Category.class, idCat);
		em.remove(c);
	}

	@Override
	public void updateCategory(Category c) {
		// TODO Auto-generated method stub
		em.merge(c);
	}

	@Override
	public int addProduct(ProductForRent p, int idCat) {
		// TODO Auto-generated method stub
		Category c=getCategoryById(idCat);
		p.setCategory(c);
		em.persist(p);
		return p.getIdProduct();
	}

	@Override
	public List<ProductForRent> getallProduct() {
		// TODO Auto-generated method stub
			Query sql=em.createQuery("select p from ProductForRent p");
		return sql.getResultList();
	}

	@Override
	public List<ProductForRent> getProductsByCategory(int catId) {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select p from ProductForRental where p.Category.idCategory=:x");
		return req.getResultList() ;
	}

	

	@Override
	public List<ProductForRent> getPopularProduct() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select p from ProductForRental where p.isPopular=:true");
		return req.getResultList();
	}

	@Override
	public ProductForRent getProductById(int IdProduct) {
		// TODO Auto-generated method stub
		return em.find(ProductForRent.class,IdProduct);
	}

	@Override
	public void deleteProduct(int IdProduit) {
		// TODO Auto-generated method stub
		ProductForRent p=getProductById(IdProduit);
		em.remove(p);
		
	}

	@Override
	public void updateProduct(ProductForRent p) {
		// TODO Auto-generated method stub
		em.merge(p);
	}

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		em.persist(u);
	}

	@Override
	public void setRoleforUser(Role r, int UserId) {
	User u=em.find(User.class, UserId);
	u.getRoles().add(r);
		
	}



}
