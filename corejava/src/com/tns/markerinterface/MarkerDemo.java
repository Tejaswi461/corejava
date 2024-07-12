package com.tns.markerinterface;

public class MarkerDemo {
	
	public static void main(String[] args) {
		
		Student ob=new Student(504,"Tejaswi","cse");
		if(ob instanceof Register)
			
			System.out.println("Student is registered");
		else
			System.out.println("student is not registered");
		
	}

}
