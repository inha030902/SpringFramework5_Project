package myspring.di.xml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import myspring.di.xml.ConsolePrinter;
import myspring.di.xml.Hello;
import myspring.di.xml.Printer;
import myspring.di.xml.StringPrinter;

@Configuration
@PropertySource(value = "classpath:values.properties")
public class HelloConfig {
	
	//<bean id="strPrinter" class ="myspring.di.xml.StringPrinter"/>
	@Bean
	public Printer stringPrinter () {
		return new StringPrinter();
	}
	
	//<bean id="conPrinter" class="myspring.di.xml.ConsolePrinter" />
	@Bean
	public Printer consolePrinter() {
		return new ConsolePrinter();
	}
	
	// <bean id = "hello" class = "myspring.di.xml.Hello" scope = "singleton">
	@Bean
	@Scope
	public Hello hello() {
		Hello hello = new Hello();
		return hello;
	}
}
