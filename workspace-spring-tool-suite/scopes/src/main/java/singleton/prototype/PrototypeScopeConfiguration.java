package singleton.prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("singleton.prototype")
public class PrototypeScopeConfiguration {
	@Bean
	public Singleton getSingleton() {
		return new Singleton();
	}
}
