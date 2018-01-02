package cgodin.qc.ca.metier;

import cgodin.qc.ca.model.ProductForRent;

public interface IAnnoncerMetier extends IPublicUser {
	public int addProduct(ProductForRent p, int idCat);
	public void deleteProduct(int IdProduit);
	public void updateProduct(ProductForRent p);
	
	
}
