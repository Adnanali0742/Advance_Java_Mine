package adnan_tests_Springs;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import adnanalikhan_dataModel.Passengers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSPR3 {
	
	@Inject
	@Named("MyPassenger")
	Passengers passengers;
	
	@Test
	public void test() {
		Assert.assertEquals("2nd", passengers.getpClass());
	}

}
