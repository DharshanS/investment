package com.investment.model;


import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "customertype")
public class Customertype  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
     private String type;
     private Project project ;

    public Customertype() {
    }

	
    public Customertype(int id, String type) {
        this.id = id;
        this.type = type;
    }
    public Customertype(int id, String type, Project project) {
       this.id = id;
       this.type = type;
       this.project = project;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Project getProjectses() {
        return this.project;
    }
    
    public void setProjectses(Project projectses) {
        this.project = projectses;
    }




}


