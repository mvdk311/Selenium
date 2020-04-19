package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String x = driver.getCurrentUrl();
		System.out.println(x);
	}

}
