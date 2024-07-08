package com.tns.inheritance;

//demo for multi-level inheritance

public class State extends Country {  //child class and derived class
	
	//
public String statename;
public String statecapital;

//getter and setter 

public String getStatename() {
	return statename;
}
public void setStatename(String statename) {
	this.statename = statename;
}
public String getStatecapital() {
	return statecapital;
}
public void setStatecapital(String statecapital) {
	this.statecapital = statecapital;
}

}
