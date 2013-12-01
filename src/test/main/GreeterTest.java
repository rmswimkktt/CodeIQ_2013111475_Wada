package test.main;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import main.Greeter;

import org.junit.Test;


public class GreeterTest {

	@Test
	public void morning() {
		Greeter greeter = new Greeter();
		String expected = "おはようございます";
		assertThat(greeter.greet(), is(expected));
	}

}
