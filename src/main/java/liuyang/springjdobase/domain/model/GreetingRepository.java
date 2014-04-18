package liuyang.springjdobase.domain.model;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {

	@Autowired
	PersistenceManagerFactory pmf;

	private PersistenceManager pm() {
		return pmf.getPersistenceManager();
	}

	@SuppressWarnings("unchecked")
	public List<Greeting> findAll() {
		Query query = pm().newQuery(Greeting.class);
		return (List<Greeting>) query.execute();
	}
	
	public void create(Greeting greeting) {
		pm().makePersistent(greeting);
	}
}
