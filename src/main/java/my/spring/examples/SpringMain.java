package my.spring.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpringMain {
	public static void main(String[] args) {
		log.info("Opening XmlApplicationContext");
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml"); // gets and loads the ApplicationContext file
		ac.close();
	}
}
