package MavenJenkinsTest.MavenJenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationTest {
	
	@Test
	public void testCalc() {
		assertEquals(App.getCalculation(2, 2), 4);
	}
}
