package smp;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Test_1 {
	
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webDriver.chrome.driver","F:\\gitclonerepo\\smp\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
  }

  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
	  
	  Set<String> handels=driver.getWindowHandles();
	  
	  Iterator<String> s=handels.iterator();
	  
	  String parent= s.next();
	  
      System.out.println("Parent window id " + parent + driver.getTitle());
      
      String child= s.next();
      
      
      driver.switchTo().window(child);
      
      Thread.sleep(10000);
      
      System.out.println("Child window id: "+child+driver.getTitle());
      
      driver.close();
      
      driver.switchTo().window(parent);
      
      
      
      System.out.println("After child window killing" + parent + driver.getTitle());
      
	  
 }
  
  
  
}
