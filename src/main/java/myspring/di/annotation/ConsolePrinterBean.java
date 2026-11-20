package myspring.di.annotation;

public class ConsolePrinterBean implements Printer {
	public ConsolePrinterBean() {
		System.out.println(this.getClass().getName() + " 기본생성자 호출됨!");
	}
	
	public void print(String message) {
		System.out.println(message);
	}
}
