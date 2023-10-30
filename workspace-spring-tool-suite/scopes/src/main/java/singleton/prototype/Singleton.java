package singleton.prototype;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Singleton {

//	@Autowired
//	private PrototypeService prototype;
	
	
//	@Autowired
//	private ApplicationContext context;
	
	@Autowired
	private ObjectFactory<PrototypeService> prototypeServiceProvider;
	
	public String getTime() {
//		Instead of spring injection we request container's to give stance
//		return "Current time is : " + context.getBean(PrototypeService.class).getTime() + " .. !";
		
		return "Current Time is : " + prototypeServiceProvider.getObject().getTime() + " .. !";
		
	}
	
//	Method Injection
//	@Lookup
//	public PrototypeService prototypeService() {
//		return null;
//	}
	
}
