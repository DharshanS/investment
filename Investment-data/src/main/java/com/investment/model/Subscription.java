package com.investment.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "subscription")
public class Subscription  implements java.io.Serializable {


     private int id;
     private Project projects;
     private User users;
     private int status;

    public Subscription() {
    }

    public Subscription(int id, Project projects, User users, int status) {
       this.id = id;
       this.projects = projects;
       this.users = users;
       this.status = status;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Project getProjects() {
        return this.projects;
    }
    
    public void setProjects(Project projects) {
        this.projects = projects;
    }
    public User getUsers() {
        return this.users;
    }
    
    public void setUsers(User users) {
        this.users = users;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }




}


