package concept_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class print_urlsourcetitle {
@Test
public void sourcetitleurl() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/amazonprime");
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	Thread.sleep(5000);
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
