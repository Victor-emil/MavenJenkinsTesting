package MavenJenkinsTest.MavenJenkins;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestApp1 {

	@Test
	public void testPrintHelloWorld() {

		assertEquals(App.getHelloWorld(), "Hello World");
	}

	}
