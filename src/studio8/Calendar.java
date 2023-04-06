package studio8;

import java.util.LinkedList;

public class Calendar {

	
	private LinkedList<Appointment> list;
	
	public Calendar() { 
		LinkedList<Appointment> list = new LinkedList<Appointment>();
	}
	
	public void addAppt(Appointment ap) { 
		list.add(ap); 
	}
	
}
