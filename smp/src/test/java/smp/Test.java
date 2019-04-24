package smp;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utility.ParallelBrowsing;

public class Test {
	
	ParallelBrowsing obj;
	
	@BeforeTest
	@Parameters("browsername")
	public  void openurl(String browsername) {
		
		obj=new ParallelBrowsing();
		
		obj.setup(browsername);
		
	}
	
	@org.testng.annotations.Test
	
	public void test() {
		
		
		System.out.println("Exe");
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
