package com.tns.functionalinterface;

//demo for functional interface
@FunctionalInterface

public interface Greeting {
	
	//abstarct method(SAM)
	void greet();
	//concrete method
	default void show() {
}
	default void print() {
		
	}
	}
