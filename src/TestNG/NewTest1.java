package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void verifytitle() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x);
  }
  
  @Test
  public void verifyurl() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String x = driver.getCurrentUrl();
		System.out.println(x);
		Assert.assertEquals(x,"www.edureka.com");
  }
}
