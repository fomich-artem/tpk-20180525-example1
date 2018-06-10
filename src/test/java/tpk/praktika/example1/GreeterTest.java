package tpk.praktika.example1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

	Greeter greeter;
	
	@Before
	public void before() {
		greeter = new Greeter();
	}

	@Test
	public void testHelloWorld() {
		String helloResult = greeter.hello("World");
		Assert.assertEquals("Hello, World!", helloResult);
	}

	@Test
	public void testHelloJava() {
		String helloResult = greeter.hello("Java");
		Assert.assertEquals("Hello, Java!", helloResult);
	}

}
