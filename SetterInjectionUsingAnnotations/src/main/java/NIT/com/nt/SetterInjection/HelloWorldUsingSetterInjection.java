package NIT.com.nt.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloWorldUsingSetterInjection {

	//there are three type of autowired injections 
	  //1) field level injection 
	//2) constructor level injection 
	//3) settter level injection 
		
	@Autowired  //field level injection 
	@Qualifier("message")
	//@Autowired(required = true)  //field level injection ( the dependent spring bean cfg must be available or exception will raise)
	//@Autowired(required = false)  //field level injection ( though dependent spring bean is not available there is no problem , it prints null value) 
		private Message message;
	
		
		public Message getMessage() {
			return this.message;
		}
		
}

   /* When there is no msg id present in xml file and our autowired is true then we will get following error :-
Caused by: org.springframework.beans.factory.NoSuchBea
nDefinitionException: No qualifying bean of type 'NIT.com.nt.SetterInjection.Message' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
*/