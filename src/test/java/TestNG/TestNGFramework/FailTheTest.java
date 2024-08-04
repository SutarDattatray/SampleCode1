package TestNG.TestNGFramework;

import org.testng.annotations.Test;

public class FailTheTest {
	@Test
	public void sampleAutomation() {
		
		int a=10/0; //get Arithmetic exception
		
		System.out.println("fail the test");
	}

}
