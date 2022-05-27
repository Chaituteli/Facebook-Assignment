package com.vstl.loops.constructor;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class currentDate {

	public void CureentDate() {
	String date=new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
	System.out.println(date);
	}
  
	
	public void currentDateTime() {
	   
		Date date=new Date(System.currentTimeMillis());
       System.out.println(date);
        
}  
	public void LocalDate() {
		ChronoLocalDate LD=java.time.LocalDate.now();
		System.out.println(LD);
	}
	
	public void localTime() {
		LocalDateTime LDT= LocalDateTime.now();
		System.out.println(LDT);
	}
	
	
	
	
	
	
	
	
	
    }
