package NIT.com.nt.SetterInjection;

import org.springframework.stereotype.Component;


public class Message {
	
	private String message;
	public Message() {
		
	System.out.println("Message.Message()");
	}
	public void setMessage(String message) {
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
