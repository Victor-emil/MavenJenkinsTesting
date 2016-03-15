package MavenJenkinsTest.MavenJenkins;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestApp2 {

	@Test
	public void testPrintHelloWorld2() {

		assertEquals(App.getHelloWorld2(), "Hello World 2");

	}

}
