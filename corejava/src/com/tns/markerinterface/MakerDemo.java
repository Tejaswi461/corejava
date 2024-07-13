package com.tns.markerinterface;

public class MakerDemo {
	public static void main(String[] args) {
		
		Student ob=new Student(511,"Tejaswi","cse");
		
		if(ob instanceof Register)
			
			System.out.println("student is registered");
		
		else
			System.out.println("student is not registered");
			
			
	}

}
