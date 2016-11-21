package com.investment.model;
// Generated 16-Nov-2016 17:31:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "investsectores")
public class Investsectores  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
     private String name;
     private Set investsectorsmaps = new HashSet(0);

    public Investsectores() {
    }

	
    public Investsectores(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Investsectores(int id, String name, Set investsectorsmaps) {
       this.id = id;
       this.name = name;
       this.investsectorsmaps = investsectorsmaps;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getInvestsectorsmaps() {
        return this.investsectorsmaps;
    }
    
    public void setInvestsectorsmaps(Set investsectorsmaps) {
        this.investsectorsmaps = investsectorsmaps;
    }




}


