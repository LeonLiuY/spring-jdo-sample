package liuyang.springjdobase.domain.model;

import java.util.Set;

import javax.jdo.annotations.PersistenceCapable;

import lombok.AllArgsConstructor;
import lombok.Data;

@PersistenceCapable
@Data
@AllArgsConstructor
public class Greeting {

	private String name;
	private String msg;
	
	
	private Set<ITest> tests;
}
