package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class verifytitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String x = driver.getTitle();
		System.out.println(x);		
	}

}
