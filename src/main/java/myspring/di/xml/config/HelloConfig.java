package myspring.di.xml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:values.properties")
public class HelloConfig {
	
	//<bean id="strPrinter" class ="myspring.di.xml.StringPrinter"/>
	@Bean

}
