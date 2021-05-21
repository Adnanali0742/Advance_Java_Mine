package servcies;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import adnanalikhan_dataModel.Passengers;

public class PassengerDAO {
	private static final String DELIM = ";";
	private File file;

	public PassengerDAO(File file) {
		this.file = file;
	}

	public List<Passengers> read(){
		List<Passengers> passengers = new ArrayList<Passengers>();
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			lines.remove(0);
			for (String line : lines) {
				String[] passengerParts = line.split(DELIM);
				Passengers passenger = new Passengers();			
				passenger.setName(passengerParts[0].trim());
				passenger.setpClass(passengerParts[1].trim());
				String rawAge = passengerParts[2];
				if(rawAge != null && !rawAge.trim().isEmpty()) {
					double age = Double.valueOf(rawAge.trim());
					passenger.setAge(age);
				}
				String sex = passengerParts[3];
				passenger.setSex(sex);
				String rawServived = passengerParts[4];
				if(rawServived != null && !rawServived.trim().isEmpty()) {
					Integer servived = Integer.valueOf(rawServived.trim());
					passenger.setServived(servived);
				}
				passengers.add(passenger);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return passengers;
	}
	public void sortByPassengerClass(List<Passengers> passengers) {
		passengers.sort((p1,p2)-> p1.getpClass().compareTo(p2.getpClass()));
	}
}
