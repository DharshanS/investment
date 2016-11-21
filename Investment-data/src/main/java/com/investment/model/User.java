
package com.investment.model;

import java.util.ArrayList;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "users")
public class User  implements java.io.Serializable {


	     /**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		@Id
		private int id;
	     private String firstname;
	     private String email;
	     
	     @OneToMany(fetch = FetchType.LAZY, targetEntity = Role.class)
	     private List<Role> roles = new ArrayList<Role>();

	    public User() {
	    }

		
	    public User(int id, String firstname, String email) {
	        this.id = id;
	        this.firstname = firstname;
	        this.email = email;
	    }
	    public User(int id, String firstname, String email, List<Role> roleses) {
	       this.id = id;
	       this.firstname = firstname;
	       this.email = email;
	       this.roles = roleses;
	    }
	   
	    public int getId() {
	        return this.id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getFirstname() {
	        return this.firstname;
	    }
	    
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	    public String getEmail() {
	        return this.email;
	    }
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	   
	    public List<Role> getRoleses() {
	        return this.roles;
	    }
	    
	    public void setRoleses(List<Role> roleses) {
	        this.roles = roleses;
	    }




	}




