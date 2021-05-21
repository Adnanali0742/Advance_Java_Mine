package adnanalikhan;

import java.io.File;
import java.util.List;

import adnanalikhan_dataModel.Passengers;
import servcies.PassengerDAO;

public class TestPassengerDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		PassengerDAO dao = new PassengerDAO(new File("src/test/resources/data.csv"));
		List<Passengers> list = dao.read();
		
		if(list == null || list.isEmpty() || list.size() != 17) {
			throw new Exception("Assertion failed expected 17 passenegrs, got: " + list);
		}
		System.out.println("Test successfull..!");
	}

}
