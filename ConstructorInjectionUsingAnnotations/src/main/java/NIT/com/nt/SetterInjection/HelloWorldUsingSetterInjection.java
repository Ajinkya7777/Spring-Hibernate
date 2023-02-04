package NIT.com.nt.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloWorldUsingSetterInjection {

	// there are three type of autowired injections
	// 1) field level injection
	// 2) constructor level injection
	// 3) settter level injection

	// @Autowired //field level injection
	// @Qualifier("message")
	// @Autowired(required = true) //field level injection ( the dependent spring
	// bean cfg must be available or exception will raise)
	// @Autowired(required = false) //field level injection ( though dependent
	// spring bean is not available there is no problem , it prints null value)
	
	//NOTE:- while performing @Qualfier on multiple fields such as field level , constructor level ( inside the parameter) , and 
	// orbitory method at last orbitory method will be executed bcz it will override the value given in orbitory qualifier.
	
	private Message message;

	@Autowired
	public HelloWorldUsingSetterInjection( @Qualifier("msg2") Message message) {
		super();
		this.message = message;
	}
	
	@Autowired
	@Qualifier("message")
	public void orbitoryMethod(Message message) {
		System.out.println("inside the Orbitory method");
		this.message = message;
	}
		
		@Autowired
		@Qualifier("message")
		public void setMessage(Message message) {
			this.message = message;
		}

	public Message getMessage() {
		return this.message;
	}

}

/*
 * When there is no msg id present in xml file and our autowired is true then we
 * will get following error :- Caused by:
 * org.springframework.beans.factory.NoSuchBea nDefinitionException: No
 * qualifying bean of type 'NIT.com.nt.SetterInjection.Message' available:
 * expected at least 1 bean which qualifies as autowire candidate. Dependency
 * annotations:
 * {@org.springframework.beans.factory.annotation.Autowired(required=true)}
 */