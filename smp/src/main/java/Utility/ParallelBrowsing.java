package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelBrowsing {
	
	WebDriver driver;
		
		
		public void setup(String browsername){
			
			
			
			if(browsername.equalsIgnoreCase("Chrome")) {
				
			
			System.setProperty("webDriver.chrome.driver","D:\\gitrepo\\seleniumautomation\\smp\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			
			else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\gitrepo\\seleniumautomation\\smp\\driver\\geckodriver.exe");
				driver=new FirefoxDriver();
				}
			
			driver.get("https://www.google.com/");
		}
		

	}

