package liuyang.springjdobase;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jdo.TransactionAwarePersistenceManagerFactoryProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan
public class Application {

	
	PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("test");
	@Bean
	TransactionAwarePersistenceManagerFactoryProxy persistenceManagerFactoryProxy(){
		TransactionAwarePersistenceManagerFactoryProxy proxy = new TransactionAwarePersistenceManagerFactoryProxy();
		proxy.setTargetPersistenceManagerFactory(pmf);
		proxy.setAllowCreate(false);
		return proxy;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
