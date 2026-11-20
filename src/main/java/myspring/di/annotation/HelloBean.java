package myspring.di.annotation;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	String name;
	PrinterBean printer;
	List<String> names;

	public HelloBean() {
		System.out.println(this.getClass().getName() + " 기본생성자 호출됨!");
	}

	public HelloBean(String name, PrinterBean printer) {
		System.out.println(this.getClass().getName() + " 오버로딩 생성자 호출됨!");
		this.name = name;
		this.printer = printer;
	}

	public List<String> getNames() {
		return this.names;
	}

	public void setNames(List<String> list) {
		this.names = list;
	}

	public String sayHello() {
		return "Hello " + name;
	}

	public void print() {
		this.printer.print(sayHello());
	}

}
