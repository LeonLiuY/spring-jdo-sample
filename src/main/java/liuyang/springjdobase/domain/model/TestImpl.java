package liuyang.springjdobase.domain.model;

import javax.jdo.annotations.PersistenceCapable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@PersistenceCapable
@Getter
public class TestImpl implements ITest {

	private int value;

	@Override
	public boolean right() {
		return value > 10;
	}

}
