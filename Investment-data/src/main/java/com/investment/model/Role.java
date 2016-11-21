
package com.investment.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "roles")
public class Role implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
    private User users;
    private String type;

   public Role() {
   }

   public Role(int id, User users, String type) {
      this.id = id;
      this.users = users;
      this.type = type;
   }
  
   public int getId() {
       return this.id;
   }
   
   public void setId(int id) {
       this.id = id;
   }
   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "uid", nullable = false)
   public User getUsers() {
       return this.users;
   }
   
   public void setUsers(User users) {
       this.users = users;
   }
   public String getType() {
       return this.type;
   }
   
   public void setType(String type) {
       this.type = type;
   }




}