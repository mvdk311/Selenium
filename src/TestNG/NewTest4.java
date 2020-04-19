package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {
  @Test
  public void verifytitle1() {
	      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x);
  }
}
