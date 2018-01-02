package cgodin.qc.ca.metier;

import cgodin.qc.ca.model.Category;
import cgodin.qc.ca.model.ProductForRent;
import cgodin.qc.ca.model.Role;
import cgodin.qc.ca.model.User;

public interface IManager extends IAnnoncerMetier {
     public int addCategory(Category c );
		public void deleteCategoryByid(int idCat);
		public void updateCategory(Category c);
		public void addUser(User u);
		public void setRoleforUser(Role r,int UserId);
		
		 

}
