package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private String month; 
	private int day; 
	private int year; 
	private boolean isHoliday;
	

	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}

	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date (String month, int day, int year, boolean isHoliday) { 
		this.month = month; 
		this.day = day; 
		this.year = year; 
		this.isHoliday = isHoliday; 
	}
	
	public String toString() { 
		if (isHoliday == true) { 
			return "Today's date is " +  month + " " + day + " " + year + ", and it is a holiday"; 
		}
		return "Today's date is " +  month + " " + day + " " + year + ", and it is not a holiday"; 
	}
	

    public static void main(String[] args) {
    
    	Date test1 = new Date ("March", 12, 2003, false); 
    	Date test2 = new Date ("February", 13, 2003, true); 
    	Date test3 = new Date ("February", 13, 2003, false); 
    	Date test4 = new Date ("January", 12, 2022, true); 
    	Date test5 = new Date ("October", 28, 2022, true);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(test1); 
    	list.add(test1);
    	list.add(test3); 
    	list.add(test4); 
    	list.add(test5);
    	
    	System.out.println(list);
    	
    	
    	
    	System.out.println(test2.equals(test3));
    	System.out.println(test1.equals(test2));
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(test1); 
    	set.add(test2);
    	set.add(test1);
     
    	
    	System.out.println(set);
    	
    }

}
