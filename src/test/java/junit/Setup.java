package junit;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

public class Setup {

	@BeforeClass
	static void setUpBeforeClass() throws Exception {
		System.out.println("TESTING BEFOREALL");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}