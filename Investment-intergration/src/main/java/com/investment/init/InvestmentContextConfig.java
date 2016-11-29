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

import com.investment.entity.CampaignType;
import com.investment.entity.Company;
import com.investment.entity.Currency;
import com.investment.entity.CustomerType;
import com.investment.entity.Designation;
import com.investment.entity.Investment;
import com.investment.entity.InvestmentSector;
import com.investment.entity.InvestmentSectorMap;
import com.investment.entity.Market;
import com.investment.entity.MarketDetails;
import com.investment.entity.MarketStratergy;
import com.investment.entity.Member;
import com.investment.entity.Project;
import com.investment.entity.Role;
import com.investment.entity.Subscription;
import com.investment.entity.TeamDetail;
import com.investment.entity.User;
import com.investment.entity.UserDetail;
import com.investment.entity.UserProject;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.investment.controllers", "com.investment.services", "com.investment.dao",
		"com.investment.entity", "com.investment.json", "com.investment.manager",
		"com.investment.entrepreneur.entity" })
public class InvestmentContextConfig {

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/newinvestment?tcpKeepAlive=true");
		dataSource.setUsername("postgres");
		dataSource.setPassword("admin");

		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.ProgressDialect");
		properties.put("hibernate.hbm2ddl.auto", "create");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Role.class);
		sessionBuilder.addAnnotatedClass(CampaignType.class);
		sessionBuilder.addAnnotatedClass(Company.class);
		sessionBuilder.addAnnotatedClass(Currency.class);
		sessionBuilder.addAnnotatedClass(CustomerType.class);
		sessionBuilder.addAnnotatedClass(Designation.class);
		sessionBuilder.addAnnotatedClass(Investment.class);
		sessionBuilder.addAnnotatedClass(InvestmentSector.class);
		sessionBuilder.addAnnotatedClass(InvestmentSectorMap.class);
		sessionBuilder.addAnnotatedClass(Market.class);
		sessionBuilder.addAnnotatedClass(MarketDetails.class);
		sessionBuilder.addAnnotatedClass(MarketStratergy.class);
		sessionBuilder.addAnnotatedClass(Project.class);
		sessionBuilder.addAnnotatedClass(Subscription.class);
		sessionBuilder.addAnnotatedClass(Member.class);
		sessionBuilder.addAnnotatedClass(TeamDetail.class);
		sessionBuilder.addAnnotatedClass(UserDetail.class);
		sessionBuilder.addAnnotatedClass(UserProject.class);
/*		sessionBuilder.addAnnotatedClass(RowData.class);
		sessionBuilder.addAnnotatedClass(Upload.class);*/
		SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();

		return sessionFactory;

	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

		return transactionManager;
	}

}
