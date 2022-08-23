package com.amena.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavenamazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]/span")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("customerName")).sendKeys("mini");
		driver.findElement(By.id("ap_email")).sendKeys("01758426852");
		driver.findElement(By.id("ap_password")).sendKeys("amenaakter");
		driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("amenaakter");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(7000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
