package com.spring.cloud.es;

import javax.transaction.UserTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.spring.cloud.es.config.DBConfig1;
import com.spring.cloud.es.config.DBConfig2;

@Configuration
@SpringBootApplication
public class SpringJtaAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringJtaAdminApplication.class, args);
	}
	@Bean(name = "AllTransactionManager")  
    @Primary  
    public JtaTransactionManager regTransactionManager () {  
        UserTransactionManager userTransactionManager = new UserTransactionManager();  
        UserTransaction userTransaction = new UserTransactionImp();  
        return new JtaTransactionManager(userTransaction, userTransactionManager);  
    }  
	
	@Bean(name="DBConfig1")
	public DBConfig1 createDBConfig1(){
		return new DBConfig1();
	}
	
	@Bean(name="DBConfig2")
	public DBConfig2 createDBConfig2(){
		return new DBConfig2();
	}
}