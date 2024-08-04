package TestNG.TestNGFramework;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTheTest {
	@Test
	public void sampleCode() throws Exception {
		int age = 5;
		
		if(age<18) {
			
			throw new SkipException("Age can not be less than 18");
		}
		
	}

}
