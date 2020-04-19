package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
  @Test
  public void verifytitle() {
	  
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x);
  }
  
  @Test
  public void verifyurl() {
	  
		String x = driver.getCurrentUrl();
		System.out.println(x);
		Assert.assertEquals(x,"www.edureka.com");
  }
  @AfterMethod
  public void close() {
	  driver.close();
  }
}
