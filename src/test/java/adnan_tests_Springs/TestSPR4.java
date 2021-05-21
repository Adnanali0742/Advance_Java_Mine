package adnan_tests_Springs;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSPR4 {
	
	@Inject
	@Named("mainDS")
	DataSource ds;
	
	@Test
	public void test() throws SQLException {
		Assert.assertEquals("PUBLIC", ds.getConnection().getSchema());
	}

}
