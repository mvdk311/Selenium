package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_o")).sendKeys("testing");
		driver.findElement(By.id("u_0_q")).sendKeys("Selenium");
	}

}
