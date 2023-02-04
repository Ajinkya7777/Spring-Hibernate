package com.nt.ConstructorInjection;

public class HelloWorldUsingConstructorInjection {

		private Message message;
		public HelloWorldUsingConstructorInjection(Message message) {
			System.out.println("HelloWorldUsingConstructorInjection: Inside Constructor class which is target class to perform Constructor injection");
			this.message=message;
	}
	
		public void setMessage(Message message) {
			this.message = message;
		}
		public Message getMessage() {
			return message;
		}
		
}
