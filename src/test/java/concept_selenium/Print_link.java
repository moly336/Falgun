package concept_selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_link {

	@Test
	
	
	public void printlink() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/amazonprime");
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		List<WebElement> listoflink=driver.findElements(By.tagName("a"));
		
		System.out.println(listoflink.size());
		for(int a=0;a<listoflink.size();a++) {
		
		System.out.println(listoflink.get(a).getAttribute("href"));
		}
	
		driver.quit();
	
	
	
	
	
	
	
	
	
	}
}
