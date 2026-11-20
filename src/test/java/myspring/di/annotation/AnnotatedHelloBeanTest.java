package myspring.di.annotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Resource;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-beans-annot.xml")
public class AnnotatedHelloBeanTest {
	@Autowired
	HelloBean hello;
	
	@Autowired
	PrinterBean stringPrinter;
	
	@Autowired
	@Qualifier("stringPrinter")
	PrinterBean printer; //stringprinter로 받지 않는 이유는 상위 인터페이스가 printer가 있기 때문 대부분 상위 인터페이스로 받음
	
	@Resource(name = "stringPrinter")
	PrinterBean printerResource;
	
	@Autowired
	HelloBeanCons helloCons;
	
	@Test
	void hello_constructor() {
		assertEquals("Hello 어노테이션생성자", helloCons.sayHello());
		helloCons.print();
		
		for (String name : helloCons.getNames()) {
			
		}
	}
	
	@Test // @Disabled
	void hello() {
		assertEquals("Hello 어노테이션", hello.sayHello());
		hello.print();
		
		assertEquals("Hello 어노테이션", stringPrinter.toString());
		
		assertEquals("Hello 어노테이션", printer.toString());
		
		assertEquals("Hello 어노테이션", printerResource.toString());
	}
	
	
	
	
}
