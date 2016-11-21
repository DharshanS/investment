package com.investment.model;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
@Table(name = "teamdetails")
public class Teamdetails  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
     private Project project;
     private List<Member> members=new ArrayList<Member>();

    public Teamdetails() {
    }

	
    public Teamdetails(int id, Project project) {
        this.id = id;
        this.project = project;
    }
    public Teamdetails(int id, Project project, List<Member> members) {
       this.id = id;
       this.project = project;
       this.members = members;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    @OneToOne(fetch = FetchType.LAZY)
    public Project getproject() {
        return this.project;
    }
    
    public void setproject(Project project) {
        this.project = project;
    }
    public List<Member> getMembers() {
        return this.members;
    }
    
    public void setMembers(List<Member> members) {
        this.members = members;
    }




}


