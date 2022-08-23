package concept_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class printvaluealert {
@Test
public void valuealert() {
	
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	//WebElement login=driver.findElement(By.id("login2"));
	//login.click();
	//different way to click
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", driver.findElement(By.id("login2")));
	
	WebElement login1=driver.findElement(By.xpath("//button[text()='Log in']"));
	login1.click();
	//handle alert
	driver.switchTo().alert().accept();
	WebElement name=driver.findElement(By.id("loginusername"));
	name.sendKeys("moly");
	//print value in console
	String name1=driver.findElement(By.id("loginusername")).getAttribute("value");
	System.out.println(name1);
	
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
