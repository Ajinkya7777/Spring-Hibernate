package com.nt.scopes;

public class HelloWorldUsingSetterInjection {

		private Message message;
		public HelloWorldUsingSetterInjection() {

	}
	
		public void setMessage(Message message) {
			this.message = message;
		}
		public Message getMessage() {
			return message;
		}
		
}
