package myspring.di.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanJunitTest {

	@Test //실행 시키려면 제일 중요
	void hello() {
		//1. Bean Container 객체생성
		BeanFactory factory = new GenericXmlApplicationContext("classpath:spring-beans.xml"); // 컨테이너 역할
	}
}
