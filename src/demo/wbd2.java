package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbd2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		//driver.findElementByLinkText("Afbeeldingen").click();
		driver.findElement(By.xpath("//a[@href='https://www.google.nl/imghp?hl=nl&tab=wi&ogbl']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
	}

}
