package adnanalikhan;

import java.io.File;
import java.util.List;

import org.junit.Test;

import adnanalikhan_dataModel.Passengers;
import org.junit.Assert;
import servcies.PassengerDAO;

public class TestJUN3 {
	
	@Test
	public void testListSizeWithRegualrData() {
		// given a file containing 17 passengers (serialized, csv )
		PassengerDAO dao = new PassengerDAO(new File("src/test/resources/data.csv"));
		
		//when I read() this from the dao (deserlization to a list of passengers)
		List<Passengers> list = dao.read();
		
		//then I should find exactly 17 entries in my passenger list
		Assert.assertEquals(17, list.size());
	}

}
