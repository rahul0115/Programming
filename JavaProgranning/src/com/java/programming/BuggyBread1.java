package com.java.programming;

import java.util.HashSet;
import java.util.Set;

public class BuggyBread1 {

	public static void main(String[] args) {
	Set<Day> set= new HashSet<Day>();
	
	set.add(Day.MONDAY);
	set.add(Day.TUESDAY);
	set.add(Day.WEDNESDAY);
	set.add(Day.THURSDAY);
	set.add(Day.FRIDAY);
	set.add(Day.SATURDAY);
	set.add(Day.SUNDAY);
	set.add(Day.THURSDAY);
	for(Day day: set) {
		
	System.out.println(day);	
	}
	
	}

}
