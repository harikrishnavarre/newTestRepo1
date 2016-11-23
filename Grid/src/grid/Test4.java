package grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class Test4 {
 
 public WebDriver driver;
 
 @Parameters({"browser"})
 @BeforeClass
 public void beforeClass(String browser) throws MalformedURLException{
  DesiredCapabilities capability= new DesiredCapabilities();
  capability.setBrowserName(browser);
  	  driver = new RemoteWebDriver(new URL("http://192.168.0.1:4444/wd/hub"),capability);
  	
 }
  
 @Test
 public void search() throws Exception {
	 driver.get("http://www.bing.com");
	 driver.findElement(By.id("sb_form_q")).sendKeys("grid testing");
	 Thread.sleep(15000);
  
 }
 

 @AfterClass
 public void afterClass(){
  //driver.quit();
 }
  
}