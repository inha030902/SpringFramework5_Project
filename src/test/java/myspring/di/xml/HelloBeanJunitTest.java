package myspring.di.xml;

//Assertions 클래스의 모든 static 메서드를 임포트 한다
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanJunitTest {

	@Test //실행 시키려면 제일 중요
	void hello() {
		//1. Bean Container 객체생성
		BeanFactory factory = new GenericXmlApplicationContext("classpath:spring-beans.xml"); // 컨테이너 역할 
		
		//2. Hello Bean을 Container에게 요청하기
		// Hello hello = factory.getBean("hello"); 이렇게 쓰면 hello가 object 타입이라서 오류 남
		
		//2. Hello Bean을 Container에게 요청하기 Bean의 id를 기준으로 Bean을 요청하기
		Hello helloById = (Hello)factory.getBean("hello");
		
		//2-1. Hello Bean을 Container 에게 요청하기 Bean의 id와 Type을 기준으로 Bean을 요청하기
		Hello helloByType = factory.getBean("hello", Hello.class);
		
		//2개의 Hello Bean의 주소비교
		System.out.println(helloById == helloByType);
		//assertSame() 메서드 사용해서 주소 비교
		assertSame(helloById, helloByType);
		
		//setName() Injection을 검증하기 - 값 비교
		assertEquals("Hello 스프링", helloByType.sayHello());
		
		//setPrinter() Injection을 검증하기
	}
}
