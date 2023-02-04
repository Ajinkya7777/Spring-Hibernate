package com.nt.scopes;

public class PrinterSingelton {

		private static PrinterSingelton printer;
	 private PrinterSingelton() {
		 System.out.println(" Inside the Private constructor");
	 }
	 
	 public static PrinterSingelton getInstance() {
		 if (printer==null) {
			 
			 printer=new PrinterSingelton();
		}
		 return printer;
	 }
	 
	 

}
