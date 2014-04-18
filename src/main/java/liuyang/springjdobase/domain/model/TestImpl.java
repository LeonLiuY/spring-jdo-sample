package liuyang.springjdobase.domain.model;

import javax.jdo.annotations.PersistenceCapable;

import lombok.AllArgsConstructor;

@PersistenceCapable
@AllArgsConstructor
public class TestImpl implements ITest {

	private int value;

	@Override
	public boolean isRight() {
		return value > 10;
	}

}
