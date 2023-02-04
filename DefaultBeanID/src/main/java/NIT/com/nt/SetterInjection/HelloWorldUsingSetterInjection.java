package NIT.com.nt.SetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HelloWorldUsingSetterInjection {


	
	private Message message;

	@Autowired
	public HelloWorldUsingSetterInjection( @Qualifier("msg") Message message) {
		super();
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