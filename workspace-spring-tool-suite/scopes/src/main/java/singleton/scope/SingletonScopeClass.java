package singleton.scope;

public class SingletonScopeClass {

	private String object_info;
	
	void setMessage(String msg) {
		this.object_info = msg;
	}
	
	void getMessage(){
		System.out.println("Object Info : " + object_info);
	}
	
}
