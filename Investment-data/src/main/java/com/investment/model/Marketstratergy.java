package com.investment.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Dharshan.S
 *
 */
@Entity
@Table(name = "marketstratergy")
public class Marketstratergy  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private Marketdetails marketdetailses ;

    public Marketstratergy() {
    }

	
    public Marketstratergy(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Marketstratergy(int id, String name, Marketdetails marketdetailses) {
       this.id = id;
       this.name = name;
       this.marketdetailses = marketdetailses;
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
    public Marketdetails getMarketdetailses() {
        return this.marketdetailses;
    }
    
    public void setMarketdetailses(Marketdetails marketdetailses) {
        this.marketdetailses = marketdetailses;
    }




}


