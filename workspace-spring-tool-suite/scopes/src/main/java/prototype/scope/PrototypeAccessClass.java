package prototype.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeAccessClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("prototypeSpring.xml");
		
		PrototypeScopeClass prototype = (PrototypeScopeClass) context.getBean("prototypeBean");
		System.out.print("After creaing Object 1 : ");
		prototype.setMessage("This is from protype object 1");
		prototype.getMessage();
		
		System.out.print("This is from Object 2 : ");
		//Different Instance will be created .. !
		PrototypeScopeClass prototype_2 = (PrototypeScopeClass) context.getBean("prototypeBean");
		
		prototype_2.getMessage();
	}
	
}
