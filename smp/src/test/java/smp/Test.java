package smp;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utility.ParallelBrowsing;

public class Test {
	
	ParallelBrowsing obj;
	
	
	@BeforeTest
	@Parameters("browsername")
	
	//test
	public  void openurl(String browsername) {
		
		obj=new ParallelBrowsing();
		obj.setup(browsername);
	
	}
	
	@org.testng.annotations.Test
	
	public void test() {
		
		//driver.sw
		
	}
	
//	(retryAnalyzer=Utility.RetryAnalyzer.class) Used for particular testcase re execution under test annotation
	
/*@org.testng.annotations.Test
	
	public void test2() {
		System.out.println("Exe");
		Assert.fail("Test fail");
	}


@org.testng.annotations.Test

public void test3() {
	System.out.println("Exe");
	//Assert.fail("Test fail1");
}*/

}
