package com.tns.inheritance;

public class Student extends Citizen {
	
	private int rollno;
	private String collegename;
	
	//default
	
	public Student() {
		
	}
	//parameter

		public Student(int rollno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}
		
		public Student(String name,long aadharno,String address,long phoneno) {
		super(name,aadharno,address,phoneno);
		}

		//getter and setter

		
		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getCollegename() {
			return collegename;
		}

		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}

		@Override
		public String toString() {
			return super.toString() + "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
		}


}
