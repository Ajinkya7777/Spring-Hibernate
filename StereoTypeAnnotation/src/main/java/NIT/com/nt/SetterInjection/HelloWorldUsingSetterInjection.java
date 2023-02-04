package NIT.com.nt.SetterInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component("TargetMessage")
@Scope ("singleton")
//@Lazy (true)

   
public class HelloWorldUsingSetterInjection {
	
	public HelloWorldUsingSetterInjection() {

	System.out.println("HelloWorldUsingSetterInjection.HelloWorldUsingSetterInjection()");
	}

	@Autowired
	private Message message;
	

		public Message getMessage() {
			System.out.println("message");
		return this.message;
	}

}

