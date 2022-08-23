package com.amena.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mavenamazonprime {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe")	;
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/amazonprime");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(6000);
		driver.findElement(By.name("a-dynamic-image p13n-sc-dynamic-image p13n-product-image")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"expansion-14\"]/div/div/div[2]/div[2]/div[1]/a/span/div")).click();
		driver.findElement(By.name("submit.addToCart")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"contentGrid_866748\"]/div/div/div[3]/div/div/a/img")).click();
		Thread.sleep(6000);
		driver.quit();
		
		
	}

}
