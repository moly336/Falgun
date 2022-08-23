package concept_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseover {

@Test
public void mouse() throws Exception {
	
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	//how to handle mouse over
	Actions over=new Actions(driver);
	over.moveToElement(driver.findElement(By.linkText("Motors"))).build().perform();
	//driver.findElement(By.xpath("//h4[text()='Vehicles']")).click();
	driver.findElement(By.linkText("Cars & Trucks")).click();
	
	//how to handle scroll down
	((JavascriptExecutor)driver).executeScript("scroll(0,800)" );
	
	
	
	Thread.sleep(5000);
	driver.quit();
	
}
	
	
}
