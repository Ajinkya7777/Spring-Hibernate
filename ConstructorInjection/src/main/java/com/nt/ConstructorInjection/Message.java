package com.nt.ConstructorInjection;

public class Message {
	
	private String message;
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public void setMessage(String message) {
		
		System.out.println("Inside setter method to set message of dependency class");
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
	
}
