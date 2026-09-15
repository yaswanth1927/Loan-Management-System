
	package com.lms;

	public class Validation {

	    public static boolean isValidPhone(String phone) {
	        return phone.matches("[6-9]{1}[0-9]{9}");
	    }

	    public static boolean isValidAadhar(String aadhar) {
	        return aadhar.matches("[1-6]{1}[0-9]{11}");
	    }

	    public static boolean isValidPAN(String pan) {
	        return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	    }
	}

