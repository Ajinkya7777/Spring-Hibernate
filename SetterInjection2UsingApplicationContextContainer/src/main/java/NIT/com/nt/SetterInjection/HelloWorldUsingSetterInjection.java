package NIT.com.nt.SetterInjection;

public class HelloWorldUsingSetterInjection {

		private Message message;
		public HelloWorldUsingSetterInjection() {
			
			System.out.println("HelloWorldUsingSetterInjection.HelloWorldUsingSetterInjection()");
			

	}
	
		public void setMessage(Message message) {
			this.message = message;
		}
		public Message getMessage() {
			return this.message;
		}
		
}
