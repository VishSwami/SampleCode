package junit;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import my.spring.examples.SpringMain;

import org.apache.log4j.Logger;
public class BasicTest {
	
	static Logger log = Logger.getLogger(BasicTest.class.getName());
	SpringMain m = Mockito.mock(SpringMain.class);
	@BeforeClass
	public static void setup() {
		System.out.println("HELLO WORLD");
		log.addAppender(log.getAppender("file"));
		log.debug("dank");
	}

	
	@Test(expected = IOException.class)
	public void sampleTest() throws IOException {
		Mockito.when(m.test()).thenReturn(null);
	}

}