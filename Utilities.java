package com.vstl.loops.constructor;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Random;

    public class Utilities {
	public static String getOpenBrowser(String strbrowser) {
		strbrowser="";
		String strbrwoser=("click on open");
		System.out.println("open Browser");
		return strbrowser;
	}
	
	//Random first name
     public static String getFirstRandomName() {
	String strRandomName="";
	String strArray[]= {"Aditi","Priyanka","Ekta","Aditi","Priti","jyoti","Rahul","rakesh","Pradip"};
	strRandomName=  ("Facebook Name:"+strArray[new Random().nextInt(strArray.length)]);	
	 return strRandomName;
	}
   
   //Random last Name
     public static String getRandomLastName() {
	String strRandomLastName="";
	String strArray[]= {"teli","patil","patane","Modi","vibhute","Maratha","Ganger","khandekar","khanapure"};
	strRandomLastName=("Facebook last Name:"+strArray[new Random().nextInt(strArray.length)]);
	return strRandomLastName;
       }
    
   //random current Date
	public String getCureentDate() {
	String date=new SimpleDateFormat("yyyy_MM_dd HH_mm_ss").format(Calendar.getInstance().getTime());
		
	return date ;
		}

	//Random Mobile Number
	  public String getMobileNumber1(int intLength) {
	
     String strArray[] = {"94","87","90","95","78"};		
	 String strFirstNumber = strArray[new Random().nextInt(strArray.length)];  		
	   		
			
	 String allowChars="0123456789";
	 String Randomstring="";
	
	  for(int intIndex=0;intIndex<intLength-2;intIndex++) {
	  int intNum=(int) Math.floor(Math.random()*allowChars.length());
	  Randomstring+=allowChars.substring(intNum,intNum+1);
	   }
	  return strFirstNumber.concat(Randomstring).trim();
	  }
	
	//Random date of birth
	public String getRandomBOD() {
		try {
			String strRandomDate="";
			int randomDate=(int)(Math.random()*10);
			if(randomDate==0);
			strRandomDate="31";
			strRandomDate+=String.valueOf(randomDate).trim();
			return strRandomDate;
		}catch (Exception exception) {
			System.out.println("Error message :"+exception.getMessage());
			return "";
		}
		}
      
	//Random string with number
		public String getRandomNumberWithString(int intLength) {
		String allowCharsa="GHFDHGFUGTYGFBD897543224";
		String Randomstring="";
		
		for(int intIndex=0;intIndex<intLength;intIndex++) {
			int intNum=(int)Math.floor(Math.random()*allowCharsa.length());
			Randomstring+=allowCharsa.substring(intNum,intNum+1);
		}
		return Randomstring;
		}
		
		
		//Random string, Number with special characters
     public String getRandomNumberWithChar(int intLeght) {
			
			String allowChar ="ABCd123$%&#@*";
			String randomString = " ";       
			      		
		for(int intIndex=0; intIndex<intLeght; intIndex++) {
				int intNum =(int) Math.floor(Math.random()*allowChar.length());
				
				randomString+=allowChar.substring(intNum,intNum+1);			
			}	 
		return randomString;    
	        }
		

	
}

