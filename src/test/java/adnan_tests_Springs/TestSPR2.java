package adnan_tests_Springs;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSPR2 {
	@Inject
	@Named("MyFirstBean")
	String bean;
	
	@Test
	public void test() {
		// given an application context (loaded by @ContextConfiguration)
		
		// then bean should not be null
		Assert.assertNotNull(bean);
	}

}
