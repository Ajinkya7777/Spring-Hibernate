package com.nt.scopes;

public class Printer {

	private String printer;
	
	public Printer() {
		System.out.println(" Inside the Printer constructor");
	}
	
	public void setPrinter(String printer) {
		this.printer = printer;
	}
	public String getPrinter() {
		return printer;
	}
}
