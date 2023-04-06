package studio8;

import java.util.Objects;

public class Time {

	private int hour; 
	private int minute; 
	private boolean isTwelveHours; 
	
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	/**
	 * 
	 * @param hour
	 * @param minute
	 * @param isTwelve
	 */
	
	public Time(int hour, int minute, boolean isTwelve) { 
		this.hour = hour; 
		this.minute = minute; 
		this.isTwelveHours = isTwelve; 
	}
	
	public String toString() { 
		if(isTwelveHours = true) { 
			if(hour > 12) { 
				hour = hour - 12; 
			}
		}
		return "The time is " + hour + ":" + minute;
	}
	
	public static void main(String[] args) {
		
		Time test1 = new Time (13, 14, true); 
		System.out.println(test1); 
		
		Time test2 = new Time (13, 14, false); 
		System.out.println(test1.equals(test2));
		
		
		
 
    	
    }

}