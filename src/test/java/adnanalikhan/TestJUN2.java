package adnanalikhan;

import java.io.File;
import java.util.List;

import org.junit.Test;

import adnanalikhan_dataModel.Passengers;
import servcies.PassengerDAO;

public class TestJUN2 {
	
	@Test
	public void test() {
		PassengerDAO dao = new PassengerDAO(new File("src/test/resources/data.csv"));
		List<Passengers> list = dao.read();
		System.out.println(list);
	}

}
