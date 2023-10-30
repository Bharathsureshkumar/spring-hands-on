package prototype.scope;

import org.springframework.beans.factory.annotation.Autowired;

public class PrototypeScopeClass {

	private String message;
	
	public void setMessage(String msg) {
		
		this.message = msg;
		
	}
	
	public void getMessage() {
		System.out.println("Object Message : " + this.message);
	}
	
	
}
