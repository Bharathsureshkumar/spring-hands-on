package singleton.prototype;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeService {

	private String time = LocalDateTime.now().toString();
	
	public String getTime() {
		return "The object time : " + time;
	}
		
}
