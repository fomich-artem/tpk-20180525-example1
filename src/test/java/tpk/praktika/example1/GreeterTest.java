package tpk.praktika.example1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

	Greeter greeter;
	
	@Before
	public void before() {
		// здесь мы подготавливаем объекты, которые будут использоваться в тестовом методе
		// это может быть, например, подключение к БД
		// для примера получим объект greeter
		greeter = new Greeter();
	}

	@After
	public void after() {
		// здесь мы выполняем действия, которые должны быть выполнены после выполнения тестового метода
		// (если это требуется, например, закрытие подключения к БД)
		// для примера просто сбросим greeter в null
		greeter = null;
	}

	@Test // объявляем тестовый метод
	public void testHelloWorld() {
		// вызываем интересующий нас метод, передаем необходимые параметры
		String helloResult = greeter.hello("World");
		// проверяем результат вызова
		Assert.assertEquals("Hello, World!", helloResult);
	}

	@Test
	public void testHelloJava() {
		// вызываем интересующий нас метод, передаем необходимые параметры
		String helloResult = greeter.hello("Java");
		// проверяем результат вызова
		Assert.assertEquals("Hello, Java!", helloResult);
	}

}
