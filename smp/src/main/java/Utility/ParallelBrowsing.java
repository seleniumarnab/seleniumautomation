package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelBrowsing {
	
	WebDriver driver=null;
		
		public void setup(String browsername){
			
			
			System.out.println("Browser name:"+browsername);
			System.out.println("Current thread :"+Thread.currentThread().getId());
			
			if(browsername.equalsIgnoreCase("Chrome")) {
				System.setProperty("webDriver.chrome.driver","F:\\gitclonerepo\\smp\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","F:\\gitclonerepo\\smp\\driver\\geckodriver.exe");
				driver=new FirefoxDriver();
				}			
			
			driver.get("https://www.google.co.in/");
			}
		}

