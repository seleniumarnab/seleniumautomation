package smp;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Test {
	
	@AfterTest
	
	//3rd commit.
	public void test() {
		System.out.println("Exe");
	}
	
//	(retryAnalyzer=Utility.RetryAnalyzer.class) Used for particular testcase re execution under test annotation
	
@org.testng.annotations.Test
	
	public void test2() {
		System.out.println("Exe");
		Assert.fail("Test fail");
	}


@org.testng.annotations.Test

public void test3() {
	System.out.println("Exe");
	//Assert.fail("Test fail1");
}

}
