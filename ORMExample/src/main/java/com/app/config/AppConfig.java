package com.app.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.app.model.Prashanth;

@Configuration
@ComponentScan("com.app")
@PropertySource("app.properties")
@EnableTransactionManagement
public class AppConfig {
	@Autowired
	private Environment env;
	
	//data source
	@Bean
	public DriverManagerDataSource ds() {
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName(env.getProperty("dc"));
		d.setUrl(env.getProperty("url"));
		d.setUsername(env.getProperty("user"));
		d.setPassword(env.getProperty("pwd"));
	return d;
	
	
	}
	
	//session factory
	@Bean
	public LocalSessionFactoryBean 	lfs() {
		LocalSessionFactoryBean l=new LocalSessionFactoryBean();
		l.setDataSource(ds());
		l.setHibernateProperties(props());
		l.setAnnotatedClasses(Prashanth.class);
		return l;
	}
	
	@Bean
	public Properties props() {
		Properties p=new Properties();
		p.put("hibernate.dailect",env.getProperty("dialect"));
		p.put("hibernate.show_sql",env.getProperty("showsql"));
		p.put("hibernate.format_sql",env.getProperty("fmtsql"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("ddlauto"));
		return p;
	}
	
	@Bean
	public HibernateTemplate ht() {
		HibernateTemplate h=new HibernateTemplate();
		h.setSessionFactory(lfs().getObject());
		return h;
	}
	@Bean
	public HibernateTransactionManager htm() {
		HibernateTransactionManager m=new HibernateTransactionManager();
		m.setSessionFactory(lfs().getObject());
		return m;
		
	}
	
	
	
	
	
	
	
	

}
