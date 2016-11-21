
/**
 * 
 */
package com.investment.dao;

import java.util.List;

/**
 * @author Dharshan.S
 *
 */
public interface InvestmentBaseDao {
	
	public <T> Object findById(int id);
	public <T> Object findByEmail(String email);
	public <T> Object insert(T object);
	public <T> List<T> viewAll(String table);
	public <T> Object findByName(String name);

}
