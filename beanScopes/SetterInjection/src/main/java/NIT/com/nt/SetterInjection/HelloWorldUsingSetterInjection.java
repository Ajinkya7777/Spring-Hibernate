package NIT.com.nt.SetterInjection;

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
