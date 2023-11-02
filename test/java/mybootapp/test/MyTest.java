package mybootapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import mybootapp.Model.Person;
import mybootapp.Repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import mybootapp.Starter;

@SpringBootTest
@ContextConfiguration(classes = Starter.class)
public class MyTest {

	@Autowired
	PersonRepository cr;

	@Test
	public void testSave() {
		var c = cr.save(new Person());
		var c2 = cr.findById(c.getId());
		assertEquals(c2.get().getName(), "Test 1");
		System.err.printf("course id = %d\n", c.getId());
	}

}
