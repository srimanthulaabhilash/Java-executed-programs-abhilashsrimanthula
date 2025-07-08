package com.localdateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentDate {
	public static void main(String[] args) {
		LocalDate currentFDate = LocalDate.now();
		System.out.println(currentFDate);

		LocalDateTime timeanddate = LocalDateTime.now();
		System.out.println(timeanddate);
		
		

	}

}
