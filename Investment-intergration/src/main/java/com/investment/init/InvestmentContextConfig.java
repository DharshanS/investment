package com.investment.init;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.investment.entity.*;






/**
 * @author Dharshan.S
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.investment.controllers","com.investment.services","com.investment.dao","com.investment.model","com.investment.json"})
public class InvestmentContextConfig {
	
	
	  @Bean(name = "dataSource")
	    public DataSource getDataSource() {
	    	BasicDataSource dataSource = new BasicDataSource();
	    	dataSource.setDriverClassName("org.postgresql.Driver");
	    	dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/investment?tcpKeepAlive=true");
	    	dataSource.setUsername("postgres");
	    	dataSource.setPassword("admin");
	    	
	    	return dataSource;
	    }

	  
	  private Properties getHibernateProperties() {
	    	Properties properties = new Properties();
	    	properties.put("hibernate.show_sql", "true");
	    	properties.put("hibernate.dialect", "org.hibernate.dialect.ProgressDialect");
	    	/*properties.put("hibernate.hbm2ddl.auto", "create");*/
	    	return properties;
	    }
	    
	  
	  	@Autowired
	    @Bean(name = "sessionFactory")
	    public SessionFactory getSessionFactory(DataSource dataSource) 
	  	{ 
	  		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    	sessionBuilder.addProperties(getHibernateProperties());
	    	sessionBuilder.addAnnotatedClass(User.class);
	    	sessionBuilder.addAnnotatedClass(Role.class);
	    	sessionBuilder.addAnnotatedClass(CampaignType.class);
	     	sessionBuilder.addAnnotatedClass(Company.class);
	     	sessionBuilder.addAnnotatedClass(Currency.class);
	     	sessionBuilder.addAnnotatedClass(Customertype.class);
	     	sessionBuilder.addAnnotatedClass(Designations.class);
	     	sessionBuilder.addAnnotatedClass(Investment.class);
	     	sessionBuilder.addAnnotatedClass(Investsectores.class);
	     	sessionBuilder.addAnnotatedClass(Investsectorsmap.class);
	     	sessionBuilder.addAnnotatedClass(Market.class);
	     	sessionBuilder.addAnnotatedClass(Marketdetails.class);
	     	sessionBuilder.addAnnotatedClass(Marketstratergy.class);
	     	sessionBuilder.addAnnotatedClass(Project.class);
	     	sessionBuilder.addAnnotatedClass(Subscription.class);
	     	sessionBuilder.addAnnotatedClass(Member.class);
	     	sessionBuilder.addAnnotatedClass(Teamdetails.class);
	     	sessionBuilder.addAnnotatedClass(Userdetails.class);
	     	sessionBuilder.addAnnotatedClass(Userproject.class);
	    	SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
	    
			return sessionFactory;
	  		       
 
	    }
	   
	  	
	  	@Autowired
		@Bean(name = "transactionManager")
		public HibernateTransactionManager getTransactionManager(
				SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager(
					sessionFactory);

			return transactionManager;
		}
	    
}





