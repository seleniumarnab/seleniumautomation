package smp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowsing{
	
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters("browsername")
	public void setup(String browsername){
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			
		
		System.setProperty("webDriver.chrome.driver",".\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Maven_Workspace\\smp\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			
			
		}
	}
		
	@Test
  
  public void openwithchrome() {
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
	
	//List <WebElement> st= driver.findElements(By.xpath("//*[@id='customers']/tbody"));
	List <WebElement> st1= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
	List <WebElement> st2= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td"));
	
	System.out.println(st1.size());
	
	
	String beforexpath="//*[@id='customers']/tbody/tr[";
	String afterxpath="]/td[2]";
	
	
	for(int i=2;i<=st1.size();i++) {
		
		String actualxpath= beforexpath+i+afterxpath;
		WebElement rowval=driver.findElement(By.xpath(actualxpath));
		System.out.println(rowval.getText());
		
	}
	
	
	/*for(WebElement s:st1) {
		
		
		String a=s.getText();
		
		System.out.println(a);
		
	}*/

	
	
	
		
  }
	
	/*@Test
	  
	  public void openwithfirefox() {
			
			System.out.println("Firefox");
			driver.get("https://www.google.com");
	  }
	
	@Test
	  
	  public void openwithie() {
			
			System.out.println("ie");
			driver.get("https://www.google.com");
	  }
	*/
	
	
	
}
