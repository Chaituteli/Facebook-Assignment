package com.vstl.loops.constructor;

public class TestFacbook extends Utilities{

	public static void main(String[] args) {
		Facebook objFacebook=new Facebook();
		Utilities objUtilities=new Utilities();
		
		objFacebook.setOpenBrowser(null);
		
		objFacebook.setRandomFirstName(objUtilities.getFirstRandomName());
	    
		objFacebook.setRandomLastName(objUtilities.getRandomLastName());
		
		objFacebook.setLocalDate(objUtilities.getCureentDate());
		
		objFacebook.setMobileNumber(objUtilities.getMobileNumber1(10));
		
		objFacebook.setRandomBOD(objUtilities.getRandomBOD());
		
		objFacebook.setRandomNumberWithString(objUtilities.getRandomNumberWithString(13));
		
		objFacebook.setRandomNumberWithchar(objUtilities.getRandomNumberWithChar(12));
		
	}

}
