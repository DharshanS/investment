package com.investment.model;



import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "campigantype")
public class Campigantype  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
     private String type;
     private Project project;

    public Campigantype() {
    }

	
    public Campigantype(int id, String type) {
        this.id = id;
        this.type = type;
    }
    public Campigantype(int id, String type, Project projectses) {
       this.id = id;
       this.type = type;
       this.project = projectses;
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
    
    @OneToOne(fetch = FetchType.LAZY)
    public Project getProjectses() {
        return this.project;
    }
    
    public void setProjectses(Project projectses) {
        this.project = project;
    }




}


