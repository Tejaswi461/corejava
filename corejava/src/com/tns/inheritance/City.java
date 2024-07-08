package com.tns.inheritance;

//demo for multi-level inheritance

public class City extends State{
	
	//variable
	
	public String cityname;
	public int citycode;
	
	//gettr and setter

	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getCitycode() {
		return citycode;
	}
	public void setCitycode(int citycode) {
		this.citycode = citycode;	
	}
}
