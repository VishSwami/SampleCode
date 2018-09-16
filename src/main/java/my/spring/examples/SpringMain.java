package my.spring.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		System.out.println("Loading ApplicationContext");
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml"); // gets and loads the ApplicationContext file
		ac.close();
	}
}
