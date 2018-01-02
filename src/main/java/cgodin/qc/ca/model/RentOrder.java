package cgodin.qc.ca.model;
import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
@Entity
public class RentOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idOrder;
	private Date  startDate;
	private Date  returnDate;
	@OneToMany (mappedBy="order")

	@ManyToOne
	@JoinColumn(name="idCustomer")
	private Customer customer;
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	public RentOrder() {
		super();
	}
	
	
}
