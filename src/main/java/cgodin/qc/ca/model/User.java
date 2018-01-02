package cgodin.qc.ca.model;
import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="users")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="user_id")
	private int idUser;
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	private boolean isActived;
	@OneToMany
	@JoinColumn(name="user_id")
	private Collection<Role> Roles= new ArrayList<Role>();
	public User() {
		
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return isActived;
	}
	public void setActived(boolean isActived) {
		this.isActived = isActived;
	}
	public Collection<Role> getRoles() {
		return Roles;
	}
	public void setRoles(Collection<Role> roles) {
		Roles = roles;
	}
	public User(String username, String password, boolean isActived) {
		super();
		this.username = username;
		this.password = password;
		this.isActived = isActived;
	}
	
	
}
