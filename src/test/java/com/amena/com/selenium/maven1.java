package com.amena.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maven1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"navChecking\"]/span[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Schedule an Appointment")).click();
		driver.findElement(By.name("Everyday Banking")).click();
		Thread.sleep(3000);
		driver.quit();		
		
		
		
		
	}

}
