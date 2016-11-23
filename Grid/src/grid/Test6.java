package grid;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test6 {

	public WebDriver driver;
	@Test
	public void testTest6() throws Exception {
		driver.get("http://rightstart.com");
		Thread.sleep(15000);
	}
	@Parameters({"browser"})
	@BeforeClass
	public void beforeClass(String browser) throws Exception {
		DesiredCapabilities capability= new DesiredCapabilities();
		capability.setBrowserName(browser);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
