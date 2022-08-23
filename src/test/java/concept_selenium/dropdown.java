package concept_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {
@Test
public void dropdown() throws Exception {
	
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/amazonprime");
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	Select down=new Select(driver.findElement(By.id("searchDropdownBox")));
	down.selectByVisibleText("Amazon Devices");
	
	//Thread.sleep(5000);
	//driver.quit();
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
