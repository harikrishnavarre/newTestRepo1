package grid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {

	public WebDriver driver;
	@Test
	public void testTest6() throws Exception {
		driver.get("http://rightstart.com");
		Thread.sleep(15000);
	}
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
