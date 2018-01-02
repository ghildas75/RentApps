package cgodin.qc.ca.model;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
@Entity
public class Customer implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int  idCustomer;
private String  name;
private String adress;
private String email;
private String phoneNumber;
@OneToMany (mappedBy="customer")
private  Collection<RentOrder> lstOrder;

public Customer() {

}

public Customer(String name, String adress, String email, String phoneNumber) {
	super();
	this.name = name;
	this.adress = adress;
	this.email = email;
	this.phoneNumber = phoneNumber;
}

public int getIdCustomer() {
	return idCustomer;
}
public void setIdCustomer(int idCustomer) {
	this.idCustomer = idCustomer;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Collection<RentOrder> getLstOrder() {
	return lstOrder;
}
public void setLstOrder(Collection<RentOrder> lstOrder) {
	this.lstOrder = lstOrder;
}

}
