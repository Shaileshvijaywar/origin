package com.tata;


import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MarutiXL6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("hi");
		Thread.sleep(2000);
		System.out.println(driver.toString());
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getClass());
		//driver.close();
		String s = driver.getWindowHandle();
		System.out.println(s);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		s1.size();
		System.out.println(s1.size());
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.toString());
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();
		
      
		for(String all:s1)
		{
			driver.switchTo().window(all);
			String tit = driver.getTitle();
			System.out.println(tit);
			Thread.sleep(2000);
			driver.quit();
		}
	}

}
