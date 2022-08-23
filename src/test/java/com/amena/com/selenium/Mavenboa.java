package com.amena.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavenboa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bankofamerica.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.id("onlineId1")).sendKeys("moly");
		driver.findElement(By.id("passcode1")).sendKeys("amenaakter");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot ID/Password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("acctNumber")).sendKeys("125466");
		Thread.sleep(3000);
		driver.findElement(By.id("reset-no-ssn-link")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("acctNumber")).sendKeys("125466");
		driver.findElement(By.id("atmNumber")).sendKeys("666555");
		driver.findElement(By.id("atmPin")).sendKeys("1234");
		driver.findElement(By.id("btn-continue")).click();
		//driver.findElement(By.id("verifyCustomerAccount")).click();
		Thread.sleep(3000);
		driver.quit();	}

}
