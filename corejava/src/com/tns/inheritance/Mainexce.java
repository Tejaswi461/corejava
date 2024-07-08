package com.tns.inheritance;

//demo for multi-level inheritance

public class Mainexce {
	public static void main(String[] args) {
		
		//instance
		City c=new City();
		
		c.setCountryname("india");
		c.setCountrycapital("dehli");
		c.setStatename("telangana");
		c.setStatecapital("hyderbad");
		c.setCityname("Alladhurg");
		c.setCitycode(502269);
		
		System.out.println(c.countryname);
		System.out.println(c.countrycapital);
		System.out.println(c.statename);
		System.out.println(c.statecapital);
		System.out.println(c.cityname);
		System.out.println(c.citycode);
	}
}
