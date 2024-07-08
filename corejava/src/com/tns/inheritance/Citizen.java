package com.tns.inheritance;

public class Citizen {
	
	private String name;
	private long aadharno;
	private String address;
	private long phoneno;
	
	//default 
	
	public Citizen() {
		
	}
	
	//parameter
	
	public Citizen(String name, long addharno, String address, long phoneno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phoneno = phoneno;
	}
	
	//getter and setter


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAddharno() {
		return aadharno;
	}

	public void setAddharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phoneno=" + phoneno
				+ "]";
	}
	

}
