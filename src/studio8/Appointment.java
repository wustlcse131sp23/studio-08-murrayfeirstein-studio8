package studio8;

import java.util.Objects;

public class Appointment {

	private Date date; 
	private Time time; 
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}


	public Appointment(Date date, Time time) { 
		this.date = date; 
		this.time = time; 
	}
	
	
	public static void main(String[] args) {
		Date dOne = new Date("March", 21, 2023, false); 
		Time tOne = new Time(12, 15, true); 
		Appointment aOne = new Appointment (dOne, tOne); 
		
		Date dTwo = new Date("March", 23, 2022, false); 
		Time tTwo = new Time(15, 13, true); 
		Appointment aTwo = new Appointment (dTwo, tTwo); 

	}

}
