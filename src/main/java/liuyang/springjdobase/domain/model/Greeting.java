package liuyang.springjdobase.domain.model;

import java.util.Set;

import javax.jdo.annotations.PersistenceCapable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@PersistenceCapable
public class Greeting {

	private String name;
	private String msg;
	
	
	private Set<ITest> tests;
}
