package com.investment.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "userproject")
public class Userproject  implements java.io.Serializable {


     private int id;
     private User users;
     private String name;
     private String file;
     private int status;

    public Userproject() {
    }

    public Userproject(int id, User users, String name, String file, int status) {
       this.id = id;
       this.users = users;
       this.name = name;
       this.file = file;
       this.status = status;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public User getUsers() {
        return this.users;
    }
    
    public void setUsers(User users) {
        this.users = users;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getFile() {
        return this.file;
    }
    
    public void setFile(String file) {
        this.file = file;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }




}


