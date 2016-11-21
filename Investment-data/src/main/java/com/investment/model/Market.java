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
@Table(name = "market")
public class Market  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
     private String place;
     private Set marketdetailses = new HashSet(0);

    public Market() {
    }

	
    public Market(int id, String place) {
        this.id = id;
        this.place = place;
    }
    public Market(int id, String place, Set marketdetailses) {
       this.id = id;
       this.place = place;
       this.marketdetailses = marketdetailses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getPlace() {
        return this.place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }
    public Set getMarketdetailses() {
        return this.marketdetailses;
    }
    
    public void setMarketdetailses(Set marketdetailses) {
        this.marketdetailses = marketdetailses;
    }




}


